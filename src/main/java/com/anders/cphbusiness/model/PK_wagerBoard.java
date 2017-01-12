package com.anders.cphbusiness.model;

import java.io.Serializable;
import java.util.Date;

// PK_ID from column values.
public class PK_wagerBoard implements Serializable {
    private String WagerIdentification;
    private int BoardNumber;
    private String GameIdentification;
    private Date meta_CreatedDate;
}
