package com.anders.cphbusiness.db;

import com.anders.cphbusiness.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.anders.cphbusiness.controller.dbSeederController;

@Component
public class dbSeeder implements CommandLineRunner {

    //FIELDS
    private dbSeederController DBSC = new dbSeederController();

    private wagerBoardRepo wagerBoardRepo;
    private wagerBoardMarksRepo wagerBoardMarksRepo;
    private poolgameTransactionRepo poolgameTransactionRepo;

    @Autowired
    // CONSTRUCTOR
    public dbSeeder(wagerBoardRepo wagerBoardRepo, wagerBoardMarksRepo wagerBoardMarksRepo, poolgameTransactionRepo poolgameTransactionRepo) {
        this.wagerBoardRepo = wagerBoardRepo;
        this.wagerBoardMarksRepo = wagerBoardMarksRepo;
        this.poolgameTransactionRepo = poolgameTransactionRepo;
    }

    @Override
    public void run(String... args) throws Exception {

/*
        // create entities.
        entData entData = DBSC.generateEntitiesData(10);

        // save entities to db.
        wagerBoardRepo.save(entData.getWagerBoards());
        wagerBoardMarksRepo.save(entData.getWagerBoardMarks());
        poolgameTransactionRepo.save(entData.getPoolgameTransactions());

*/

    }
}
