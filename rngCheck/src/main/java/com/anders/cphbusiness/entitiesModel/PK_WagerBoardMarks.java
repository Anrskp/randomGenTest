package com.anders.cphbusiness.entitiesModel;

import java.io.Serializable;
import java.util.Date;

// PK_ID from column values.
public class PK_WagerBoardMarks implements Serializable {
    private String WagerIdentification;
    private int BoardNumber;
    private int MarkSequenceNumber;
    private String GameIdentification;
    private Date meta_CreatedDate;
}
