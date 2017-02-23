
package com.anders.cphbusiness.Model.SecondaryModel;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Sort;

import javax.persistence.*;

@Entity
@Getter
@Setter
@IdClass(PK_StoreDbEnt.class)
public class StoreDbEnt {

    // FIELDS
    @Id
    @Column(columnDefinition = "nvarchar(20)")
    private String WagerIdentification;
    @Id
    private int BoardNumber;
    @Id
    private int MarkSequenceNumber;
    @Id
    private int MarkNumber;
    @Column(columnDefinition = "bigint")
    private long CouponTypeIdentification;
    @Column(columnDefinition = "bigint")
    private long WagerBoardQuickPickMarksBoard;

    protected StoreDbEnt() {

    }

    public StoreDbEnt(String WagerIdentification, int BoardNumber,int MarkSequenceNumber, int MarkNumber, long CouponTypeIdentification, long WagerBoardQuickPickMarksBoard ) {
    this.WagerIdentification = WagerIdentification;
    this.BoardNumber = BoardNumber;
    this.MarkSequenceNumber = MarkSequenceNumber;
    this.MarkNumber = MarkNumber;
    this.CouponTypeIdentification = CouponTypeIdentification;
    this.WagerBoardQuickPickMarksBoard = WagerBoardQuickPickMarksBoard;
    }

    @Override
    public String toString() {
        return "StoreDbEnt{" +
                "WagerIdentification='" + WagerIdentification + '\'' +
                ", BoardNumber=" + BoardNumber +
                ", MarkSequenceNumber=" + MarkSequenceNumber +
                ", MarkNumber=" + MarkNumber +
                ", CouponTypeIdentification=" + CouponTypeIdentification +
                ", WagerBoardQuickPickMarksBoard=" + WagerBoardQuickPickMarksBoard +
                '}';
    }
}
