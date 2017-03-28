package com.anders.cphbusiness.Controller;

import com.anders.cphbusiness.Model.SecondaryModel.StoreDbEnt;
import com.anders.cphbusiness.RandomnessTests.RandomTests.BoardSequenceTest;
import com.anders.cphbusiness.RandomnessTests.RandomTests.OccurrencesData;
import com.anders.cphbusiness.RandomnessTests.RandomTests.OccurrencesTest;
import com.anders.cphbusiness.RandomnessTests.RandomTests.RunsTest;
import com.anders.cphbusiness.RandomnessTests.TestResults.BoardSeqTestResult;
import com.anders.cphbusiness.RandomnessTests.TestResults.OccuTestResult;
import com.anders.cphbusiness.RandomnessTests.TestResults.RunsTestResult;
import com.anders.cphbusiness.RandomnessTests.numberInfo.NumbersInfo;

import java.util.ArrayList;
import java.util.List;

public class RandomTestController {

    //FIELDS
    private RunsTest rt = new RunsTest();
    private OccurrencesTest ot = new OccurrencesTest();
    private BoardSequenceTest bst = new BoardSequenceTest();
    private OccurrencesData osd = new OccurrencesData();

    // CONSTRUCTOR
    public RandomTestController() {
    }

    // METHODS
    public RunsTestResult runsTest(ArrayList<Integer> rngNumbers) {
        return rt.runsTester(rngNumbers);
    }

    public OccuTestResult occurrencesTest(ArrayList<Integer> rngNumbers) {
        return ot.occurrencesTester(rngNumbers);
    }

    public BoardSeqTestResult boardSeqTest(List<StoreDbEnt> rngNumbers) {
        return bst.checkBoardDups(rngNumbers);
    }

    public ArrayList<NumbersInfo> occurrencesData(ArrayList<Integer> rngNumbers) {
        return osd.staticOccurrences(rngNumbers);
    }
}