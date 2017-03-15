package com.anders.cphbusiness.Model.TestModel;

import com.anders.cphbusiness.Model.PrimaryModel.WagerBoardMarks;
import com.anders.cphbusiness.Model.SecondaryModel.StoreDbEnt;
import com.anders.cphbusiness.Model.TestResultsModel.BoardSeqTestResult;

import java.util.ArrayList;
import java.util.Collections;

public class BoardSequenceTest {

    //FIELDS

    //CONSTRUCTOR
    public BoardSequenceTest() {
    }

    //METHODS
    public BoardSeqTestResult checkBoardDups(ArrayList<StoreDbEnt> seq) {
        boolean noDups = true;

        ArrayList<String> allSeqs = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        // populate array of played combinations.
        for (StoreDbEnt aSeq : seq) {

            sb.append(aSeq.getMarkNumber()).append(" ");

            // each combination is 7 digits.
            if (aSeq.getMarkSequenceNumber() == 7) {
                String newSeq = sb.toString();
                allSeqs.add(newSeq);

                // reset string builder
                sb.setLength(0);
            }
        }

        // check for duplicates in board sequences
        ArrayList<String> combinationDubs = new ArrayList<>();
        for (String combination : allSeqs) {
            int frequency = Collections.frequency(allSeqs, combination);

            if (frequency > 1) {
                noDups = false;
                combinationDubs.add(combination);
                System.out.println(combination + " is repeat " + frequency + " times");
            }
        }

        return new BoardSeqTestResult(noDups, combinationDubs);
    }
}