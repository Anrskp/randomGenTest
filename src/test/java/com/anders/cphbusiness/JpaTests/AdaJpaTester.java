package com.anders.cphbusiness.JpaTests;

import com.anders.cphbusiness.Model.Repositories.PrimaryRepo.PoolgameTransactionRepo;
import com.anders.cphbusiness.Model.Repositories.PrimaryRepo.WagerBoardMarksRepo;
import com.anders.cphbusiness.Model.Repositories.PrimaryRepo.WagerBoardRepo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdaJpaTester {

    @Autowired
    PoolgameTransactionRepo pgRepo;

    @Autowired
    WagerBoardRepo wbRepo;

    @Autowired
    WagerBoardMarksRepo wbmRepo;

    int pgSize;
    int wbSize;
    int wbmSize;

    @Before
    public void setUp() {
        pgSize = pgRepo.findAll().size();
        wbSize = wbRepo.findAll().size();
        wbmSize = wbmRepo.findAll().size();
    }

    @Test
    public void fetchData() {

        assertThat(pgSize).isGreaterThan(0);
        assertThat(wbSize).isGreaterThan(0);
        assertThat(wbmSize).isGreaterThan(0);
    }

    @Test
    public void dataDistribution() {

        assertThat(wbSize).isEqualTo(pgSize * 10);
        assertThat(wbmSize).isEqualTo(wbSize * 7);
    }


}
