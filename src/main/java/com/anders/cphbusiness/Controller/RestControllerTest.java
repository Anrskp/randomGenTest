package com.anders.cphbusiness.Controller;

import com.anders.cphbusiness.Model.SecondaryModel.StoreDbEnt;
import com.anders.cphbusiness.RandomnessTests.TestResults.*;
import com.anders.cphbusiness.RandomnessTests.numberInfo.NumbersInfo;
import com.anders.cphbusiness.Model.Repositories.SecondaryRepo.StoreDbEntRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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
    JsonResponseFinale rngCheck() {

        // fields
        ArrayList<Integer> webMarkNumbers = new ArrayList<>();
        ArrayList<Integer> mobileMarkNumbers = new ArrayList<>();
        ArrayList<Integer> offlineMarkNumbers = new ArrayList<>();

        // Sample date range
        int daysEarlier = 7;
        Date dataToDate = new Date();
        Date dataFromDate = new Date(dataToDate.getTime() - TimeUnit.DAYS.toMillis(daysEarlier));

        List<StoreDbEnt> webData = storeRepo.findByDates(dataFromDate, dataToDate, "web");
        List<StoreDbEnt> mobileData = storeRepo.findByDates(dataFromDate, dataToDate, "mobile");
        List<StoreDbEnt> offlineData = storeRepo.findByDates(dataFromDate, dataToDate, "offline");


        // WEB DATA
        for (StoreDbEnt aData : webData) {
            webMarkNumbers.add(aData.getMarkNumber());
        }

        RunsTestResult webRun = testCtrl.runsTest(webMarkNumbers);
        OccuTestResult webOccu = testCtrl.occurrencesTest(webMarkNumbers);
        BoardSeqTestResult webSeq = testCtrl.boardSeqTest(webData);

        JsonResponseTest webResults = new JsonResponseTest(webRun, webOccu, webSeq);

        // MOBILE DATA
        for (StoreDbEnt aData : mobileData) {
            mobileMarkNumbers.add(aData.getMarkNumber());
        }

        RunsTestResult mobileRun = testCtrl.runsTest(mobileMarkNumbers);
        OccuTestResult mobileOccu = testCtrl.occurrencesTest(mobileMarkNumbers);
        BoardSeqTestResult mobileSeq = testCtrl.boardSeqTest(mobileData);

        JsonResponseTest mobileResults = new JsonResponseTest(mobileRun, mobileOccu, mobileSeq);

        // OFFLINE DATA
        for (StoreDbEnt aData : offlineData) {
            offlineMarkNumbers.add(aData.getMarkNumber());
        }

        RunsTestResult offlineRun = testCtrl.runsTest(offlineMarkNumbers);
        OccuTestResult offlineOccu = testCtrl.occurrencesTest(offlineMarkNumbers);
        BoardSeqTestResult offlineSeq = testCtrl.boardSeqTest(offlineData);

        JsonResponseTest offlineResults = new JsonResponseTest(offlineRun, offlineOccu, offlineSeq);


        // JSON RESPONSE
        return new JsonResponseFinale(dataFromDate, dataToDate, webResults, mobileResults, offlineResults);
    }

    // Static occurrence data
    @RequestMapping(value = "/staticData", method = RequestMethod.GET)
    public
    @ResponseBody
    ArrayList<NumbersInfo> staticData() {
        List<StoreDbEnt> data = storeRepo.findAll();
        ArrayList<Integer> markNumbers = new ArrayList<>();
        for (StoreDbEnt aData : data) {
            markNumbers.add(aData.getMarkNumber());
        }
        // JSON RESPONSE
        return testCtrl.occurrencesData(markNumbers);
    }

}
