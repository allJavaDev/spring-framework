package com.alljavadev.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name="ticket")
@Data
@NoArgsConstructor
public class Ticket extends BaseEntity{

    @Column(name="movie_cinema_id")
    private Long movieCinemaId;



}
