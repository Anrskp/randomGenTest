/*
package com.anders.cphbusiness.DB;

import com.anders.cphbusiness.Repositories.primaryRepo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.anders.cphbusiness.Controller.DbSeederController;

@Component
public class DbSeeder implements CommandLineRunner {

    //FIELDS
    private DbSeederController DBSC = new DbSeederController();
    @Autowired
    private WagerBoardRepo wagerBoardRepo;
    @Autowired
    private WagerBoardMarksRepo wagerBoardMarksRepo;
    @Autowired
    private PoolgameTransactionRepo PoolgameTransactionRepo;


    @Autowired
    // CONSTRUCTOR
    public DbSeeder(WagerBoardRepo wagerBoardRepo, WagerBoardMarksRepo wagerBoardMarksRepo, PoolgameTransactionRepo PoolgameTransactionRepo) {
        this.wagerBoardRepo = wagerBoardRepo;
        this.wagerBoardMarksRepo = wagerBoardMarksRepo;
        this.PoolgameTransactionRepo = PoolgameTransactionRepo;
    }


    @Override
    public void run(String... args) throws Exception {

        long startTime = System.currentTimeMillis();

        // create entities.
        EntData EntData = DBSC.generateEntitiesData(10);

        // save entities to DB.
        boolean success = false;
        try {
            wagerBoardRepo.save(EntData.getWagerBoards());
            wagerBoardMarksRepo.save(EntData.getWagerBoardMarks());
            poolgameTransactionRepo.save(EntData.getPoolgameTransactions());
            success = true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        if (success) {
            long endTime = System.currentTimeMillis();
            long timeSpend = endTime - startTime;

            System.out.println("time spend creating and saving entities : " + timeSpend + "ms");
        }

    }
}
*/