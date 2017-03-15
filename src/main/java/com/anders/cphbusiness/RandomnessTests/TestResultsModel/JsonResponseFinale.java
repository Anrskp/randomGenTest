package com.anders.cphbusiness.RandomnessTests.TestResultsModel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JsonResponseFinale {

    String salesChannel;
    JsonResponseTest testsRes;

    public JsonResponseFinale(String salesChannel, JsonResponseTest testsRes) {
        this.salesChannel = salesChannel;
        this.testsRes = testsRes;
    }

    @Override
    public String toString() {
        return "JsonResponseFinale{" +
                "salesChannel='" + salesChannel + '\'' +
                ", testsRes=" + testsRes +
                '}';
    }
}
