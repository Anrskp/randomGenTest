package com.anders.cphbusiness.Model.Repositories.PrimaryRepo;

import com.anders.cphbusiness.Model.PrimaryModel.WagerBoardMarks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.PersistenceContext;

@Repository
@PersistenceContext(name = "primaryEM")
public interface WagerBoardMarksRepo extends JpaRepository<WagerBoardMarks, String> {

}
