package com.cydeo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity (name="Departments")
@Table (name="departments")
public class Department extends BaseEntity {

    @OneToOne(mappedBy = "department")
    //should exactly match with the name in the department class,
    // this means I don't want to own this employee in the department table
    //one employee belongs to one department
    private Employee employee;

    @Column(name="department", columnDefinition = "TEXT", length = 100)
    private String department;

    @Column(name="division",columnDefinition = "TEXT", length = 100)
    private String division;

    public Department(String department, String division) {
        this.department = department;
        this.division = division;
    }
}
