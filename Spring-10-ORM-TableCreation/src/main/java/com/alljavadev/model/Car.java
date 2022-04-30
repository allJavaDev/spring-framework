package com.alljavadev.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="Cars")
@NoArgsConstructor
@Data
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;

    private String make;
    private String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }
}
