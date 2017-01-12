package com.anders.cphbusiness.numbersModel;

import lombok.Getter;

@Getter
public class runsTestResult {

    private float median;
    private float u;
    private double z;
    private double o;
    boolean testConclusion;

    public runsTestResult(float median, float u, double z, double o, boolean testConclusion) {

        this.median = median;
        this.u = u;
        this.z = z;
        this.o = o;
        this.testConclusion = testConclusion;
    }
}
