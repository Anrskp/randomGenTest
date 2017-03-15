package com.anders.cphbusiness.Controller;

import com.anders.cphbusiness.Model.SecondaryModel.StoreDbEnt;
import com.anders.cphbusiness.RandomnessTests.TestResultsModel.*;
import com.anders.cphbusiness.Repositories.SecondaryRepo.StoreDbEntRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;
import com.anders.cphbusiness.RandomnessTests.TestResultsModel.JsonResponseTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
public class RestControllerTest {

    // FIELDS
    @Autowired
    private StoreDbEntRepo storeRepo;

    private RandomTestController testCtrl = new RandomTestController();

    // METHODS
    @RequestMapping(value = "/rngCheck", method = RequestMethod.GET)
    public
    @ResponseBody
    JsonResponseTest rngCheck() {

        /////
        int daysEarlier = 2;

        Date dataFromDate = new Date();
        Date dataToDate = new Date(dataFromDate.getTime() - TimeUnit.DAYS.toMillis(daysEarlier));

        System.out.println(storeRepo.findWeekOld(dataToDate, dataFromDate));
        /////

        ArrayList<Integer> randomNumbers = new ArrayList<>();
        ArrayList<StoreDbEnt> storeDbEnts = new ArrayList<>();
        ArrayList<java.util.Date> dates = new ArrayList<>();

        // sort into devices. (mobile, offline, web)
        List<StoreDbEnt> data = storeRepo.findAll(new Sort("WagerIdentification", "boardNumber", "markSequenceNumber"));
        for (StoreDbEnt aData : data) {
            randomNumbers.add(aData.getMarkNumber());
            dates.add(aData.getInsertedDate());
            storeDbEnts.add(aData);
        }

        System.out.println(storeDbEnts.size());

        // get sample from-to dates
        Collections.sort(dates);
        Date fromDate = dates.get(0);
        Date toDate = dates.get(dates.size() - 1);

        RunsTestResult runsTest = testCtrl.runsTest(randomNumbers);
        OccuTestResult occurrencesTest = testCtrl.occurrencesTest(randomNumbers);
        BoardSeqTestResult combinationDuplicateTest = testCtrl.boardSeqTest(storeDbEnts);

        boolean allTestPassed = runsTest.isTestPassed() && occurrencesTest.isTestPassed() && combinationDuplicateTest.isTestPassed();

        return new JsonResponseTest(allTestPassed, fromDate, toDate, runsTest, occurrencesTest, combinationDuplicateTest);

    }


    // test request params
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String testThis(
            @RequestParam(value = "startDate", defaultValue = "none selected") String startDate,
            @RequestParam(value = "endDate", defaultValue = "none selected") String endDate,
            @RequestParam(value = "device", defaultValue = "none selected") String device) {

        return "startDate : " + startDate + " endDate : " + endDate + " device : " + device;
    }
}
