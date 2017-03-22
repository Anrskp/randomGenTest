package com.anders.cphbusiness.RandomnessTests.TestResultsModel;

import com.anders.cphbusiness.RandomnessTests.numberInfo.NumbersInfo;
import lombok.Getter;

import java.util.ArrayList;

@Getter
public class OccuTestResult {

    boolean testPassed;
    long averageOccurrence;
    ArrayList<NumbersInfo> highestOccuNumbers;
    ArrayList<NumbersInfo> lowestOccuNumbers;

    public OccuTestResult(boolean testPassed, long averageOccurrence, ArrayList<NumbersInfo> highestOccuNumbers, ArrayList<NumbersInfo> lowestOccuNumbers) {
        this.testPassed = testPassed;
        this.averageOccurrence = averageOccurrence;
        this.highestOccuNumbers = highestOccuNumbers;
        this.lowestOccuNumbers = lowestOccuNumbers;
    }

    @Override
    public String toString() {
        return "OccuTestResult{" +
                "testPassed=" + testPassed +
                ", averageOccurrence=" + averageOccurrence +
                ", highestOccuNumbers=" + highestOccuNumbers +
                ", lowestOccuNumbers=" + lowestOccuNumbers +
                '}';
    }
}
