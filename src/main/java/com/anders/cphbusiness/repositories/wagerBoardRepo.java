package com.anders.cphbusiness.repositories;

import com.anders.cphbusiness.model.wagerBoard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface wagerBoardRepo extends JpaRepository<wagerBoard, String> {

}
