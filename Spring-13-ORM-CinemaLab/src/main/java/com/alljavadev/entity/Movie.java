package com.alljavadev.entity;

import com.alljavadev.enums.MovieState;
import com.alljavadev.enums.MovieType;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
public class Movie extends BaseEntity{
    private Integer duration;
    private String name;
    private BigDecimal price;
    @Column(columnDefinition = "DATE")
    private LocalDate releaseDate;
    @Enumerated(EnumType.STRING)
    private MovieState state;
    @Column(columnDefinition = "TEXT")
    private String summary;
    @Enumerated(EnumType.STRING)
    private MovieType type;



}
