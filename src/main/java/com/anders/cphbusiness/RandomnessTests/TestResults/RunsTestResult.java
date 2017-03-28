package com.anders.cphbusiness.RandomnessTests.TestResults;

import lombok.Getter;

@Getter
public class RunsTestResult {

    boolean testPassed;
    //private float u;
    private double z;
    //private double o;


    public RunsTestResult(boolean testPassed, double z) {
        this.testPassed = testPassed;
      //  this.u = u;
        this.z = z;
        //this.o = o;
    }
}
