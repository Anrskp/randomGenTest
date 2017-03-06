package com.anders.cphbusiness.Model.TestResultsModel;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class JsonResponse {

    boolean status;
    String msg;
    Date fromDate;
    Date toDate;
    testJson test;

    public JsonResponse(boolean status, String msg, Date fromDate, Date toDate, testJson test) {
        this.status = status;
        this.msg = msg;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.test = test;
    }

    @Override
    public String toString() {
        return "JsonResponse{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                ", fromDate=" + fromDate +
                ", toDate=" + toDate +
                ", test=" + test.toString() +
                '}';
    }
}
