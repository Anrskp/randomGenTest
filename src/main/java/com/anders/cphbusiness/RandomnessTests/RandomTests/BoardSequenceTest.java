package com.anders.cphbusiness.RandomnessTests.RandomTests;

import com.anders.cphbusiness.Model.SecondaryModel.StoreDbEnt;
import com.anders.cphbusiness.RandomnessTests.TestResults.BoardSeqTestResult;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BoardSequenceTest {

    //FIELDS

    //CONSTRUCTOR
    public BoardSequenceTest() {
    }

    //METHODS
    public BoardSeqTestResult checkBoardDups(List<StoreDbEnt> seq) {
        boolean noDups = true;

        ArrayList<String> allSeqs = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        // populate array of played combinations.
        for (StoreDbEnt aSeq : seq) {

            sb.append(aSeq.getMarkNumber());//.append(" ");

            // each combination is 7 digits.
            if (aSeq.getMarkSequenceNumber() == 7) {
                String newSeq = sb.toString();
                allSeqs.add(newSeq);

                // reset string builder
                sb.setLength(0);
            } else {
                sb.append(" ");
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

        allSeqs.clear();

        return new BoardSeqTestResult(noDups, combinationDubs);
    }
}