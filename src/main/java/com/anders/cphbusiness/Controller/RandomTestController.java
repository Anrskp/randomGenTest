package com.anders.cphbusiness.Controller;

import com.anders.cphbusiness.Model.SecondaryModel.StoreDbEnt;
import com.anders.cphbusiness.RandomnessTests.TestModel.BoardSequenceTest;
import com.anders.cphbusiness.RandomnessTests.TestModel.OccurrencesStaticData;
import com.anders.cphbusiness.RandomnessTests.TestModel.OccurrencesTest;
import com.anders.cphbusiness.RandomnessTests.TestModel.RunsTest;
import com.anders.cphbusiness.RandomnessTests.TestResultsModel.BoardSeqTestResult;
import com.anders.cphbusiness.RandomnessTests.TestResultsModel.OccuTestResult;
import com.anders.cphbusiness.RandomnessTests.TestResultsModel.RunsTestResult;
import com.anders.cphbusiness.RandomnessTests.numberInfo.NumbersInfo;

import java.util.ArrayList;
import java.util.List;

public class RandomTestController {

    //FIELDS
    private RunsTest rt = new RunsTest();
    private OccurrencesTest ot = new OccurrencesTest();
    private BoardSequenceTest bst = new BoardSequenceTest();
    private OccurrencesStaticData osd = new OccurrencesStaticData();

    // CONSTRUCTOR
    public RandomTestController() {
    }

    // METHODS
    RunsTestResult runsTest(ArrayList<Integer> rngNumbers) {
        return rt.runsTester(rngNumbers);
    }

    OccuTestResult occurrencesTest(ArrayList<Integer> rngNumbers) {
        return ot.occurrencesTester(rngNumbers);
    }

    BoardSeqTestResult boardSeqTest(List<StoreDbEnt> rngNumbers) {
        return bst.checkBoardDups(rngNumbers);
    }

    ArrayList<NumbersInfo> staticOccuData(ArrayList<Integer> rngNumbers) {
        return osd.staticOccurrences(rngNumbers);
    }
}