package com.anders.cphbusiness.repositories;

import com.anders.cphbusiness.entitiesModel.WagerBoard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.PersistenceContext;

@Repository
@PersistenceContext(name = "primaryEM")
public interface WagerBoardRepo extends JpaRepository<WagerBoard, String> {

}
