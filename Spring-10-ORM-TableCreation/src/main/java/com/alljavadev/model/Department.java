package com.alljavadev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity (name="Departments")
@Table (name="departments")
public class Department {
    @Id
    @Column(name="department", nullable = false, updatable = false, columnDefinition = "TEXT", length = 100)
    private String department;

    @Column(name="division",columnDefinition = "TEXT", length = 100)
    private String division;


}
