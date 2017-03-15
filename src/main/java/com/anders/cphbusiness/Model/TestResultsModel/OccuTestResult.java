package com.anders.cphbusiness.Model.TestResultsModel;

import lombok.Getter;

import java.util.ArrayList;

@Getter
public class OccuTestResult {

    boolean testPassed;
    ArrayList<NumbersInfo> highestOccuNumbers;
    ArrayList<NumbersInfo> lowestOccuNumbers;

    public OccuTestResult(boolean testPassed, ArrayList<NumbersInfo> highestOccuNumbers, ArrayList<NumbersInfo> lowestOccuNumbers) {
        this.testPassed = testPassed;
        this.highestOccuNumbers = highestOccuNumbers;
        this.lowestOccuNumbers = lowestOccuNumbers;
    }

    @Override
    public String toString() {
        return "OccuTestResult{" +
                "testPassed=" + testPassed +
                ", highestOccuNumbers=" + highestOccuNumbers +
                ", lowestOccuNumbers=" + lowestOccuNumbers +
                '}';
    }
}
