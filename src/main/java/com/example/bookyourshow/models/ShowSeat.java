package com.example.bookyourshow.models;

import com.example.bookyourshow.enums.SeatStatus;
import lombok.Getter;

import java.util.Date;

@Getter
public class ShowSeat extends BaseModel{
    private Double price;

    private SeatStatus status;

    private Seat seat;

    public ShowSeat(Long id, Date createdAt, Date updatedAt, Double price, SeatStatus status, Seat seat) {
        super(id, createdAt, updatedAt);
        this.price = price;
        this.status = status;
        this.seat = seat;
    }
}
