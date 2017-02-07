package com.anders.cphbusiness.Model.TestResultsModel;

import lombok.Getter;

@Getter
public class RunsTestResult {

    private float u;
    private double z;
    private double o;
    boolean testConclusion;

    public RunsTestResult(float u, double z, double o, boolean testConclusion) {
        this.u = u;
        this.z = z;
        this.o = o;
        this.testConclusion = testConclusion;
    }
}
