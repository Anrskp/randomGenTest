package com.anders.cphbusiness.Repositories.primaryRepo;

import com.anders.cphbusiness.Model.PrimaryModel.WagerBoard;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@PersistenceContext(name = "primaryEM")
public interface WagerBoardRepo extends JpaRepository<WagerBoard, String> {

    @Query(value = "select wm.WagerIdentification, wm.BoardNumber, wm.MarkSequenceNumber, wm.MarkNumber," +
            " pt.CouponTypeIdentification, pt.WagerBoardQuickPickMarksBoard " +
            "from WagerBoard wb " +
            "inner join wb.listOfWagerMarks wm  " +
            "inner join wb.poolgameTransaction pt  " +
            "where wb.WagerIdentification = wm.WagerIdentification and wb.BoardNumber = wm.BoardNumber and wb.GameIdentification = wm.GameIdentification and wm.meta_IsCurrent = 1 " +
            "and wb.TransactionIdentification = pt.TransactionIdentification and pt.meta_IsCurrent = 1 " +
            "and (wb.meta_IsCurrent = 1) " +
            "order by wm.WagerIdentification desc, wm.BoardNumber desc, wm.MarkNumber desc")

    List<Object[]> findAllTest();

}
