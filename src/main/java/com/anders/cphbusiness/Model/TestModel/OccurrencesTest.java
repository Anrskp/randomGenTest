package com.anders.cphbusiness.Model.TestModel;

import com.anders.cphbusiness.Model.TestResultsModel.NumbersInfo;

import java.util.ArrayList;
import java.util.Collections;

public class OccurrencesTest {

    // FIELDS
    private boolean testAccepted = true;
    private ArrayList<NumbersInfo> numbersInfoList = new ArrayList<>();

    // CONSTRUCTOR
    public OccurrencesTest() {
    }

    // METHODS
    public boolean occurrencesTester(ArrayList<Integer> rngNumbers) {
        Collections.sort(rngNumbers);

        // find occurrences of each number
        for (int i = 0; i < 99; i++) {

            int frequency = Collections.frequency(rngNumbers, i);

            NumbersInfo currentNumber = new NumbersInfo(i, frequency);

            if (frequency > 0) {
                numbersInfoList.add(currentNumber);
            }
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

        for (NumbersInfo NumbersInfo : numbersInfoList) {
            int number = NumbersInfo.getNumber();
            int occurrenceValue = NumbersInfo.getOccurrences();

            float res = (float) (occurrenceValue - average) / (average) * 100;
            NumbersInfo.setPercentagesFromAverage(res);

            if (res > 200 || res < -200) {
                testAccepted = false;
                System.out.println("number: " + number + " occurrences " + occurrenceValue + " percent above/below avarage: " + res );
            }
        }

        System.out.println("");

        System.out.println("average occurrences of numbers : " + average + "\n");

        System.out.println(" ** highest value detected **");
        System.out.println("number : " + numbersInfoList.get(numbersInfoList.size() - 1).getNumber());
        System.out.println("occurrences : " + numbersInfoList.get(numbersInfoList.size() - 1).getOccurrences());
        System.out.println("percent from average : " + numbersInfoList.get(numbersInfoList.size() - 1).getPercentagesFromAverage() + "%");

        System.out.println("");

        System.out.println(" ** lowest value detected **");
        System.out.println("number : " + numbersInfoList.get(0).getNumber());
        System.out.println("occurrences : " + numbersInfoList.get(0).getOccurrences());
        System.out.println("percent from average : " + numbersInfoList.get(0).getPercentagesFromAverage() + "%");

        System.out.println("");

        return testAccepted;
    }

}


