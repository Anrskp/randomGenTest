package com.anders.cphbusiness.controller;

import com.anders.cphbusiness.numbersModel.jsonResponse;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.anders.cphbusiness.repositories.wagerBoardMarksRepo;
import com.anders.cphbusiness.entitiesModel.*;

import java.util.Date;
import java.util.ArrayList;
import java.util.Collections;

@RestController
public class restController {

    // FIELDS
    @Autowired
    private wagerBoardMarksRepo repo;

    private randomTestController testCtrl = new randomTestController();

    // CONSTRUCTOR
    public restController() {
    }

    // METHODS
    @RequestMapping(value = "/rngCheck", method = RequestMethod.GET)
    public
    @ResponseBody
    jsonResponse rngCheck() {

        ArrayList<Integer> randomNumbers = new ArrayList<>();
        ArrayList<wagerBoardMarks> seq = new ArrayList<>();
        ArrayList<java.util.Date> dates = new ArrayList<>();

        for (wagerBoardMarks wagerBoardMarks : repo.findAll()) {
            seq.add(wagerBoardMarks);
            randomNumbers.add(wagerBoardMarks.getMarkNumber());
            dates.add(wagerBoardMarks.getMeta_CreatedDate());
        }

        // get sample from-to dates
        Collections.sort(dates);
        Date fromDate = dates.get(0);
        Date toDate = dates.get(dates.size() - 1);

        boolean runsTestRes = testCtrl.runsTest(randomNumbers).isTestConclusion();
        boolean occurrenceTestRes = testCtrl.occurrencesTest(randomNumbers);
        boolean boardSeqTestRes = testCtrl.boardSeqTest(seq);

        boolean testResults = runsTestRes && occurrenceTestRes && boardSeqTestRes;

        if (testResults) {
            return new jsonResponse(true, "Success", fromDate, toDate);
        } else
            return new jsonResponse(false, "Failure", fromDate, toDate);
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
