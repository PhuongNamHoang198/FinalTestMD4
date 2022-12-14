package com.example.test.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double area;
    private int population;
    private double gdp;
    private String description;
    @ManyToOne(targetEntity = National.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "national_id")
    private National national;
}