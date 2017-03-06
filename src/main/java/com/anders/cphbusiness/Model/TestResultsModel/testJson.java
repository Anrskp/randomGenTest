package com.anders.cphbusiness.Model.TestResultsModel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class testJson {

    private int someinfo;
    private String someOtherInfo;

    public testJson(int someinfo, String someOtherInfo) {
        this.someinfo = someinfo;
        this.someOtherInfo = someOtherInfo;
    }

    @Override
    public String toString() {
        return "testJson{" +
                "someinfo=" + someinfo +
                ", someOtherInfo='" + someOtherInfo + '\'' +
                '}';
    }
}
