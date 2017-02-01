package com.anders.cphbusiness.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.anders.cphbusiness.repositories.wagerBoardMarksRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.anders.cphbusiness.entitiesModel.*;
import com.anders.cphbusiness.numbersModel.testSomething;

import java.util.Date;
import java.util.ArrayList;
import java.util.Collections;

@RestController
public class restController {

    // FIELDS
    @Autowired
    private wagerBoardMarksRepo repo;

    private ArrayList<Integer> randomNumbers = new ArrayList<>();
    private ArrayList<wagerBoardMarks> seq = new ArrayList<>();
    private ArrayList<java.util.Date> dates = new ArrayList<>();

    private randomTestController testCtrl = new randomTestController();

    // CONSTRUCTOR
    public restController() {
    }

    // METHODS
    @RequestMapping("/rngCheck")
    public
    @ResponseBody
    testSomething rngCheck() {

        for (wagerBoardMarks wagerBoardMarks : repo.findAll()) {
            seq.add(wagerBoardMarks);
            randomNumbers.add(wagerBoardMarks.getMarkNumber());
            dates.add(wagerBoardMarks.getMeta_CreatedDate());
        }

        // get sample dates
        Collections.sort(dates);
        Date fromDate = dates.get(0);
        Date toDate = dates.get(dates.size() - 1);

        // check date format compared to json.
        System.out.println("from date: " + fromDate);
        System.out.println("to date: " + toDate);

        boolean testResults = testCtrl.runsTest(randomNumbers).isTestConclusion()
                && testCtrl.occurrencesTest(randomNumbers)
                && testCtrl.boardSeqTest(seq);

        if (testResults) {
            return new testSomething(true, "Success", fromDate, toDate);
        } else
            return new testSomething(false, "Failure", fromDate, toDate);
    }
}
