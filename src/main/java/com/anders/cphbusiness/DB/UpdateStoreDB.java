package com.anders.cphbusiness.DB;

import com.anders.cphbusiness.Model.SecondaryModel.StoreDbEnt;
import com.anders.cphbusiness.Repositories.primaryRepo.WagerBoardRepo;
import com.anders.cphbusiness.Repositories.secondaryRepo.StoreDbEntRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
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

        List<Object[]> testInput = loadRepoTest.findAllTest(); // from latest date fetched to current.
        ArrayList<StoreDbEnt> saveInput = new ArrayList<>();

        for (Object[] tp : testInput) {
            StoreDbEnt newEnt = new StoreDbEnt(tp[0].toString(), (int) tp[1], (int) tp[2], (int) tp[3], (long) tp[4], (long) tp[5]);
            saveInput.add(newEnt);
        }

        try {
            System.out.println("fetching from ADA to storeDB");
            if (saveInput.size() == 0) {
                System.out.println("empty");
            } else {

                //storeRepo.save(saveInput);
            }

            // sort in repo select example.
            //System.out.println(storeRepo.findAll(new Sort("WagerIdentification", "boardNumber", "markSequenceNumber")));

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
