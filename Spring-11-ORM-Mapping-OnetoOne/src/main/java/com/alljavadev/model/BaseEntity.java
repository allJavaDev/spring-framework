package com.alljavadev.model;

import javax.persistence.*;

@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="employee_id", columnDefinition = "Integer", updatable = false)
    private int id;
}
