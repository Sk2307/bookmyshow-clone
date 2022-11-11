package com.example.bookyourshow.models;

import com.example.bookyourshow.enums.SeatType;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Enumerated;

@Getter
@Entity
public class Seat extends BaseModel{

    private Integer rowNumber;

    private Integer columnNumber;

    @Enumerated
    private SeatType type;
}
