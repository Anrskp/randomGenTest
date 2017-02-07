package com.anders.cphbusiness.repositories;

import com.anders.cphbusiness.entitiesModel.PoolgameTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PoolgameTransactionRepo extends JpaRepository<PoolgameTransaction, String> {

}
