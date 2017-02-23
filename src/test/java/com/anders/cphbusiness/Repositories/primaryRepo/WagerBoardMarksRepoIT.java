package com.anders.cphbusiness.Repositories.primaryRepo;

import com.anders.cphbusiness.Model.PrimaryModel.WagerBoard;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WagerBoardMarksRepoIT {

    @Autowired WagerBoardMarksRepo repo;

    @Test
    public void findAllTest() throws Exception {
        //List<WagerBoard> boards = repo.findAllTest();
        //System.out.println("boards = " + boards.size());
    }

}