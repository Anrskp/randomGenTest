package com.anders.cphbusiness.RandomnessTests.numberInfo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NumbersInfo {

    //FIELDS
    private int number;
    private int occurrences;
    private float percentagesFromAverage;

    public NumbersInfo(int number, int occurrences) {
        this.number = number;
        this.occurrences = occurrences;
        float percent = percentagesFromAverage;
    }

    @Override
    public String toString() {
        return "NumbersInfo{" +
                "number=" + number +
                ", occurrences=" + occurrences +
                '}';
    }
}
