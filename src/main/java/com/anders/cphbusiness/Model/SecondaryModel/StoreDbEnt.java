
package com.anders.cphbusiness.Model.SecondaryModel;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class StoreDbEnt {

    // FIELDS
    int BoardNumber;
    @Id
    @Column(columnDefinition = "nvarchar(20)")
    String GameIdentification;
    int MarkSequenceNumber;
    int MarkNumber;

    protected StoreDbEnt() {

    }

    public StoreDbEnt(int BoardNumber, String GameIdentification, int MarkSequenceNumber, int MarkNumber) {
        this.BoardNumber = BoardNumber;
        this.GameIdentification = GameIdentification;
        this.MarkSequenceNumber = MarkSequenceNumber;
        this.MarkNumber = MarkNumber;
    }

    @Override
    public String toString() {
        return "StoreDbEnt{" +
                "BoardNumber=" + BoardNumber +
                ", GameIdentification='" + GameIdentification + '\'' +
                ", MarkSequenceNumber=" + MarkSequenceNumber +
                ", MarkNumber=" + MarkNumber +
                '}';
    }
}
