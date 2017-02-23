package com.anders.cphbusiness.DB;

import com.anders.cphbusiness.Model.PrimaryModel.WagerBoard;
import com.anders.cphbusiness.Repositories.primaryRepo.WagerBoardMarksRepo;
import com.anders.cphbusiness.Repositories.primaryRepo.WagerBoardRepo;
import com.anders.cphbusiness.Repositories.secondaryRepo.StoreDbEntRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class UpdateStoreDB {

    @Autowired
    private WagerBoardMarksRepo loadRepo;

    @Autowired
    private WagerBoardRepo loadRepoTest;

    @Autowired
    private StoreDbEntRepo storeRepo;

    @Scheduled(fixedDelay = 10000) // 1000 millis * 1800 seconds = 30 minutes
    public void update() {

        System.out.println(loadRepoTest.findAllTest().size());
        System.out.println("testing fixedDelay @Scheduled task");

    }
}
