package com.alljavadev.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table (name="regions")
@Entity
@Data
@NoArgsConstructor
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String region;
    private String country;

}
