package com.anders.cphbusiness.RandomnessTests.numberInfo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SequenceInfo {

    String combination;
    int duplicateAmount;

    public SequenceInfo(String combination, int duplicateAmount) {
        this.combination = combination;
        this.duplicateAmount = duplicateAmount;
    }

    @Override
    public String toString() {
        return "SequenceInfo{" +
                "combination='" + combination + '\'' +
                ", duplicateAmount=" + duplicateAmount +
                '}';
    }
}
