package com.anders.cphbusiness.repositories;

import com.anders.cphbusiness.entitiesModel.wagerBoardMarks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface wagerBoardMarksRepo extends JpaRepository<wagerBoardMarks, String> {
}