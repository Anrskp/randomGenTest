package com.anders.cphbusiness.numbersModel;

import lombok.Getter;

@Getter
public class numbersInfo {

    //FIELDS
    private int number;
    private int occurrences;

    public numbersInfo(int number, int occurrences) {
        this.number = number;
        this.occurrences = occurrences;
    }

    @Override
    public String toString() {
        return "numbersInfo{" +
                "number=" + number +
                ", occurrences=" + occurrences +
                '}';
    }
}
