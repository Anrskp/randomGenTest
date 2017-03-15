package com.anders.cphbusiness.Model.TestResultsModel;

import lombok.Getter;

import java.util.ArrayList;

@Getter
public class BoardSeqTestResult {

    boolean testPassed;
    ArrayList<String> repeatedSeqs;

    public BoardSeqTestResult(boolean testPassed, ArrayList<String> repeatedSeqs) {
        this.testPassed = testPassed;
        this.repeatedSeqs = repeatedSeqs;
    }

    @Override
    public String toString() {
        return "BoardSeqTestResult{" +
                "testpassed=" + testPassed +
                ", repeatedSeqs=" + repeatedSeqs +
                '}';
    }
}
