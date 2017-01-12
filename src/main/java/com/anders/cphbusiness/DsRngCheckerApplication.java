package com.anders.cphbusiness;

// project path: C:\Users\ekankp\IdeaProjects\dsRngChecker

// thread 1 - get data, store in storage db. if db storage higher then certain amount, delete x amount before getting x amount
// thread 2 - test randomness on data in storage db. ~ move scope

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsRngCheckerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsRngCheckerApplication.class, args);
	}
}
