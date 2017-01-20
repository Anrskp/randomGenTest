package com.anders.cphbusiness.controller;

import com.anders.cphbusiness.repositories.wagerBoardMarksRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.anders.cphbusiness.entitiesModel.*;

import java.sql.Date;
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
    @RequestMapping("/rngCheck")
    public boolean testFeedback() {

        ArrayList<Integer> randomNumbers = new ArrayList<>();
        ArrayList<wagerBoardMarks> seq = new ArrayList<>();
        ArrayList<java.util.Date> dates = new ArrayList<>();

        for (wagerBoardMarks wagerBoardMarks : repo.findAll()) {
            seq.add(wagerBoardMarks);
            randomNumbers.add(wagerBoardMarks.getMarkNumber());
            dates.add(wagerBoardMarks.getMeta_CreatedDate());
        }

        // get sample dates
        Collections.sort(dates);
        System.out.println("sample from : " + dates.get(0) + " to " + dates.get(dates.size() - 1));

        boolean runsTestRes = testCtrl.runsTest(randomNumbers).isTestConclusion();
        boolean occurrencesTestRes = (testCtrl.occurrencesTest(randomNumbers));
        boolean boardSeqTestRes = testCtrl.boardSeqTest(seq);

        return runsTestRes && occurrencesTestRes && boardSeqTestRes;
    }
}
