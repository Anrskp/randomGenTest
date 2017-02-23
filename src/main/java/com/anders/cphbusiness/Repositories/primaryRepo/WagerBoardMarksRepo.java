package com.anders.cphbusiness.Repositories.primaryRepo;

import com.anders.cphbusiness.Model.PrimaryModel.WagerBoard;
import com.anders.cphbusiness.Model.PrimaryModel.WagerBoardMarks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@PersistenceContext(name = "primaryEM")
public interface WagerBoardMarksRepo extends JpaRepository<WagerBoardMarks, String> {

}
