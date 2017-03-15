package com.anders.cphbusiness.Model.TestResultsModel;

import lombok.Getter;

@Getter
public class RunsTestResult {

    boolean testPassed;
    private float u;
    private double z;
    private double o;


    public RunsTestResult(boolean testPassed, float u, double z, double o) {
        this.testPassed = testPassed;
        this.u = u;
        this.z = z;
        this.o = o;
    }
}
