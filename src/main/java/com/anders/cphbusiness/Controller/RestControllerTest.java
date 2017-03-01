package com.anders.cphbusiness.Controller;

import com.anders.cphbusiness.Model.PrimaryModel.WagerBoardMarks;
import com.anders.cphbusiness.Model.SecondaryModel.StoreDbEnt;
import com.anders.cphbusiness.Model.TestResultsModel.JsonResponse;
import com.anders.cphbusiness.Repositories.primaryRepo.WagerBoardMarksRepo;
import com.anders.cphbusiness.Repositories.secondaryRepo.StoreDbEntRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@RestController
public class RestControllerTest {

    // FIELDS
    @Autowired
    private WagerBoardMarksRepo loadRepo;

    @Autowired
    private StoreDbEntRepo storeRepo;

    private RandomTestController testCtrl = new RandomTestController();

    // METHODS
    @RequestMapping(value = "/rngCheck", method = RequestMethod.GET)
    public
    @ResponseBody
    JsonResponse rngCheck() {

        ArrayList<Integer> randomNumbers = new ArrayList<>();
        ArrayList<WagerBoardMarks> seq = new ArrayList<>();
        ArrayList<java.util.Date> dates = new ArrayList<>();
        /*
        for (WagerBoardMarks wagerBoardMarks : loadRepo.findAll()) {
            seq.add(wagerBoardMarks);
            randomNumbers.add(wagerBoardMarks.getMarkNumber());
            dates.add(wagerBoardMarks.getMeta_CreatedDate());
        }
        */

        List<StoreDbEnt> data = storeRepo.findAll();
        for (StoreDbEnt aData : data) {
            randomNumbers.add(aData.getMarkNumber());
            dates.add(aData.getInsertedDate());
        }


        // get sample from-to dates
        Collections.sort(dates);
        Date fromDate = dates.get(0);
        Date toDate = dates.get(dates.size() - 1);


        boolean runsTestRes = testCtrl.runsTest(randomNumbers).isTestConclusion();
        boolean occurrenceTestRes = testCtrl.occurrencesTest(randomNumbers);
        //boolean boardSeqTestRes = testCtrl.boardSeqTest(seq);

        boolean testResults = runsTestRes && occurrenceTestRes;

        if (testResults) {
            return new JsonResponse(true, "Success", fromDate, toDate);
        } else
            return new JsonResponse(false, "Failure", fromDate, toDate);
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
