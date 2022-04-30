package com.alljavadev.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table (name="customers")
@Data
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String userName;
    @Column
    private String name;
    @Column
    private String surName;
    @Column
    private String email;
    @Column
    private String address;

    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    private List<Payment> paymentList;

    public Customer(String userName, String name, String surName, String email, String address) {
        this.userName = userName;
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.address = address;
    }
}
