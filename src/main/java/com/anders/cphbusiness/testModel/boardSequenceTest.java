package com.anders.cphbusiness.testModel;

import com.anders.cphbusiness.entitiesModel.wagerBoardMarks;

import java.util.ArrayList;
import java.util.Collections;

public class boardSequenceTest {

    //FIELDS

    //CONSTRUCTOR
    public boardSequenceTest() {
    }

    //METHODS
    public boolean checkBoardDups(ArrayList<wagerBoardMarks> seq) {
        boolean noDups = true;

        // sort by wager identification
        seq.sort((number1, number2) -> {
            if (Integer.parseInt(number1.getWagerIdentification()) > Integer.parseInt(number2.getWagerIdentification()))
                return 1;
            if (Integer.parseInt(number1.getWagerIdentification()) < Integer.parseInt(number2.getWagerIdentification()))
                return -1;
            return 0;
        });

        ArrayList<String> allSeqs = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (wagerBoardMarks aSeq : seq) {

            sb.append(aSeq.getMarkNumber()).append(" ");

            if (aSeq.getMarkSequenceNumber() == 7) {
                String test = sb.toString();
                allSeqs.add(test);

                // reset stringBuilder
                sb.setLength(0);
            }
        }

        //System.out.println(allSeqs);

        // check for duplicates in board sequences
        for (String number : allSeqs) {
            //System.out.println(number);
            int frequency = Collections.frequency(allSeqs, number);

            if (frequency > 1) {
                noDups = false;
                System.out.println(number + " is repeat " + frequency + " times");
            }
        }
        return noDups;
    }
}
