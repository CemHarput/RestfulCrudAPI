package com.StudyCase.RESTAPI.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@Entity
@Table(name = "Movie_Table")
public class Movie {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String category;
    private double price;

    public Movie(int id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public Movie() {
    }
}
