package com.anders.cphbusiness.controller;

import com.anders.cphbusiness.entitiesModel.WagerBoardMarks;
import com.anders.cphbusiness.testResults.RunsTestResult;
import com.anders.cphbusiness.testModel.*;

import java.util.ArrayList;

public class RandomTestController {

    //FIELDS
    private RunsTest rt = new RunsTest();
    private OccurrencesTest ot = new OccurrencesTest();
    private BoardSequenceTest bst = new BoardSequenceTest();

    // CONSTRUCTOR
    public RandomTestController() {
    }

    // METHODS
    public RunsTestResult runsTest(ArrayList<Integer> rngNumbers) {
        return rt.runsTester(rngNumbers);
    }

    boolean occurrencesTest(ArrayList<Integer> rngNumbers) {
        return ot.occurrencesTester(rngNumbers);
    }

    boolean boardSeqTest(ArrayList<WagerBoardMarks> rngNumbers) {
        return bst.checkBoardDups(rngNumbers);
    }

}