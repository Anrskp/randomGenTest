package com.anders.cphbusiness.RandomnessTests.TestResults;

import lombok.Getter;

import java.util.Date;

@Getter
public class JsonResponse {

    Date fromDate;
    Date toDate;
    JsonResponseSalesChannel web;
    JsonResponseSalesChannel mobile;
    JsonResponseSalesChannel offline;

    public JsonResponse(Date fromDate, Date toDate, JsonResponseSalesChannel web, JsonResponseSalesChannel mobile, JsonResponseSalesChannel offline) {
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.web = web;
        this.mobile = mobile;
        this.offline = offline;
    }
}
