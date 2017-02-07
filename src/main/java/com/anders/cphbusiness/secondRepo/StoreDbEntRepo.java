package com.anders.cphbusiness.secondRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.anders.cphbusiness.storingModel.StoreDbEnt;

import javax.persistence.PersistenceContext;

@Repository
@PersistenceContext(name = "secondaryEM")
public interface StoreDbEntRepo extends JpaRepository<StoreDbEnt, String> {

}
