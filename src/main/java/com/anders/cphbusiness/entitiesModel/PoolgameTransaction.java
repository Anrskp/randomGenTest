package com.anders.cphbusiness.entitiesModel;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@IdClass(PK_poolgameTransaction.class)
public class PoolgameTransaction {

    // FIELDS
    @Column(columnDefinition = "nvarchar(50)")
    String meta_transactionID;
    @Column(columnDefinition = "nvarchar(50)")
    String meta_sequenceID;
    @Column(columnDefinition = "nvarchar(50)")
    String BetClassIdentification;
    @Column(columnDefinition = "bigint")
    Long BetTypeIdentification;
    @Column(columnDefinition = "bigint")
    Long CardType;
    @Column(columnDefinition = "bigint")
    Long CouponTypeIdentification;
    @Column(columnDefinition = "nvarchar(20)")
    String CustomerIdentification;
    @Column(columnDefinition = "nvarchar(20)")
    String DrawIdentification;
    @Column(columnDefinition = "bigint")
    Long FractionGameType;
    @Column(columnDefinition = "bigint")
    Long FractionParentDividedCount;
    @Column(columnDefinition = "bigint")
    Long FractionParentOrChild;
    @Column(columnDefinition = "nvarchar(20)")
    String FractionParentWagerIdentification;
    @Column(columnDefinition = "bigint")
    Long FractionsBought;
    @Column(columnDefinition = "nvarchar(20)")
    String GameIdentification;
    @Column(columnDefinition = "bigint")
    Long HoldIndicator;
    @Column(columnDefinition = "nvarchar(20)")
    String LinkDrawIdentification;
    @Column(columnDefinition = "nvarchar(20)")
    String LinkGameIdentification;
    @Column(columnDefinition = "nvarchar(29)")
    String LinkTransactionIdentification;
    @Column(columnDefinition = "bigint")
    Long PlayedByInternetIndicator;
    @Column(columnDefinition = "bigint")
    Long PrintRun;
    @Column(columnDefinition = "bigint")
    Long PrizeTypeIdentification;
    @Column(columnDefinition = "bigint")
    Long ReceiptNumber;
    @Column(columnDefinition = "bigint")
    Long RejectIndicator;
    @Column(columnDefinition = "nvarchar(20)")
    String RetailerIdentification;
    @Column(columnDefinition = "nvarchar(255)")
    String SalesChannelData;
    @Column(columnDefinition = "nvarchar(4)")
    String SalesChannelIdentification;
    @Column(columnDefinition = "bigint")
    Long TerminalNumber;
    @Column(columnDefinition = "datetime")
    Date TransactionDatetime;
    @Column(columnDefinition = "nvarchar(29)")
    @Id
    String TransactionIdentification;
    @Column(columnDefinition = "nvarchar(20)")
    String TransactionState;
    @Column(columnDefinition = "bigint")
    Long TransactionType;
    @Column(columnDefinition = "decimal(15, 2)")
    Float TransactionValue;
    @Column(columnDefinition = "bigint")
    Long ValidationCashTicketIndicator;
    @Column(columnDefinition = "bigint")
    Long ValidationClaimTicketIndicator;
    @Column(columnDefinition = "bigint")
    Long ValidationExchangeIndicator;
    @Column(columnDefinition = "bigint")
    Long ValidationFreePrizeCashedIndicator;
    @Column(columnDefinition = "bigint")
    Long ValidationLastDrawNumberOfValidation;
    @Column(columnDefinition = "bigint")
    Long ValidationRefundTicketIndicator;
    @Column(columnDefinition = "bigint")
    Long ValidationType;
    @Column(columnDefinition = "bigint")
    Long WagerBoardQuickPickMarksBoard;
    @Column(columnDefinition = "nvarchar(20)")
    String WagerHeaderAddon1GameIdentification;
    @Column(columnDefinition = "decimal(15, 2)")
    Float WagerHeaderAddon1Value;
    @Column(columnDefinition = "nvarchar(20)")
    String WagerHeaderAddon2GameIdentification;
    @Column(columnDefinition = "decimal(15, 2)")
    Float WagerHeaderAddon2Value;
    @Column(columnDefinition = "bigint")
    Long WagerHeaderBoards;
    @Column(columnDefinition = "bigint")
    Long WagerHeaderDurationTransaction;
    @Column(columnDefinition = "bigint")
    Long WagerHeaderFreeTicket;
    @Column(columnDefinition = "nvarchar(20)")
    String WagerHeaderLastDrawNumber;
    @Column(columnDefinition = "nvarchar(20)")
    String WagerHeaderStartDrawNumber;
    @Column(columnDefinition = "datetime2")
    @Id
    Date meta_CreatedDate;
    @Column(columnDefinition = "datetime2")
    Date meta_FromDate;
    @Column(columnDefinition = "datetime2")
    Date meta_ToDate;
    @Column(columnDefinition = "datetime2")
    Date meta_InsertedDate;
    int meta_Audit_Inserted;
    int meta_IsCurrent;
    int meta_Audit_Updated;
    @Column(columnDefinition = "nvarchar(10)")
    String meta_API_Version;
    int meta_Exported_AX;
    int meta_Exported_BI;
    int KEY_CHECK_SUM;
    int CHECK_SUM;

    //CONSTRUCTORS
    protected PoolgameTransaction() {
    }

    public PoolgameTransaction(String meta_transactionID, String meta_sequenceID, String betClassIdentification, Long betTypeIdentification, Long cardType, Long couponTypeIdentification, String customerIdentification, String drawIdentification, Long fractionGameType, Long fractionParentDividedCount, Long fractionParentOrChild, String fractionParentWagerIdentification, Long fractionsBought, String gameIdentification, Long holdIndicator, String linkDrawIdentification, String linkGameIdentification, String linkTransactionIdentification, Long playedByInternetIndicator, Long printRun, Long prizeTypeIdentification, Long receiptNumber, Long rejectIndicator, String retailerIdentification, String salesChannelData, String salesChannelIdentification, Long terminalNumber, Date transactionDatetime, String transactionIdentification, String transactionState, Long transactionType, Float transactionValue, Long validationCashTicketIndicator, Long validationClaimTicketIndicator, Long validationExchangeIndicator, Long validationFreePrizeCashedIndicator, Long validationLastDrawNumberOfValidation, Long validationRefundTicketIndicator, Long validationType, Long wagerBoardQuickPickMarksBoard, String wagerHeaderAddon1GameIdentification, Float wagerHeaderAddon1Value, String wagerHeaderAddon2GameIdentification, Float wagerHeaderAddon2Value, Long wagerHeaderBoards, Long wagerHeaderDurationTransaction, Long wagerHeaderFreeTicket, String wagerHeaderLastDrawNumber, String wagerHeaderStartDrawNumber, Date meta_CreatedDate, Date meta_FromDate, Date meta_ToDate, Date meta_InsertedDate, int meta_Audit_Inserted, int meta_IsCurrent, int meta_Audit_Updated, String meta_API_Version, int meta_Exported_AX, int meta_Exported_BI, int KEY_CHECK_SUM, int CHECK_SUM) {
        this.meta_transactionID = meta_transactionID;
        this.meta_sequenceID = meta_sequenceID;
        BetClassIdentification = betClassIdentification;
        BetTypeIdentification = betTypeIdentification;
        CardType = cardType;
        CouponTypeIdentification = couponTypeIdentification;
        CustomerIdentification = customerIdentification;
        DrawIdentification = drawIdentification;
        FractionGameType = fractionGameType;
        FractionParentDividedCount = fractionParentDividedCount;
        FractionParentOrChild = fractionParentOrChild;
        FractionParentWagerIdentification = fractionParentWagerIdentification;
        FractionsBought = fractionsBought;
        GameIdentification = gameIdentification;
        HoldIndicator = holdIndicator;
        LinkDrawIdentification = linkDrawIdentification;
        LinkGameIdentification = linkGameIdentification;
        LinkTransactionIdentification = linkTransactionIdentification;
        PlayedByInternetIndicator = playedByInternetIndicator;
        PrintRun = printRun;
        PrizeTypeIdentification = prizeTypeIdentification;
        ReceiptNumber = receiptNumber;
        RejectIndicator = rejectIndicator;
        RetailerIdentification = retailerIdentification;
        SalesChannelData = salesChannelData;
        SalesChannelIdentification = salesChannelIdentification;
        TerminalNumber = terminalNumber;
        TransactionDatetime = transactionDatetime;
        TransactionIdentification = transactionIdentification;
        TransactionState = transactionState;
        TransactionType = transactionType;
        TransactionValue = transactionValue;
        ValidationCashTicketIndicator = validationCashTicketIndicator;
        ValidationClaimTicketIndicator = validationClaimTicketIndicator;
        ValidationExchangeIndicator = validationExchangeIndicator;
        ValidationFreePrizeCashedIndicator = validationFreePrizeCashedIndicator;
        ValidationLastDrawNumberOfValidation = validationLastDrawNumberOfValidation;
        ValidationRefundTicketIndicator = validationRefundTicketIndicator;
        ValidationType = validationType;
        WagerBoardQuickPickMarksBoard = wagerBoardQuickPickMarksBoard;
        WagerHeaderAddon1GameIdentification = wagerHeaderAddon1GameIdentification;
        WagerHeaderAddon1Value = wagerHeaderAddon1Value;
        WagerHeaderAddon2GameIdentification = wagerHeaderAddon2GameIdentification;
        WagerHeaderAddon2Value = wagerHeaderAddon2Value;
        WagerHeaderBoards = wagerHeaderBoards;
        WagerHeaderDurationTransaction = wagerHeaderDurationTransaction;
        WagerHeaderFreeTicket = wagerHeaderFreeTicket;
        WagerHeaderLastDrawNumber = wagerHeaderLastDrawNumber;
        WagerHeaderStartDrawNumber = wagerHeaderStartDrawNumber;
        this.meta_CreatedDate = meta_CreatedDate;
        this.meta_FromDate = meta_FromDate;
        this.meta_ToDate = meta_ToDate;
        this.meta_InsertedDate = meta_InsertedDate;
        this.meta_Audit_Inserted = meta_Audit_Inserted;
        this.meta_IsCurrent = meta_IsCurrent;
        this.meta_Audit_Updated = meta_Audit_Updated;
        this.meta_API_Version = meta_API_Version;
        this.meta_Exported_AX = meta_Exported_AX;
        this.meta_Exported_BI = meta_Exported_BI;
        this.KEY_CHECK_SUM = KEY_CHECK_SUM;
        this.CHECK_SUM = CHECK_SUM;
    }

}