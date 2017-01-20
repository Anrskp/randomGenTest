package com.anders.cphbusiness.numbersModel;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class numbersInfo {

    //FIELDS
    private int number;
    private int occurrences;
    private float percentagesFromAverage;

    public numbersInfo(int number, int occurrences) {
        this.number = number;
        this.occurrences = occurrences;
        float percent = percentagesFromAverage;
    }

    @Override
    public String toString() {
        return "numbersInfo{" +
                "number=" + number +
                ", occurrences=" + occurrences +
                '}';
    }
}
