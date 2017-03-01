package com.anders.cphbusiness.Repositories.secondaryRepo;

import com.anders.cphbusiness.Model.SecondaryModel.StoreDbEnt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.PersistenceContext;
import java.util.Date;
import java.util.List;

@Repository
@PersistenceContext(name = "secondaryEM")
public interface StoreDbEntRepo extends JpaRepository<StoreDbEnt, String> {

    @Query("select max (sd.insertedDate) from StoreDbEnt sd ")
    Date findNewestDate();

}
