package com.anders.cphbusiness.controller;

import com.anders.cphbusiness.repositories.wagerBoardMarksRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.anders.cphbusiness.entitiesModel.*;

import java.util.ArrayList;

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

        for (wagerBoardMarks wagerBoardMarks : repo.findAll()) {
            seq.add(wagerBoardMarks);
            randomNumbers.add(wagerBoardMarks.getMarkNumber());
        }

        boolean runsTestRes = testCtrl.runsTest(randomNumbers).isTestConclusion();
        boolean occurrencesTestRes = (testCtrl.occurrencesTest(randomNumbers));
        boolean boardSeqTestRes = testCtrl.boardSeqTest(seq);

        return runsTestRes && occurrencesTestRes && boardSeqTestRes;

    }
}
