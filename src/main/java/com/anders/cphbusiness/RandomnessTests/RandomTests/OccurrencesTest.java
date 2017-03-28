package com.anders.cphbusiness.RandomnessTests.RandomTests;

import com.anders.cphbusiness.RandomnessTests.TestResults.OccuTestResult;
import com.anders.cphbusiness.RandomnessTests.numberInfo.NumbersInfo;

import java.util.ArrayList;
import java.util.Collections;

public class OccurrencesTest {

    // FIELDS
    private ArrayList<NumbersInfo> numbersInfoList = new ArrayList<>();

    // CONSTRUCTOR
    public OccurrencesTest() {
    }

    // METHODS
    public OccuTestResult occurrencesTester(ArrayList<Integer> rngNumbers) {
        boolean testAccepted = true;
        Collections.sort(rngNumbers);

        // find occurrences of each number
        // numbers range 1-36
        for (int i = 1; i < 37; i++) {

            int frequency = Collections.frequency(rngNumbers, i);

            NumbersInfo currentNumber = new NumbersInfo(i, frequency);
            numbersInfoList.add(currentNumber);
        }

        // average occurrences
        int sumOfOccurrences = 0;
        int average;

        for (NumbersInfo aNumbersInfoList : numbersInfoList) {
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

        // set percent deviation
        for (NumbersInfo NumbersInfo : numbersInfoList) {

            int number = NumbersInfo.getNumber();
            int occurrenceValue = NumbersInfo.getOccurrences();

            float res = (float) (occurrenceValue - average) / (average) * 100;
            NumbersInfo.setPercentagesFromAverage(res);

            int maxPercentDeviationAccepted = 200;
            if (res > maxPercentDeviationAccepted || res < -maxPercentDeviationAccepted) {
                testAccepted = false;
            }
        }

        // get highest and lowest number occurrences
        ArrayList<NumbersInfo> lowest = new ArrayList<>();
        ArrayList<NumbersInfo> highest = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            lowest.add(numbersInfoList.get(i));
            highest.add(numbersInfoList.get(numbersInfoList.size() - (i + 1)));
        }

        OccuTestResult occuTestRes = new OccuTestResult(testAccepted, average, highest, lowest);

        numbersInfoList.clear();
        return occuTestRes;
    }
}


