package com.cydeo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "COURSES")
@JsonIgnoreProperties(value = {"data", "category"}, ignoreUnknown = true)
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CATEGORY")
    private String category;

    @Column(name = "RATING")
//    @JsonIgnore
    @JsonBackReference //
    private int rating;

    @Column(name = "DESCRIPTION")
    private String description;
}
