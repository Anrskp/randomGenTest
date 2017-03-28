package com.anders.cphbusiness.RandomTests;

import com.anders.cphbusiness.Controller.RandomTestController;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RunsTester {

    RandomTestController rtc = new RandomTestController();

    @Before
    public void setUp() {

    }

    @After
    public void TearDown() {

    }

    @Test
    public void runsTestFail() {

        String testString = "123456789";
        ArrayList<Integer> testArray = new ArrayList<>();

        for (int i = 0; i < testString.length(); i++) {
            testArray.add((int) testString.charAt(i) - '0'); // - '0' to convert unicode to western digits
        }

        assertThat(rtc.runsTest(testArray).isTestPassed()).isEqualTo(false);
    }

    @Test
    public void RunsTestSuccess() {
        String testString = "479498178384298318985419587978299873732191271121234498738328991856512392278928619988292883219239989";
        ArrayList<Integer> testArray = new ArrayList<>();

        for (int i = 0; i < testString.length(); i++) {
            testArray.add((int) testString.charAt(i) - '0'); // - '0' to convert unicode to western digits
        }

        assertThat(rtc.runsTest(testArray).isTestPassed()).isEqualTo(true);
        assertThat(rtc.runsTest(testArray).getU()).isEqualTo(48.073685f);
        assertThat(rtc.runsTest(testArray).getO()).isEqualTo(4.803431908034695);
        assertThat(rtc.runsTest(testArray).getZ()).isEqualTo(-0.43170898059659435);
    }
}
