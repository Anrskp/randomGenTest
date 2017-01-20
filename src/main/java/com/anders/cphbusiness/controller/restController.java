package com.anders.cphbusiness.controller;

import com.anders.cphbusiness.repositories.wagerBoardMarksRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.anders.cphbusiness.entitiesModel.*;

import java.util.ArrayList;
import java.util.Collections;

@RestController
public class restController {

    // FIELDS
    @Autowired
    private wagerBoardMarksRepo repo;
    private randomTestController testCtrl = new randomTestController();

    // CONSTRUCTOR
    public restController() {
    }

    // METHODS
    @RequestMapping("/rngCheck")
    public String testFeedback() {

        ArrayList<Integer> randomNumbers = new ArrayList<>();

        for (wagerBoardMarks wagerBoardMarks : repo.findAll()) {
            randomNumbers.add(wagerBoardMarks.getMarkNumber());
        }

        boolean runsTestRes = testCtrl.runsTest(randomNumbers).isTestConclusion();
        boolean occurrencesTestRes = (testCtrl.occurrencesTest(randomNumbers));

        return "" + runsTestRes + " " + occurrencesTestRes;
    }

    // frequency test of board sequence
    @RequestMapping("/test")
    public boolean test() {

        ArrayList<wagerBoardMarks> seq = new ArrayList<>();
        boolean noDups = true;

        for (wagerBoardMarks wagerBoardMarks : repo.findAll()) {
            seq.add(wagerBoardMarks);
        }

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

        // check for duplicates in board sequences
        for (String number : allSeqs) {
            //System.out.println(number);
            int frequency = Collections.frequency(allSeqs, number);

            if (frequency > 1) {
                noDups = false;
                System.out.println(number + " is repeat " + frequency + " times");
            } else noDups = true;
        }

        return noDups;
    }
}
