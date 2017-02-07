package com.anders.cphbusiness.entitiesModel;


import java.util.List;


public class EntData {

    // FIELDS
    private List<WagerBoard> wagerBoards;
    private List<WagerBoardMarks> wagerBoardMarks;
    private List<PoolgameTransaction> poolgameTransactions;

    public EntData(List<WagerBoard> wagerBoard, List<WagerBoardMarks> wagerBoardMarks, List<PoolgameTransaction> poolgameTransaction) {
        this.wagerBoards = wagerBoard;
        this.wagerBoardMarks = wagerBoardMarks;
        this.poolgameTransactions = poolgameTransaction;
    }

    public List<WagerBoard> getWagerBoards() {
        return this.wagerBoards;
    }

    public List<WagerBoardMarks> getWagerBoardMarks() {
        return this.wagerBoardMarks;
    }

    public List<PoolgameTransaction> getPoolgameTransactions() {
        return this.poolgameTransactions;
    }
}
