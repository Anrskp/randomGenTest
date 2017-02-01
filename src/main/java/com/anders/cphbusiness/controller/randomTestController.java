package com.anders.cphbusiness.controller;

import com.anders.cphbusiness.entitiesModel.wagerBoardMarks;
import com.anders.cphbusiness.numbersModel.runsTestResult;
import com.anders.cphbusiness.testModel.*;

import java.util.ArrayList;
import java.util.List;

public class randomTestController {

    //FIELDS
    private runsTest rt = new runsTest();
    private occurrencesTest ot = new occurrencesTest();
    private boardSequenceTest bst = new boardSequenceTest();

    // CONSTRUCTOR
    public randomTestController() {
    }

    // METHODS
    runsTestResult runsTest(ArrayList<Integer> rngNumbers) {
        return rt.runsTester(rngNumbers);
    }

    boolean occurrencesTest(ArrayList<Integer> rngNumbers) {
        return ot.occurrencesTester(rngNumbers);
    }

    boolean boardSeqTest(ArrayList<wagerBoardMarks> rngNumbers) {
        return bst.checkBoardDups(rngNumbers);
    }

}
