package com.anders.cphbusiness.DbSeeder;

import com.anders.cphbusiness.Model.SecondaryModel.StoreDbEnt;
import com.anders.cphbusiness.Model.Repositories.PrimaryRepo.WagerBoardRepo;
import com.anders.cphbusiness.Model.Repositories.SecondaryRepo.StoreDbEntRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Component
public class UpdateStoreDB {

    @Autowired
    private WagerBoardRepo loadRepoTest;

    @Autowired
    private StoreDbEntRepo storeRepo;

    @Scheduled(fixedRate = 600000) // ~ 600k milli sec = 10min.
    public void update() {

        Date getFromDate = storeRepo.findNewestDate();
        List<Object[]> testInput;

        if (getFromDate == null) {
            testInput = loadRepoTest.findAllTest();
        } else {
            testInput = loadRepoTest.findAllFromDate(getFromDate);
        }

        if (testInput.size() == 0) {
            System.out.println("StoreDB is up to date");
        } else {

            ArrayList<StoreDbEnt> saveInput = new ArrayList<>();

            for (Object[] tp : testInput) {
                StoreDbEnt newEnt = new StoreDbEnt(tp[0].toString(), (int) tp[1], (int) tp[2], (int) tp[3], (long) tp[4], (long) tp[5], tp[6].toString(), (Date) tp[7]);
                saveInput.add(newEnt);
            }

            long startTime = System.currentTimeMillis();

            try {
                System.out.println("fetching data from ADA to storeDB");
                if (saveInput.size() == 0) {
                    System.out.println("ADA was empty!");
                } else {
                    //storeRepo.save(saveInput);

                    // Batch insert
                    /*
                    int batchSize = 20;
                    for (int i = 0; i < saveInput.size(); i++) {
                        storeRepo.save(saveInput.get(i));

                        if (i % batchSize == 0 && i > 0) {
                            storeRepo.flush();
                        }

                    }
*/
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

            long endTime = System.currentTimeMillis();
            long difference = endTime - startTime;

            System.out.println((float) TimeUnit.MILLISECONDS.toMinutes(difference) + " minutes");
            System.out.println(difference + " milliseconds");
        }

    }

}
