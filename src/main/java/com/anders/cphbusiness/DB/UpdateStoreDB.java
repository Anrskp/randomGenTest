package com.anders.cphbusiness.DB;

import com.anders.cphbusiness.Model.SecondaryModel.StoreDbEnt;
import com.anders.cphbusiness.Repositories.primaryRepo.WagerBoardMarksRepo;
import com.anders.cphbusiness.Repositories.primaryRepo.WagerBoardRepo;
import com.anders.cphbusiness.Repositories.secondaryRepo.StoreDbEntRepo;
import org.hibernate.annotations.Sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UpdateStoreDB {

    @Autowired
    private WagerBoardMarksRepo loadRepo;

    @Autowired
    private WagerBoardRepo loadRepoTest;

    @Autowired
    private StoreDbEntRepo storeRepo;

    @Scheduled(fixedDelay = 1000000000) // 1000 millis * 1800 seconds = 30 minutes
    public void update() {

        List<Object[]> testInput = loadRepoTest.findAllTest();
        ArrayList<StoreDbEnt> saveInput = new ArrayList<>();

        for (Object[] tp : testInput) {
            StoreDbEnt newEnt = new StoreDbEnt(tp[0].toString(), (int) tp[1], (int) tp[2], (int) tp[3], (long) tp[4], (long) tp[5]);
            saveInput.add(newEnt);
        }

        try {
            storeRepo.save(saveInput);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("testing fixedDelay @Scheduled task");

    }
}
