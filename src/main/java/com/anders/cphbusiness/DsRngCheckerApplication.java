package com.anders.cphbusiness;

import com.anders.cphbusiness.controller.randomTestController;
import com.anders.cphbusiness.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Async;
import com.anders.cphbusiness.entitiesModel.*;

import java.util.ArrayList;

@SpringBootApplication

public class DsRngCheckerApplication {

    // FIELDS
    private static randomTestController RTC = new randomTestController();

    @Autowired
    private static wagerBoardMarksRepo repo;

    public static void main(String[] args) {
        SpringApplication.run(DsRngCheckerApplication.class, args);

        //System.out.println(repo.findAll());
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
