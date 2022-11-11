package com.example.bookyourshow.models;

import com.example.bookyourshow.enums.Language;
import com.example.bookyourshow.enums.MovieFeature;
import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Entity
public class Show extends BaseModel{

    @ManyToOne
    private Movie movie;

    @Enumerated
    private Language language;

    private Date startTime;

    private Date endTime;

    @ManyToOne
    private Hall hall;

    @ElementCollection
    private List<MovieFeature> movieFeatures = new ArrayList<>();

    @OneToMany
    private List<ShowSeat> showSeats = new ArrayList<>();

}
