package com.example.bookyourshow.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Getter
@AllArgsConstructor
@SuperBuilder
public class BaseModel {
    private Long id;

    private Date createdAt;

    private Date updatedAt;
}
