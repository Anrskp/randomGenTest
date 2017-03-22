package com.anders.cphbusiness.RandomnessTests.TestModel;

import com.anders.cphbusiness.RandomnessTests.numberInfo.NumbersInfo;

import java.util.ArrayList;
import java.util.Collections;

public class OccurrencesStaticData {

    // constructor
    public OccurrencesStaticData() {
    }

    // methods
    public ArrayList<NumbersInfo> staticOccurrences(ArrayList<Integer> rngNumbers) {
        ArrayList<NumbersInfo> staticOccuData = new ArrayList<>();
        for (int i = 1; i < 37; i++) {

            int frequency = Collections.frequency(rngNumbers, i);
            NumbersInfo currentNumber = new NumbersInfo(i, frequency);

            staticOccuData.add(currentNumber);
        }

        // average occurrences
        int sumOfOccurrences = 0;
        int average;

        for (NumbersInfo aNumbersInfoList : staticOccuData) {
            sumOfOccurrences += aNumbersInfoList.getOccurrences();
        }

        average = sumOfOccurrences / staticOccuData.size();

        for (NumbersInfo NumbersInfo : staticOccuData) {

            int number = NumbersInfo.getNumber();
            int occurrenceValue = NumbersInfo.getOccurrences();

            float res = (float) (occurrenceValue - average) / (average) * 100;
            NumbersInfo.setPercentagesFromAverage(res);
        }


        return staticOccuData;
    }
}
