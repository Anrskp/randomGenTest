package com.anders.cphbusiness.db;

import com.anders.cphbusiness.controller.randomTestController;
import com.anders.cphbusiness.testForRandomess.runsTest;
import com.anders.cphbusiness.repositories.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.anders.cphbusiness.controller.dbSeederController;
import com.anders.cphbusiness.model.*;

import java.util.ArrayList;

@Component
public class dbSeeder implements CommandLineRunner {

    //FIELDS
    private static final Logger log = LoggerFactory.getLogger(dbSeeder.class);
    private dbSeederController DBSC = new dbSeederController();
    private randomTestController RTC = new randomTestController();

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

        // find all numbers (mark numbers) played.
        ArrayList<Integer> allNumbers = new ArrayList<>();

        // get certain amount
        for (wagerBoardMarks wagerBoardMarks : wagerBoardMarksRepo.findAll()) {
            allNumbers.add(wagerBoardMarks.getMarkNumber());
        }

        System.out.println("test conclusion : " + RTC.runsTest(allNumbers).isTestConclusion());
        RTC.occurrencesTest(allNumbers);

        // find all number-sequences (Board combinations) played.


    }
}
