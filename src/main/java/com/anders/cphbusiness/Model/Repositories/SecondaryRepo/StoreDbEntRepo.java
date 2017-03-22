package com.anders.cphbusiness.Model.Repositories.SecondaryRepo;

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

    @Query("select sd from StoreDbEnt sd where sd.insertedDate between ?1 and ?2 and sd.salesChannel = ?3 order by sd.insertedDate, sd.wagerIdentification, sd.boardNumber, sd.markSequenceNumber")
    List<StoreDbEnt> findWeekOld(Date fromDate, Date toDate, String salesChannel);

}
