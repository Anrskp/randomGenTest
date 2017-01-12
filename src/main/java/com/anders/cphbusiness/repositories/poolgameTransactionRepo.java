package com.anders.cphbusiness.repositories;

import com.anders.cphbusiness.model.poolgameTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface poolgameTransactionRepo extends JpaRepository<poolgameTransaction, String> {

}
