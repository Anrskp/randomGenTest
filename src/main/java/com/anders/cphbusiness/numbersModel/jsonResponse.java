package com.anders.cphbusiness.numbersModel;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class jsonResponse {

    boolean status;
    String msg;
    Date fromDate;
    Date toDate;

    public jsonResponse(boolean status, String msg, Date fromDate, Date toDate) {
        this.status = status;
        this.msg = msg;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    @Override
    public String toString() {
        return "jsonResponse{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                ", fromDate=" + fromDate +
                ", toDate=" + toDate +
                '}';
    }
}
