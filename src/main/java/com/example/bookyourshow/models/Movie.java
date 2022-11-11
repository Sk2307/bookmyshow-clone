package com.example.bookyourshow.models;

import com.example.bookyourshow.enums.Language;
import com.example.bookyourshow.enums.MovieFeature;
import lombok.Getter;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Entity
public class Movie extends BaseModel{
    private String name;
    private Integer duration;
    private Double rating;

    @ElementCollection
    @Enumerated
    private List<Language> languages = new ArrayList<>();

    @ElementCollection
    @Enumerated
    private List<MovieFeature> features = new ArrayList<>();

}
