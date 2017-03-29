package com.anders.cphbusiness.RandomnessTests.TestResults;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JsonResponseSalesChannel {

    RunsTestResult runsTest;
    OccuTestResult occuTest;
    BoardSeqTestResult boardSeqTest;

    public JsonResponseSalesChannel(RunsTestResult runsTest, OccuTestResult occuTest, BoardSeqTestResult boardSeqTest) {

        this.runsTest = runsTest;
        this.occuTest = occuTest;
        this.boardSeqTest = boardSeqTest;
    }

    @Override
    public String toString() {
        return "JsonResponseSalesChannel{" +
                "runsTest=" + runsTest +
                ", occuTest=" + occuTest +
                ", boardSeqTest=" + boardSeqTest +
                '}';
    }
}
