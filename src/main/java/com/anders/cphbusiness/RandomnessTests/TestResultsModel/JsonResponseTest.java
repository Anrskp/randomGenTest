package com.anders.cphbusiness.RandomnessTests.TestResultsModel;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class JsonResponseTest {

    RunsTestResult runsTest;
    OccuTestResult occuTest;
    BoardSeqTestResult boardSeqTest;

    public JsonResponseTest(RunsTestResult runsTest, OccuTestResult occuTest, BoardSeqTestResult boardSeqTest) {

        this.runsTest = runsTest;
        this.occuTest = occuTest;
        this.boardSeqTest = boardSeqTest;
    }

    @Override
    public String toString() {
        return "JsonResponseTest{" +
                "runsTest=" + runsTest +
                ", occuTest=" + occuTest +
                ", boardSeqTest=" + boardSeqTest +
                '}';
    }
}
