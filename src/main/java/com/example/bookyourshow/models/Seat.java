package com.example.bookyourshow.models;

import com.example.bookyourshow.enums.SeatType;

import java.util.Date;

public class Seat extends BaseModel{
    private final Integer row;
    private final Integer column;

    private final SeatType type;
    public Seat(Long id, Date createdAt, Date updatedAt, Integer row, Integer column, SeatType type) {
        super(id, createdAt, updatedAt);
        this.row = row;
        this.column = column;
        this.type = type;
    }
}
