package com.alljavadev.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
public class Location extends BaseEntity{

    private String name;
    private String address;

    private String postalCode;
    private String country;
    private String state;
    private String city;

    private BigDecimal latitude;
    private BigDecimal longitude;

}
