package com.anders.cphbusiness.entitiesModel;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@Entity
@IdClass(PK_WagerBoardMarks.class)
public class WagerBoardMarks {

    // FIELDS
    @Column(columnDefinition = "nvarchar(50)")
    private String meta_transactionID;
    @Column(columnDefinition = "nvarchar(50)")
    private String meta_sequenceID;
    @Column(columnDefinition = "nvarchar(20)")
    @NotNull
    @Id
    private String WagerIdentification;
    @NotNull
    @Id
    private int MarkSequenceNumber;
    private int MarkNumber;
    @Column(columnDefinition = "nvarchar(20) default 0")
    @NotNull
    @Id
    private String GameIdentification;
    @NotNull
    @Id
    int BoardNumber;
    @Column(columnDefinition = "datetime2")
    @NotNull
    @Id
    private Date meta_CreatedDate;
    @Column(columnDefinition = "datetime2")
    private Date meta_FromDate;
    @Column(columnDefinition = "datetime2 default '9999-12-31'")
    private Date meta_ToDate;
    @Column(columnDefinition = "datetime2 default getDate()")
    private Date meta_InsertedDate;
    @Column(columnDefinition = "datetime2 default getDate()")
    private Date meta_ModifiedDate;
    @Column(columnDefinition = "int default 1")
    private int meta_Audit_Inserted;
    @Column(columnDefinition = "int default 0")
    private int meta_IsCurrent;
    @Column(columnDefinition = "int default 0")
    private int meta_Audit_Updated;
    @Column(columnDefinition = "nvarchar(10)")
    private String meta_API_Version;
    private int KEY_CHECK_SUM;
    private int CHECK_SUM;


    // CONSTRUCTORS
    protected WagerBoardMarks() {
    }

    public WagerBoardMarks(String meta_transactionID, String meta_sequenceID, String wagerIdentification, int markSequenceNumber, int markNumber, String gameIdentification, int boardNumber, Date meta_CreatedDate, Date meta_FromDate, Date meta_ToDate, Date meta_InsertedDate, Date meta_ModifiedDate, int meta_Audit_Inserted, int meta_IsCurrent, int meta_Audit_Updated, String meta_API_Version, int KEY_CHECK_SUM, int CHECK_SUM) {
        this.meta_transactionID = meta_transactionID;
        this.meta_sequenceID = meta_sequenceID;
        WagerIdentification = wagerIdentification;
        MarkSequenceNumber = markSequenceNumber;
        MarkNumber = markNumber;
        GameIdentification = gameIdentification;
        BoardNumber = boardNumber;
        this.meta_CreatedDate = meta_CreatedDate;
        this.meta_FromDate = meta_FromDate;
        this.meta_ToDate = meta_ToDate;
        this.meta_InsertedDate = meta_InsertedDate;
        this.meta_ModifiedDate = meta_ModifiedDate;
        this.meta_Audit_Inserted = meta_Audit_Inserted;
        this.meta_IsCurrent = meta_IsCurrent;
        this.meta_Audit_Updated = meta_Audit_Updated;
        this.meta_API_Version = meta_API_Version;
        this.KEY_CHECK_SUM = KEY_CHECK_SUM;
        this.CHECK_SUM = CHECK_SUM;
    }
}