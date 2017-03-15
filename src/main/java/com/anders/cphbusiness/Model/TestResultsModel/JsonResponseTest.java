package com.anders.cphbusiness.Model.TestResultsModel;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class JsonResponseTest {

    boolean allTestPassed;
    Date fromDate;
    Date toDate;
    RunsTestResult runsTest;
    OccuTestResult occuTest;
    BoardSeqTestResult boardSeqTest;

    public JsonResponseTest(boolean allTestPassed, Date fromDate, Date toDate, RunsTestResult runsTest, OccuTestResult occuTest, BoardSeqTestResult boardSeqTest) {
        this.allTestPassed = allTestPassed;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.runsTest = runsTest;
        this.occuTest = occuTest;
        this.boardSeqTest = boardSeqTest;
    }

    @Override
    public String toString() {
        return "JsonResponseTest{" +
                "allTestPassed=" + allTestPassed +
                ", fromDate=" + fromDate +
                ", toDate=" + toDate +
                ", runsTest=" + runsTest +
                ", occuTest=" + occuTest +
                ", boardSeqTest=" + boardSeqTest +
                '}';
    }
}
