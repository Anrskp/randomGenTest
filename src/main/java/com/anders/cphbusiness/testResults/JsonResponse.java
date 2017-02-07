package com.anders.cphbusiness.testResults;

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

    public JsonResponse(boolean status, String msg, Date fromDate, Date toDate) {
        this.status = status;
        this.msg = msg;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    @Override
    public String toString() {
        return "JsonResponse{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                ", fromDate=" + fromDate +
                ", toDate=" + toDate +
                '}';
    }
}
