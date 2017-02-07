package com.anders.cphbusiness.Repositories.primaryRepo;

import com.anders.cphbusiness.Model.PrimaryModel.PoolgameTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PoolgameTransactionRepo extends JpaRepository<PoolgameTransaction, String> {

}
