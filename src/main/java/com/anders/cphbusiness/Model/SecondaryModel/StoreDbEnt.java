
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
    private String wagerIdentification;
    @Id
    private int boardNumber;
    @Id
    private int markSequenceNumber;
    @Id
    private int markNumber;
    @Column(columnDefinition = "bigint")
    private long couponTypeIdentification;
    @Column(columnDefinition = "bigint")
    private long wagerBoardQuickPickMarksBoard;

    protected StoreDbEnt() {

    }

    public StoreDbEnt(String wagerIdentification, int boardNumber,int markSequenceNumber, int markNumber, long couponTypeIdentification, long wagerBoardQuickPickMarksBoard ) {
    this.wagerIdentification = wagerIdentification;
    this.boardNumber = boardNumber;
    this.markSequenceNumber = markSequenceNumber;
    this.markNumber = markNumber;
    this.couponTypeIdentification = couponTypeIdentification;
    this.wagerBoardQuickPickMarksBoard = wagerBoardQuickPickMarksBoard;
    }


    @Override
    public String toString() {
        return "StoreDbEnt{" +
                "wagerIdentification='" + wagerIdentification + '\'' +
                ", boardNumber=" + boardNumber +
                ", markSequenceNumber=" + markSequenceNumber +
                ", markNumber=" + markNumber +
                ", couponTypeIdentification=" + couponTypeIdentification +
                ", wagerBoardQuickPickMarksBoard=" + wagerBoardQuickPickMarksBoard +
                '}';
    }
}
