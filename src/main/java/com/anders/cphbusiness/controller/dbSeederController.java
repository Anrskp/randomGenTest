package com.anders.cphbusiness.controller;

import com.anders.cphbusiness.model.entData;
import com.anders.cphbusiness.model.poolgameTransaction;
import com.anders.cphbusiness.model.wagerBoard;
import com.anders.cphbusiness.model.wagerBoardMarks;

import java.util.*;

public class dbSeederController {

    // FIELDS
    private static Random randomNumber = new Random();

    private List<wagerBoard> wagerBoardsList = new ArrayList<>();
    private List<wagerBoardMarks> wagerBoardMarksList = new ArrayList<>();
    private List<poolgameTransaction> poolgameTransactionList = new ArrayList<>();
    private static ArrayList<Integer> currentBoardNumbers = new ArrayList<>();
    private int currentBoardNumber = 1;
    private String currentWagerIdentification = Integer.toString(getRandomNumber() + getRandomNumber() + getRandomNumber());

    // METHODS
    private static int getRandomNumber() {
        int rn = randomNumber.nextInt(99) + 1;
        // make sure not to create int duplicates on same board
        while (currentBoardNumbers.contains(rn)) {
            rn = randomNumber.nextInt(99) + 1;
        }

        return rn;
    }

    private static char getRandomChar() {
        return (char) (randomNumber.nextInt(26) + 'a');
    }

    private static String getRandomString() {
        return "";
    }

    private static Date getDate() {
        return new Date();
    }

    // generate x amount of 'random' entities.
    public entData generateEntitiesData(int amountOfEnts) {

        // amount
        for (int i = 0; i < amountOfEnts; i++) {

            // rows
            for (int j = 0; j < 10; j++) {

                // board
                for (int l = 0; l < 7; l++) {

                    // WAGER BOARD FIELDS;

                    String meta_transactionID = null;
                    String meta_sequenceID = null;
                    String WagerIdentification = currentWagerIdentification; // KEY
                    int BoardNumber = currentBoardNumber; // KEY
                    long FractionGameType = 0;
                    long FractionParentDividedCount = 0;
                    long FractionParentOrChild = 0;
                    String FractionParentWagerIdentification = null;
                    long FractionsBought = 0;
                    String GameIdentification = "011-000000034"; // KEY  ~ id-code for 'lynlotto'
                    String TransactionIdentification = "test" + getRandomNumber() + getRandomNumber() + getRandomNumber() + getRandomNumber();
                    Date meta_CreatedDate = new Date(getRandomNumber() + getRandomNumber() + getRandomNumber()); // KEY ~ dosen't create entities that share this value?
                    Date meta_FromDate = getDate();
                    Date meta_ToDate = getDate();
                    Date meta_InsertedDate = getDate();
                    Date meta_ModifiedDate = getDate();
                    int meta_Audit_Inserted = 0;
                    int meta_IsCurrent = 1;
                    int meta_Audit_Updated = 0;
                    String meta_API_Version = null;
                    int KEY_CHECK_SUM = 0;
                    int CHECK_SUM = 0;

                    wagerBoard wagerBoardEnt = new wagerBoard(meta_transactionID, meta_sequenceID, WagerIdentification, BoardNumber, FractionGameType, FractionParentDividedCount, FractionParentOrChild, FractionParentWagerIdentification, FractionsBought, GameIdentification, TransactionIdentification, meta_CreatedDate, meta_FromDate, meta_ToDate, meta_InsertedDate, meta_ModifiedDate, meta_Audit_Inserted, meta_IsCurrent, meta_Audit_Updated, meta_API_Version, KEY_CHECK_SUM, CHECK_SUM);
                    wagerBoardsList.add(wagerBoardEnt);

                    // WAGER BOARD MARKS FIELDS

                    // meta_transactionID;
                    // meta_sequenceID;
                    // WagerIdentification;
                    int MarkSequenceNumber = l + 1;
                    int MarkNumber = getRandomNumber(); // add to current "mark numbers on board" list to make sure no repeats
                    //GameIdentification;
                    //BoardNumber;
                    //meta_CreatedDate;
                    //meta_FromDate;
                    //meta_ToDate;
                    //meta_InsertedDate;
                    //meta_ModifiedDate;
                    //meta_Audit_Inserted;
                    //meta_IsCurrent;
                    //meta_Audit_Updated;
                    //meta_API_Version;
                    //KEY_CHECK_SUM;
                    //CHECK_SUM;

                    wagerBoardMarks wagerBoardMarksEnt = new wagerBoardMarks(meta_transactionID, meta_sequenceID, WagerIdentification, MarkSequenceNumber, MarkNumber, GameIdentification, BoardNumber, meta_CreatedDate, meta_FromDate, meta_ToDate, meta_InsertedDate, meta_ModifiedDate, meta_Audit_Inserted, meta_IsCurrent, meta_Audit_Updated, meta_API_Version, KEY_CHECK_SUM, CHECK_SUM);
                    wagerBoardMarksList.add(wagerBoardMarksEnt);

                    // POOL GAME TRANSACTIONS FIELDS

                    //String meta_transactionID;
                    //String meta_sequenceID;
                    String BetClassIdentification = "";
                    long BetTypeIdentification = 3;
                    long CardType = 0;
                    long CouponTypeIdentification = 0;
                    String CustomerIdentification = "";
                    String DrawIdentification = "";
                    //long FractionGameType = 0;
                    //long FractionParentDividedCount = 0;
                    //long FractionParentOrChild = 0;
                    //FractionParentWagerIdentification
                    //FractionsBought
                    //String GameIdentification = "";
                    long HoldIndicator = 0;
                    String LinkDrawIdentification = "";
                    String LinkGameIdentification = "";
                    String LinkTransactionIdentification = "";
                    long PlayedByInternetIndicator = 0;
                    long PrintRun = 0;
                    long PrizeTypeIdentification = 0;
                    long ReceiptNumber = 0;
                    long RejectIndicator = 0;
                    String RetailerIdentification = "";
                    String SalesChannelData = "";
                    String SalesChannelIdentification = "";
                    long TerminalNumber = 0;
                    Date TransactionDatetime = getDate();
                    //String TransactionIdentification = ""; // KEY
                    String TransactionState = "";
                    long TransactionType = 0;
                    float TransactionValue = 0;
                    long ValidationCashTicketIndicator = 0;
                    long ValidationClaimTicketIndicator = 0;
                    long ValidationExchangeIndicator = 0;
                    long ValidationFreePrizeCashedIndicator = 0;
                    long ValidationLastDrawNumberOfValidation = 0;
                    long ValidationRefundTicketIndicator = 0;
                    long ValidationType = 0;
                    long WagerBoardQuickPickMarksBoard = 0;
                    String WagerHeaderAddon1GameIdentification = "";
                    float WagerHeaderAddon1Value = 0;
                    String WagerHeaderAddon2GameIdentification = "";
                    float WagerHeaderAddon2Value = 0;
                    long WagerHeaderBoards = 0;
                    long WagerHeaderDurationTransaction = 0;
                    long WagerHeaderFreeTicket = 0;
                    String WagerHeaderLastDrawNumber = "";
                    String WagerHeaderStartDrawNumber = "";
                    //meta_CreatedDate // KEY
                    //meta_FromDate
                    //meta_ToDate
                    //meta_InsertedDate
                    //meta_Audit_Inserted
                    //meta_IsCurrent
                    //meta_Audit_Updated
                    //meta_API_Version
                    int meta_Exported_AX = 0;
                    int meta_Exported_BI = 0;
                    //KEY_CHECK_SUM
                    //CHECK_SUM

                    poolgameTransaction poolgameTransactionEnt = new poolgameTransaction(meta_transactionID, meta_sequenceID, BetClassIdentification, BetTypeIdentification, CardType, CouponTypeIdentification, CustomerIdentification, DrawIdentification, FractionGameType, FractionParentDividedCount, FractionParentOrChild, FractionParentWagerIdentification, FractionsBought, GameIdentification, HoldIndicator, LinkDrawIdentification, LinkGameIdentification, LinkTransactionIdentification, PlayedByInternetIndicator, PrintRun, PrizeTypeIdentification, ReceiptNumber, RejectIndicator, RetailerIdentification, SalesChannelData, SalesChannelIdentification, TerminalNumber, TransactionDatetime, TransactionIdentification, TransactionState, TransactionType, TransactionValue, ValidationCashTicketIndicator, ValidationClaimTicketIndicator, ValidationExchangeIndicator, ValidationFreePrizeCashedIndicator, ValidationLastDrawNumberOfValidation, ValidationRefundTicketIndicator, ValidationType, WagerBoardQuickPickMarksBoard, WagerHeaderAddon1GameIdentification, WagerHeaderAddon1Value, WagerHeaderAddon2GameIdentification, WagerHeaderAddon2Value, WagerHeaderBoards, WagerHeaderDurationTransaction, WagerHeaderFreeTicket, WagerHeaderLastDrawNumber, WagerHeaderStartDrawNumber, meta_CreatedDate, meta_FromDate, meta_ToDate, meta_InsertedDate, meta_Audit_Inserted, meta_IsCurrent, meta_Audit_Updated, meta_API_Version, meta_Exported_AX, meta_Exported_BI, KEY_CHECK_SUM, CHECK_SUM);
                    poolgameTransactionList.add(poolgameTransactionEnt);

                    currentBoardNumbers.add(MarkNumber);
                }

                currentBoardNumber++;
                currentBoardNumbers.clear();
            }

            currentWagerIdentification = Integer.toString(getRandomNumber() + getRandomNumber() + getRandomNumber() + getRandomNumber() + getRandomNumber() + getRandomNumber());
            currentBoardNumber = 1;
        }

        return new entData(wagerBoardsList, wagerBoardMarksList, poolgameTransactionList);
    }
}