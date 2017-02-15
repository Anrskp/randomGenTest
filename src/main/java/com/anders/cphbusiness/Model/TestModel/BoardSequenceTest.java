package com.anders.cphbusiness.Model.TestModel;

import com.anders.cphbusiness.Model.PrimaryModel.WagerBoardMarks;

import java.util.ArrayList;
import java.util.Collections;

public class BoardSequenceTest {

    //FIELDS

    //CONSTRUCTOR
    public BoardSequenceTest() {
    }

    //METHODS
    public boolean checkBoardDups(ArrayList<WagerBoardMarks> seq) {
        boolean noDups = true;

        // sort by wager identification
        seq.sort((number1, number2) -> {
            if (Long.parseLong(number1.getWagerIdentification()) > Long.parseLong(number2.getWagerIdentification()))
                return 1;
            if (Long.parseLong(number1.getWagerIdentification()) < Long.parseLong(number2.getWagerIdentification()))
                return -1;
            return 0;
        });

        ArrayList<String> allSeqs = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (WagerBoardMarks aSeq : seq) {

            sb.append(aSeq.getMarkNumber()).append(" ");

            if (aSeq.getMarkSequenceNumber() == 7) {
                String newSeq = sb.toString();
                allSeqs.add(newSeq);

                // reset stringBuilder
                sb.setLength(0);
            }
        }

        // check for duplicates in board sequences
        for (String number : allSeqs) {
            int frequency = Collections.frequency(allSeqs, number);

            if (frequency > 1) {
                noDups = false;
                System.out.println(number + " is repeat " + frequency + " times");
            }
        }

        return noDups;
    }
}