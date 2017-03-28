package com.anders.cphbusiness.JpaTests;

import com.anders.cphbusiness.Model.Repositories.SecondaryRepo.StoreDbEntRepo;
import com.anders.cphbusiness.Model.SecondaryModel.StoreDbEnt;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StorageJpaTester {

    @Autowired
    StoreDbEntRepo repo;

    // test entity
    StoreDbEnt testEnt = new StoreDbEnt("testEnt", 1, 1, 1, 0, 0, "web", new Date());

    @Test
    public void insertTest() {

            repo.save(testEnt);
            StoreDbEnt testEnt = (repo.findByWagerID("testEnt").get(0));

            assertThat(testEnt.getWagerIdentification()).isEqualTo("testEnt");

            repo.delete(testEnt);
    }
}
