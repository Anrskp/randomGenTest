package com.anders.cphbusiness.Controller;

import com.anders.cphbusiness.Model.PrimaryModel.WagerBoardMarks;
import com.anders.cphbusiness.Model.SecondaryModel.StoreDbEnt;
import com.anders.cphbusiness.Model.TestResultsModel.BoardSeqTestResult;
import com.anders.cphbusiness.Model.TestResultsModel.OccuTestResult;
import com.anders.cphbusiness.Model.TestResultsModel.RunsTestResult;
import com.anders.cphbusiness.Model.TestModel.*;

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

    OccuTestResult occurrencesTest(ArrayList<Integer> rngNumbers) {
        return ot.occurrencesTester(rngNumbers);
    }

    BoardSeqTestResult boardSeqTest(ArrayList<StoreDbEnt> rngNumbers) {
        return bst.checkBoardDups(rngNumbers);
    }

}