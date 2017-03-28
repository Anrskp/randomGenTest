package com.anders.cphbusiness.RandomTests;

import com.anders.cphbusiness.Controller.RandomTestController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OccurrencesDataTester {

    RandomTestController rtc = new RandomTestController();

    ArrayList<Integer> rngNumbers = new ArrayList<>();



    @Test
    public void getOccurrencesData() {

        for(int i = 1; i < 37; i++) {
            rngNumbers.add(i);
        }

        assertThat(rtc.occurrencesData(rngNumbers).size()).isGreaterThan(0);
    }
}
