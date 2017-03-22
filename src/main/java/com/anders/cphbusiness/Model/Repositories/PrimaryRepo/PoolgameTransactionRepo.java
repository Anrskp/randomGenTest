package com.anders.cphbusiness.Model.Repositories.PrimaryRepo;

import com.anders.cphbusiness.Model.PrimaryModel.PoolgameTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.PersistenceContext;

@Repository
@PersistenceContext(name = "primaryEM")
public interface PoolgameTransactionRepo extends JpaRepository<PoolgameTransaction, String> {

}
