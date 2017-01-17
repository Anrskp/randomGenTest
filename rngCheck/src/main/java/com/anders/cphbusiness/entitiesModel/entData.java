package com.anders.cphbusiness.entitiesModel;


import java.util.List;


public class entData {

    // FIELDS
    private List<wagerBoard> wagerBoards;
    private List<wagerBoardMarks> wagerBoardMarks;
    private List<poolgameTransaction> poolgameTransactions;

    public entData(List<wagerBoard> wagerBoard, List<wagerBoardMarks> wagerBoardMarks, List<poolgameTransaction> poolgameTransaction) {
        this.wagerBoards = wagerBoard;
        this.wagerBoardMarks = wagerBoardMarks;
        this.poolgameTransactions = poolgameTransaction;
    }

    public List<wagerBoard> getWagerBoards() {
        return this.wagerBoards;
    }

    public List<wagerBoardMarks> getWagerBoardMarks() {
        return this.wagerBoardMarks;
    }

    public List<poolgameTransaction> getPoolgameTransactions() {
        return this.poolgameTransactions;
    }
}
