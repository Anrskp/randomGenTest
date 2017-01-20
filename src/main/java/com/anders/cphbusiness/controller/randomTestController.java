package com.anders.cphbusiness.controller;

import com.anders.cphbusiness.entitiesModel.wagerBoardMarks;
import com.anders.cphbusiness.numbersModel.numbersInfo;
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
    public runsTestResult runsTest(ArrayList<Integer> rngNumbers) {
        return rt.runsTester(rngNumbers);
    }

    public boolean occurrencesTest(ArrayList<Integer> rngNumbers) {
        return ot.occurrencesTester(rngNumbers);
    }

    public boolean boardSeqTest(ArrayList<wagerBoardMarks> rngNumbers) {
        return bst.checkBoardDups(rngNumbers);
    }

}