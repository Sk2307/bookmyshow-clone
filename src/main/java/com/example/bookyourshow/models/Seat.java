package com.example.bookyourshow.models;

import com.example.bookyourshow.enums.SeatType;

import java.util.Date;

public class Seat extends BaseModel{

    private Integer rowNumber;

    private Integer columnNumber;

    private SeatType type;

    public Seat(Long id, Date createdAt, Date updatedAt, Integer rowNumber, Integer columnNumber, SeatType type) {
        super(id, createdAt, updatedAt);
        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;
        this.type = type;
    }
}
