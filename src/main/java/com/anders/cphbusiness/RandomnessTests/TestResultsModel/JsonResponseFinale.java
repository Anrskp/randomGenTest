package com.anders.cphbusiness.RandomnessTests.TestResultsModel;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
public class JsonResponseFinale {

    Date fromDate;
    Date toDate;
    JsonResponseTest web;
    JsonResponseTest mobile;
    JsonResponseTest offline;

    public JsonResponseFinale(Date fromDate, Date toDate, JsonResponseTest web, JsonResponseTest mobile, JsonResponseTest offline) {
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.web = web;
        this.mobile = mobile;
        this.offline = offline;
    }
}
