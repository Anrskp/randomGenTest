package com.anders.cphbusiness.controller;

import com.anders.cphbusiness.repositories.wagerBoardMarksRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restController {

    // FIELDS
    @Autowired
    private wagerBoardMarksRepo repo;

    // CONSTRUCTOR
    public restController() {
    }

    // METHODS
    @RequestMapping("/findAll")
    public String test() {
        return "" + repo.findAll();
    }
}
