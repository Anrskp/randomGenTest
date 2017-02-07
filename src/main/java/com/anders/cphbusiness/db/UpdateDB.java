
package com.anders.cphbusiness.db;

import com.anders.cphbusiness.repositories.WagerBoardMarksRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;

public class UpdateDB {

    @Autowired
    private WagerBoardMarksRepo repo;

    @Async
    private void update() {
        while(true) {

                // get lastpoint -> newest.
                // submit to db

            try {
                Thread.sleep(1000); // 600000 ~ 10min.
            }catch(Exception e) {
                e.printStackTrace();
            }
        }
    }

}
