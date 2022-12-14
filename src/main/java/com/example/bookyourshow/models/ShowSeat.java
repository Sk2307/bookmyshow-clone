package com.example.bookyourshow.models;

import com.example.bookyourshow.enums.SeatStatus;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

@Getter
@Entity
public class ShowSeat extends BaseModel{
    private Double price;

    @Enumerated
    private SeatStatus status;

    @ManyToOne
    private Seat seat;
}
