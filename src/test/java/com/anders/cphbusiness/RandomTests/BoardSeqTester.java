package com.anders.cphbusiness.RandomTests;

import com.anders.cphbusiness.Controller.RandomTestController;
import com.anders.cphbusiness.Model.Repositories.SecondaryRepo.StoreDbEntRepo;
import com.anders.cphbusiness.Model.SecondaryModel.StoreDbEnt;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardSeqTester {

    @Autowired
    StoreDbEntRepo repo;

    RandomTestController rtc = new RandomTestController();


    @Test
    public void boardSeq() {

        ArrayList<StoreDbEnt> testData = new ArrayList<>();

        StoreDbEnt testEntBoardSeq1 = new StoreDbEnt("testEnt", 1, 1, 29, 0, 0, "web", new Date());
        StoreDbEnt testEntBoardSeq2 = new StoreDbEnt("testEnt", 1, 2, 23, 0, 0, "web", new Date());
        StoreDbEnt testEntBoardSeq3 = new StoreDbEnt("testEnt", 1, 3, 19, 0, 0, "web", new Date());
        StoreDbEnt testEntBoardSeq4 = new StoreDbEnt("testEnt", 1, 4, 23, 0, 0, "web", new Date());
        StoreDbEnt testEntBoardSeq5 = new StoreDbEnt("testEnt", 1, 5, 30, 0, 0, "web", new Date());
        StoreDbEnt testEntBoardSeq6 = new StoreDbEnt("testEnt", 1, 6, 14, 0, 0, "web", new Date());
        StoreDbEnt testEntBoardSeq7 = new StoreDbEnt("testEnt", 1, 7, 35, 0, 0, "web", new Date());

        StoreDbEnt testEntBoardSeq01 = new StoreDbEnt("testEnt2", 1, 1, 29, 0, 0, "web", new Date());
        StoreDbEnt testEntBoardSeq02 = new StoreDbEnt("testEnt2", 1, 2, 23, 0, 0, "web", new Date());
        StoreDbEnt testEntBoardSeq03 = new StoreDbEnt("testEnt2", 1, 3, 19, 0, 0, "web", new Date());
        StoreDbEnt testEntBoardSeq04 = new StoreDbEnt("testEnt2", 1, 4, 23, 0, 0, "web", new Date());
        StoreDbEnt testEntBoardSeq05 = new StoreDbEnt("testEnt2", 1, 5, 30, 0, 0, "web", new Date());
        StoreDbEnt testEntBoardSeq06 = new StoreDbEnt("testEnt2", 1, 6, 14, 0, 0, "web", new Date());
        StoreDbEnt testEntBoardSeq07 = new StoreDbEnt("testEnt2", 1, 7, 35, 0, 0, "web", new Date());

        testData.add(testEntBoardSeq1);
        testData.add(testEntBoardSeq2);
        testData.add(testEntBoardSeq3);
        testData.add(testEntBoardSeq4);
        testData.add(testEntBoardSeq5);
        testData.add(testEntBoardSeq6);
        testData.add(testEntBoardSeq7);

        testData.add(testEntBoardSeq01);
        testData.add(testEntBoardSeq02);
        testData.add(testEntBoardSeq03);
        testData.add(testEntBoardSeq04);
        testData.add(testEntBoardSeq05);
        testData.add(testEntBoardSeq06);
        testData.add(testEntBoardSeq07);

        repo.save(testData);
        int daysEarlier = 7;
        Date dataToDate = new Date();
        Date dataFromDate = new Date(dataToDate.getTime() - TimeUnit.DAYS.toMillis(daysEarlier));

        List<StoreDbEnt> data = repo.findByDates(dataFromDate, dataToDate, "web");

        assertThat(rtc.boardSeqTest(data).isTestPassed()).isEqualTo(false);
        assertThat(rtc.boardSeqTest(data).getRepeatedSeqs().get(0)).isEqualTo("29 23 19 23 30 14 35");

        // clean up
        repo.delete(testData);

        assertThat(rtc.boardSeqTest(repo.findByDates(dataFromDate, dataToDate, "web")).isTestPassed()).isEqualTo(true);
    }




}
