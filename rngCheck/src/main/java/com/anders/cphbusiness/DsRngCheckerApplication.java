package com.anders.cphbusiness;

import com.anders.cphbusiness.controller.randomTestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class DsRngCheckerApplication {

    // FIELDS
    private static randomTestController RTC = new randomTestController();

    public static void main(String[] args) {
        SpringApplication.run(DsRngCheckerApplication.class, args);
    }

/*
    @Async
    @Bean
    public CommandLineRunner test(wagerBoardMarksRepo repo) {
        return args -> {

            while (true) {
                ArrayList<Integer> allNumbers = new ArrayList<>();

                for (wagerBoardMarks wagerBoardMarks : repo.findAll()) {
                    allNumbers.add(wagerBoardMarks.getMarkNumber());
                }

                // runs test
                System.out.println("test conclusion : " + RTC.runsTest(allNumbers).isTestConclusion());

                // occurrences test
                RTC.occurrencesTest(allNumbers);

                // sleep
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
    }
*/

}
