package com.example.bookyourshow.models;

import com.example.bookyourshow.enums.PaymentMode;
import com.example.bookyourshow.enums.PaymentStatus;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import java.util.Date;

@Getter
@Entity
public class Payment extends BaseModel{
    private String referenceId;

    private Double amount;

    @Enumerated
    private PaymentMode mode;

    @Enumerated
    private PaymentStatus status;

}
