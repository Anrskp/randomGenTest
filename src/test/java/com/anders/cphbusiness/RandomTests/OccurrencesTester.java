package com.anders.cphbusiness.RandomTests;

import com.anders.cphbusiness.Controller.RandomTestController;
import com.anders.cphbusiness.RandomnessTests.TestResults.OccuTestResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OccurrencesTester {

    RandomTestController rtc = new RandomTestController();

    @Test
    public void OccurrencesTest() {

        ArrayList<Integer> rngNumbers = new ArrayList<>();

        for (int i = 1; i < 47; i++) {
            rngNumbers.add(i);
        }

        OccuTestResult res = rtc.occurrencesTest(rngNumbers);

        assertThat(res.isTestPassed()).isEqualTo(true);
        assertThat(res.getAverageOccurrence()).isEqualTo(1);

        for (int i = 1; i < 4; i++) {
            rngNumbers.add(4);
        }

        OccuTestResult res2 = rtc.occurrencesTest(rngNumbers);

        assertThat(res2.isTestPassed()).isEqualTo(false);

    }

}
