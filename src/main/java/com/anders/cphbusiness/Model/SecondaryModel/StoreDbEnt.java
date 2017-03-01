
package com.anders.cphbusiness.Model.SecondaryModel;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.util.Date;

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
    @Column(columnDefinition = "datetime2 default 'null'")
    private Date insertedDate;
    @Column(columnDefinition = "nvarchar(255)")
    private String salesChannel;


    protected StoreDbEnt() {

    }

    public StoreDbEnt(String wagerIdentification, int boardNumber, int markSequenceNumber, int markNumber, long couponTypeIdentification, long wagerBoardQuickPickMarksBoard, String salesChannel, Date insertedDate) {
        this.wagerIdentification = wagerIdentification;
        this.boardNumber = boardNumber;
        this.markSequenceNumber = markSequenceNumber;
        this.markNumber = markNumber;
        this.couponTypeIdentification = couponTypeIdentification;
        this.wagerBoardQuickPickMarksBoard = wagerBoardQuickPickMarksBoard;
        this.salesChannel = salesChannel;
        this.insertedDate = insertedDate;

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
                ", insertedDate=" + insertedDate +
                ", salesChannel='" + salesChannel + '\'' +
                '}';
    }
}
