package com.alljavadev.model;

import com.alljavadev.enums.Gender;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity (name="Employees")
@Table (name="employees")
@Data
@NoArgsConstructor
public class Employee extends BaseEntity{
    @OneToOne (cascade = CascadeType.ALL) //cascade is for child to be persistent (department)
    //don't use remove, only change the attribute 1 to 0 ex.

    //foreign key is created by spring data jpa, join
    @JoinColumn (name="department_id") //foreign key, if we don't rename, we don't have to have in 1:1
    private Department department;

    @Column(name="first_name", columnDefinition = "TEXT", length = 50)
    private String firstName;

    @Column(name="last_name", columnDefinition = "TEXT", length = 50)
    private String lastName;

    @Column(name="email", columnDefinition = "TEXT", length = 50)
    private String email;

    @Column(name="hire_date", columnDefinition = "DATE")
    private LocalDate hireDate;

    @Enumerated(EnumType.STRING)
    @Column(length = 1, name = "gender")
    private Gender gender;

    @Column (columnDefinition = "Integer")
    private int salary;

    @OneToOne (cascade = {CascadeType.ALL})
    @JoinColumn (name="region") //foreign key
    private Region region;


    public Employee(String firstName, String lastName, String email, LocalDate hireDate, Gender gender, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.hireDate = hireDate;
        this.gender = gender;
        this.salary = salary;
    }
}
