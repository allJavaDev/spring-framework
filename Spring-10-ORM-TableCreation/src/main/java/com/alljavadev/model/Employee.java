package com.alljavadev.model;

import com.alljavadev.enums.Gender;

import javax.persistence.*;
import java.time.LocalDate;

@Entity (name="Employees")
@Table (name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column (name="employee_id", columnDefinition = "Integer", updatable = false)
    private int id;

    @Column(name="first_name", columnDefinition = "TEXT", length = 50)
    private String firstName;

    @Column(name="last_name", columnDefinition = "TEXT", length = 50)
    private String lastName;

    @Column(name="email", columnDefinition = "TEXT", length = 50)
    private String email;

    @Column(name="hire_date", columnDefinition = "DATE")
    private LocalDate hireDate;

    @Column(name="department", nullable = false, updatable = false, columnDefinition = "TEXT", length = 17)
    private String department;

    @Enumerated(EnumType.STRING)
    @Column(length = 1, name = "gender")
    private Gender gender;

    @Column (columnDefinition = "Integer")
    private int salary;

    @Column (name="region_id", columnDefinition = "Integer")
    private int regionId;

}
