package com.cydeo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity(name="Regions")
@Table(name="regions")
public class Region extends BaseEntity {

    @OneToOne(mappedBy = "region")
    private Employee employee;


    @Column(name="region", columnDefinition = "TEXT", length = 20)
    private String region;

    @Column(name="country", columnDefinition = "TEXT", length = 20)
    private String country;

    public Region(String region, String country) {
        this.region = region;
        this.country = country;
    }
}
