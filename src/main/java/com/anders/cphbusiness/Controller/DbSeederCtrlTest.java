package com.anders.cphbusiness.Controller;

import java.util.Date;
// MAKE COMMAND LINE RUNNER ?
public class DbSeederCtrlTest {

    public void generateTestData() {

        // POOL GAME TRANSACTIONS
        for (int i = 1; i < 11; i++) {

            String PGT_meta_transactionID = "";
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
            int PGT_FractionsBought = 0;
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
            String PGT_SalesChannelData = "";
            String PGT_SalesChannelIdentification = "";
            long PGT_TerminalNumber = 0;
            Date PGT_TransactionDatetime = new Date();
            String PGT_TransactionIdentification = ""; // KEY
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
            Date PGT_meta_CreatedDate = new Date(); // KEY
            Date PGT_meta_FromDate = new Date();
            Date PGT_meta_ToDate = new Date();
            Date PGT_meta_InsertedDate = new Date();
            int PGT_meta_Audit_Inserted = 0;
            int PGT_meta_IsCurrent = 1;
            int PGT_meta_Audit_Updated = 1;
            String PGT_meta_API_Version = "";
            int PGT_meta_Exported_AX = 0;
            int PGT_meta_Exported_BI = 0;
            int PGT_KEY_CHECK_SUM = 0;
            int PGT_CHECK_SUM = 0;

            // create and add
        }


        // WAGER BOARD
        for (int j = 1; j < 101; j++) {

            String WB_meta_transactionID = null;
            String WB_meta_sequenceID = null;
            String WB_WagerIdentification = ""; // KEY
            int WB_BoardNumber = 0; // KEY
            long WB_FractionGameType = 0;
            long WB_FractionParentDividedCount = 0;
            long WB_FractionParentOrChild = 0;
            String WB_FractionParentWagerIdentification = null;
            long WB_FractionsBought = 0;
            String WB_GameIdentification = "011-000000034"; // KEY
            String WB_TransactionIdentification = "";
            Date WB_meta_CreatedDate = new Date(); // KEY
            Date WB_meta_FromDate = new Date();
            Date WB_meta_ToDate = new Date();
            Date WB_meta_InsertedDate = new Date();
            Date WB_meta_ModifiedDate = new Date();
            int WB_meta_Audit_Inserted = 0;
            int WB_meta_IsCurrent = 1;
            int WB_meta_Audit_Updated = 0;
            String WB_meta_API_Version = null;
            int WB_KEY_CHECK_SUM = 0;
            int WB_CHECK_SUM = 0;

            // create and add

            // WAGER BOARD MARKS

        }


        for (int k = 1; k < 701; k++) {

            // WBM_meta_transactionID;
            // WBM_meta_sequenceID;
            // WBM_WagerIdentification;
            int WBM_MarkSequenceNumber = 0;
            int WBM_MarkNumber = 0;
            //WBM_GameIdentification;
            //WBM_BoardNumber;
            //WBM_meta_CreatedDate;
            //WBM_meta_FromDate;
            //WBM_meta_ToDate;
            //WBM_meta_InsertedDate;
            //WBM_meta_ModifiedDate;
            //WBM_meta_Audit_Inserted;
            //WBM_meta_IsCurrent;
            //WBM_meta_Audit_Updated;
            //WBM_meta_API_Version;
            //WBM_KEY_CHECK_SUM;
            //WBM_CHECK_SUM;

            // create and add
        }
    }
}

