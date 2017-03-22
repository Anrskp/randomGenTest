package com.anders.cphbusiness.DB;


import com.anders.cphbusiness.Model.PrimaryModel.PoolgameTransaction;
import com.anders.cphbusiness.Model.PrimaryModel.WagerBoard;
import com.anders.cphbusiness.Model.PrimaryModel.WagerBoardMarks;
import com.anders.cphbusiness.Model.Repositories.PrimaryRepo.PoolgameTransactionRepo;
import com.anders.cphbusiness.Model.Repositories.PrimaryRepo.WagerBoardMarksRepo;
import com.anders.cphbusiness.Model.Repositories.PrimaryRepo.WagerBoardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@Component
public class UpdateLoadDB {

    @Autowired
    PoolgameTransactionRepo PGTrepo;
    @Autowired
    WagerBoardRepo WBrepo;
    @Autowired
    WagerBoardMarksRepo WBMrepo;


    private List<Integer> markNumbersOnCurrentBoard = new ArrayList<>();
    private List<WagerBoard> wagerBoardsList = new ArrayList<>();
    private List<WagerBoardMarks> wagerBoardMarksList = new ArrayList<>();
    private List<PoolgameTransaction> poolgameTransactionList = new ArrayList<>();

    private static Random randomNumber = new Random();
    private SecureRandom random = new SecureRandom();

    // first date to insert (8days earlier for testing purpose)
    private Date currentTime = new Date();
    private Date dateToInsert = new Date(currentTime.getTime() - TimeUnit.DAYS.toMillis(8));

    private String insertSalesChannel(int a) {
        String res = "";

        if (a == 1) {
            res = "mobile";
        } else if (a == 2) {
            res = "web";
        } else if (a == 3) {
            res = "offline";
        }

        return res;
    }

    private String nextSessionId() {
        return new BigInteger(60, random).toString();
    }

    private int getRandomMarkNumber() {
        int rn = randomNumber.nextInt(36) + 1;

        // avoid duplicates on same board
        while (markNumbersOnCurrentBoard.contains(rn)) {
            rn = randomNumber.nextInt(36) + 1;
        }
        return rn;
    }

    private void generateTestData() {
        int salesChannel = 1;
        // POOL GAME TRANSACTIONS
        for (int i = 1; i < 11; i++) {

            String randomID = nextSessionId();
            int currentBoardNumber = 1;

            String PGT_meta_transactionID = randomID;
            String PGT_meta_sequenceID = "";
            String PGT_BetClassIdentification = "";
            long PGT_BetTypeIdentification = 3;
            long PGT_CardType = 0;
            long PGT_CouponTypeIdentification = 0;
            String PGT_CustomerIdentification = "";
            String PGT_DrawIdentification = "";
            long PGT_FractionGameType = 0;
            long PGT_FractionParentDividedCount = 0;
            long PGT_FractionParentOrChild = 0;
            String PGT_FractionParentWagerIdentification = "";
            long PGT_FractionsBought = 0;
            String PGT_GameIdentification = "";
            long PGT_HoldIndicator = 0;
            String PGT_LinkDrawIdentification = "";
            String PGT_LinkGameIdentification = "";
            String PGT_LinkTransactionIdentification = "";
            long PGT_PlayedByInternetIndicator = 0;
            long PGT_PrintRun = 0;
            long PGT_PrizeTypeIdentification = 0;
            long PGT_ReceiptNumber = 0;
            long PGT_RejectIndicator = 0;
            String PGT_RetailerIdentification = "";
            String PGT_SalesChannelData = insertSalesChannel(salesChannel);
            String PGT_SalesChannelIdentification = "";
            long PGT_TerminalNumber = 0;
            Date PGT_TransactionDatetime = dateToInsert;
            String PGT_TransactionIdentification = randomID; // KEY
            String PGT_TransactionState = "";
            long PGT_TransactionType = 0;
            float PGT_TransactionValue = 0;
            long PGT_ValidationCashTicketIndicator = 0;
            long PGT_ValidationClaimTicketIndicator = 0;
            long PGT_ValidationExchangeIndicator = 0;
            long PGT_ValidationFreePrizeCashedIndicator = 0;
            long PGT_ValidationLastDrawNumberOfValidation = 0;
            long PGT_ValidationRefundTicketIndicator = 0;
            long PGT_ValidationType = 0;
            long PGT_WagerBoardQuickPickMarksBoard = 0;
            String PGT_WagerHeaderAddon1GameIdentification = "";
            float PGT_WagerHeaderAddon1Value = 0;
            String PGT_WagerHeaderAddon2GameIdentification = "";
            float PGT_WagerHeaderAddon2Value = 0;
            long PGT_WagerHeaderBoards = 0;
            long PGT_WagerHeaderDurationTransaction = 0;
            long PGT_WagerHeaderFreeTicket = 0;
            String PGT_WagerHeaderLastDrawNumber = "";
            String PGT_WagerHeaderStartDrawNumber = "";
            Date PGT_meta_CreatedDate = dateToInsert; // KEY
            Date PGT_meta_FromDate = dateToInsert;
            Date PGT_meta_ToDate = dateToInsert;
            Date PGT_meta_InsertedDate = dateToInsert;
            int PGT_meta_Audit_Inserted = 0;
            int PGT_meta_IsCurrent = 1;
            int PGT_meta_Audit_Updated = 1;
            String PGT_meta_API_Version = "";
            int PGT_meta_Exported_AX = 0;
            int PGT_meta_Exported_BI = 0;
            int PGT_KEY_CHECK_SUM = 0;
            int PGT_CHECK_SUM = 0;

            PoolgameTransaction poolgameTransactionEnt = new PoolgameTransaction(PGT_meta_transactionID, PGT_meta_sequenceID, PGT_BetClassIdentification, PGT_BetTypeIdentification, PGT_CardType, PGT_CouponTypeIdentification, PGT_CustomerIdentification, PGT_DrawIdentification, PGT_FractionGameType, PGT_FractionParentDividedCount, PGT_FractionParentOrChild, PGT_FractionParentWagerIdentification, PGT_FractionsBought, PGT_GameIdentification, PGT_HoldIndicator, PGT_LinkDrawIdentification, PGT_LinkGameIdentification, PGT_LinkTransactionIdentification, PGT_PlayedByInternetIndicator, PGT_PrintRun, PGT_PrizeTypeIdentification, PGT_ReceiptNumber, PGT_RejectIndicator, PGT_RetailerIdentification, PGT_SalesChannelData, PGT_SalesChannelIdentification, PGT_TerminalNumber, PGT_TransactionDatetime, PGT_TransactionIdentification, PGT_TransactionState, PGT_TransactionType, PGT_TransactionValue, PGT_ValidationCashTicketIndicator, PGT_ValidationClaimTicketIndicator, PGT_ValidationExchangeIndicator, PGT_ValidationFreePrizeCashedIndicator, PGT_ValidationLastDrawNumberOfValidation, PGT_ValidationRefundTicketIndicator, PGT_ValidationType, PGT_WagerBoardQuickPickMarksBoard, PGT_WagerHeaderAddon1GameIdentification, PGT_WagerHeaderAddon1Value, PGT_WagerHeaderAddon2GameIdentification, PGT_WagerHeaderAddon2Value, PGT_WagerHeaderBoards, PGT_WagerHeaderDurationTransaction, PGT_WagerHeaderFreeTicket, PGT_WagerHeaderLastDrawNumber, PGT_WagerHeaderStartDrawNumber, PGT_meta_CreatedDate, PGT_meta_FromDate, PGT_meta_ToDate, PGT_meta_InsertedDate, PGT_meta_Audit_Inserted, PGT_meta_IsCurrent, PGT_meta_Audit_Updated, PGT_meta_API_Version, PGT_meta_Exported_AX, PGT_meta_Exported_BI, PGT_KEY_CHECK_SUM, PGT_CHECK_SUM);
            poolgameTransactionList.add(poolgameTransactionEnt);


            // WAGER BOARD
            for (int j = 1; j < 11; j++) {

                String WB_meta_transactionID = randomID;
                String WB_meta_sequenceID = null;
                String WB_WagerIdentification = randomID; // KEY
                int WB_BoardNumber = currentBoardNumber; // KEY
                long WB_FractionGameType = 0;
                long WB_FractionParentDividedCount = 0;
                long WB_FractionParentOrChild = 0;
                String WB_FractionParentWagerIdentification = null;
                long WB_FractionsBought = 0;
                String WB_GameIdentification = "011-000000034"; // KEY
                String WB_TransactionIdentification = randomID;
                Date WB_meta_CreatedDate = dateToInsert; // KEY
                Date WB_meta_FromDate = dateToInsert;
                Date WB_meta_ToDate = dateToInsert;
                Date WB_meta_InsertedDate = dateToInsert;
                Date WB_meta_ModifiedDate = dateToInsert;
                int WB_meta_Audit_Inserted = 0;
                int WB_meta_IsCurrent = 1;
                int WB_meta_Audit_Updated = 0;
                String WB_meta_API_Version = null;
                int WB_KEY_CHECK_SUM = 0;
                int WB_CHECK_SUM = 0;


                WagerBoard wagerBoardEnt = new WagerBoard(WB_meta_transactionID, WB_meta_sequenceID, WB_WagerIdentification, WB_BoardNumber, WB_FractionGameType, WB_FractionParentDividedCount, WB_FractionParentOrChild, WB_FractionParentWagerIdentification, WB_FractionsBought, WB_GameIdentification, WB_TransactionIdentification, WB_meta_CreatedDate, WB_meta_FromDate, WB_meta_ToDate, WB_meta_InsertedDate, WB_meta_ModifiedDate, WB_meta_Audit_Inserted, WB_meta_IsCurrent, WB_meta_Audit_Updated, WB_meta_API_Version, WB_KEY_CHECK_SUM, WB_CHECK_SUM);
                wagerBoardsList.add(wagerBoardEnt);

                // WAGER BOARD MARKS
                int currentSequenceNumber = 1;
                for (int k = 1; k < 8; k++) {

                    int currentMarkNumber = getRandomMarkNumber();

                    String WBM_meta_transactionID = randomID;
                    String WBM_meta_sequenceID = null;
                    String WBM_WagerIdentification = randomID; // KEY
                    int WBM_MarkSequenceNumber = currentSequenceNumber; // KEY
                    int WBM_MarkNumber = currentMarkNumber;
                    String WBM_GameIdentification = "011-000000034"; // KEY
                    int WBM_BoardNumber = currentBoardNumber; // KEY
                    Date WBM_meta_CreatedDate = dateToInsert; // KEY
                    Date WBM_meta_FromDate = dateToInsert;
                    Date WBM_meta_ToDate = dateToInsert;
                    Date WBM_meta_InsertedDate = dateToInsert;
                    Date WBM_meta_ModifiedDate = dateToInsert;
                    int WBM_meta_Audit_Inserted = 0;
                    int WBM_meta_IsCurrent = 1;
                    int WBM_meta_Audit_Updated = 0;
                    String WBM_meta_API_Version = null;
                    int WBM_KEY_CHECK_SUM = 0;
                    int WBM_CHECK_SUM = 0;

                    markNumbersOnCurrentBoard.add(currentBoardNumber);
                    currentSequenceNumber++;

                    WagerBoardMarks wagerBoardMarksEnt = new WagerBoardMarks(WBM_meta_transactionID, WBM_meta_sequenceID, WBM_WagerIdentification, WBM_MarkSequenceNumber, WBM_MarkNumber, WBM_GameIdentification, WBM_BoardNumber, WBM_meta_CreatedDate, WBM_meta_FromDate, WBM_meta_ToDate, WBM_meta_InsertedDate, WBM_meta_ModifiedDate, WBM_meta_Audit_Inserted, WBM_meta_IsCurrent, WBM_meta_Audit_Updated, WBM_meta_API_Version, WBM_KEY_CHECK_SUM, WBM_CHECK_SUM);
                    wagerBoardMarksList.add(wagerBoardMarksEnt);
                }

                currentBoardNumber++;
                markNumbersOnCurrentBoard.clear();
            }
            salesChannel++;
            if (salesChannel == 4) {
                salesChannel = 1;
            }

            dateToInsert = new Date(dateToInsert.getTime() + TimeUnit.DAYS.toMillis(1));
        }
    }

    @Scheduled(fixedRate = 600000)
    public void generateData() {
    /*
        // get date from last point if any. default is current day and time.
        Date newestDate = WBrepo.findMaxDate();
        if (newestDate != null) {
            dateToInsert = new Date(newestDate.getTime() + TimeUnit.DAYS.toMillis(1));
        }

        generateTestData();

        long startTime = System.currentTimeMillis();

        try {
            PGTrepo.save(poolgameTransactionList);
            WBrepo.save(wagerBoardsList);
            WBMrepo.save(wagerBoardMarksList);
        } catch (Exception e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        long difference = endTime - startTime;

        System.out.println((float) TimeUnit.MILLISECONDS.toMinutes(difference) + " minutes");
        System.out.println(difference + " milliseconds");


        poolgameTransactionList.clear();
        wagerBoardsList.clear();
        wagerBoardMarksList.clear();
*/
    }

}
