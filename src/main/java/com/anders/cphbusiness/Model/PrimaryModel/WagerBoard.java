package com.anders.cphbusiness.Model.PrimaryModel;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@IdClass(PK_wagerBoard.class)
public class WagerBoard {

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "TransactionIdentification", insertable = false, updatable = false),
            @JoinColumn(name = "meta_CreatedDate", insertable = false, updatable = false)
    })
    private PoolgameTransaction poolgameTransaction;

    @OneToMany(mappedBy = "wagerBoard")
    private List<WagerBoardMarks> listOfWagerMarks;

    // FIELDS
    @Column(columnDefinition = "nvarchar(50) default 'null'")
    private String meta_transactionID;
    @Column(columnDefinition = "nvarchar(50) default 'null'")
    private String meta_sequenceID;
    @Column(columnDefinition = "nvarchar(20)")
    @NotNull
    @Id
    private String WagerIdentification;
    @NotNull
    @Id
    private int BoardNumber;
    @Column(columnDefinition = "bigint default 'null'")
    private long FractionGameType;
    @Column(columnDefinition = "bigint default 'null'")
    private long FractionParentDividedCount;
    @Column(columnDefinition = "bigint default 'null'")
    private long FractionParentOrChild;
    @Column(columnDefinition = "nvarchar(20) default 'null'")
    private String FractionParentWagerIdentification;
    @Column(columnDefinition = "bigint default 'null'")
    private long FractionsBought;
    @Column(columnDefinition = "nvarchar(20) default 'null'")
    @NotNull
    @Id
    private String GameIdentification;
    @Column(columnDefinition = "nvarchar(20) default 'null'")
    @NotNull
    private String TransactionIdentification;
    @Column(columnDefinition = "datetime2 default 'null'")
    @Id
    private Date meta_CreatedDate;
    @Column(columnDefinition = "datetime2 default 'null'")
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
    @Column(columnDefinition = "int default 0")
    private int KEY_CHECK_SUM;
    @Column(columnDefinition = "int default 0")
    private int CHECK_SUM;


    // CONSTRUCTORS
    protected WagerBoard() {
    }

    public WagerBoard(String meta_transactionID, String meta_sequenceID, String wagerIdentification, int boardNumber, long fractionGameType, long fractionParentDividedCount, long fractionParentOrChild, String fractionParentWagerIdentification, long fractionsBought, String gameIdentification, String transactionIdentification, Date meta_CreatedDate, Date meta_FromDate, Date meta_ToDate, Date meta_InsertedDate, Date meta_ModifiedDate, int meta_Audit_Inserted, int meta_IsCurrent, int meta_Audit_Updated, String meta_API_Version, int KEY_CHECK_SUM, int CHECK_SUM) {
        this.meta_transactionID = meta_transactionID;
        this.meta_sequenceID = meta_sequenceID;
        WagerIdentification = wagerIdentification;
        BoardNumber = boardNumber;
        FractionGameType = fractionGameType;
        FractionParentDividedCount = fractionParentDividedCount;
        FractionParentOrChild = fractionParentOrChild;
        FractionParentWagerIdentification = fractionParentWagerIdentification;
        FractionsBought = fractionsBought;
        GameIdentification = gameIdentification;
        TransactionIdentification = transactionIdentification;
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
