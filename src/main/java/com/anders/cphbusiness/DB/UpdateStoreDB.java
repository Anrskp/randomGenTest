package com.anders.cphbusiness.DB;

import com.anders.cphbusiness.Repositories.primaryRepo.WagerBoardMarksRepo;
import com.anders.cphbusiness.Repositories.secondaryRepo.StoreDbEntRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class UpdateStoreDB {

    @Autowired
    private WagerBoardMarksRepo LoadRepo;

    @Autowired
    private StoreDbEntRepo StoreRepo;

    @Scheduled(fixedDelay = 10000) // 1000 millis * 1800 seconds = 30 minutes
    public void update() {

        // get from load repo - from store repo latest till present load repo.
        // save to store repo

    }
}
