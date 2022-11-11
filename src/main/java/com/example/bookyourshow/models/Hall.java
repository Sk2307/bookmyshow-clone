package com.example.bookyourshow.models;

import lombok.Builder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Hall extends BaseModel{
    private Integer hallNumber;

    @Builder.Default
    private List<Seat> seats = new ArrayList<>();

    public Hall(Long id, Date createdAt, Date updatedAt) {
        super(id, createdAt, updatedAt);
        this.hallNumber = hallNumber;
    }
}
