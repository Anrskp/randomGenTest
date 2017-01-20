package com.anders.cphbusiness.testModel;

import com.anders.cphbusiness.numbersModel.numbersInfo;

import java.util.ArrayList;
import java.util.Collections;

public class occurrencesTest {

    //FIELDS
    private boolean testAccepted = true;
    private ArrayList<numbersInfo> numbersInfoList = new ArrayList<>();

    // CONSTRUCTOR
    public occurrencesTest() {
    }

    //METHODS
    public boolean occurrencesTester(ArrayList<Integer> rngNumbers) {
        Collections.sort(rngNumbers);

        // find occurrences of each number
        for (int i = 0; i < 99; i++) {

            int frequency = Collections.frequency(rngNumbers, i);

            numbersInfo number = new numbersInfo(i, frequency);

            if (frequency > 0) {
                numbersInfoList.add(number);
            }
        }

        // average occurrences
        int sumOfOccurrences = 0;
        int average;
        for (numbersInfo aNumbersInfoList : numbersInfoList) {
            sumOfOccurrences += aNumbersInfoList.getOccurrences();
        }

        average = sumOfOccurrences / numbersInfoList.size();

        // sort by occurrences
        numbersInfoList.sort((number1, number2) -> {
            if (number1.getOccurrences() > number2.getOccurrences())
                return 1;
            if (number1.getOccurrences() < number2.getOccurrences())
                return -1;
            return 0;
        });

        for (numbersInfo numbersInfo : numbersInfoList) {
            int number = numbersInfo.getNumber();
            int occurrenceValue = numbersInfo.getOccurrences();

            float res = (float) (occurrenceValue - average) / (average) * 100;
            numbersInfo.setPercentagesFromAverage(res);

            if (res > 200) {
                testAccepted = false;
            }

            System.out.println("number: " + number + " repeats: " + occurrenceValue + " percent above/under average: " + res);
        }


        return testAccepted;
    }

}


