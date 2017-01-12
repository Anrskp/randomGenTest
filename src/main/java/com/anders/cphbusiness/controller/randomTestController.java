package com.anders.cphbusiness.controller;

import com.anders.cphbusiness.numbersModel.numbersInfo;
import com.anders.cphbusiness.numbersModel.runsTestResult;
import com.anders.cphbusiness.testForRandomess.*;

import java.util.ArrayList;
import java.util.List;

public class randomTestController {

    //FIELDS
    private runsTest rt = new runsTest();
    private occurrencesTest ot = new occurrencesTest();

    // CONSTRUCTOR
    public randomTestController() {
    }

    // METHODS
    public runsTestResult runsTest(ArrayList<Integer> rngNumbers) {
        return rt.runsTest(rngNumbers);
    }

    public List<numbersInfo> occurrencesTest(ArrayList<Integer> rngNumbers) {
        return ot.occurrencesTester(rngNumbers);
    }


}
