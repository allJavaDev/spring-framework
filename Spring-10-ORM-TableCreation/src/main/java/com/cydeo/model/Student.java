package com.cydeo.model;

import com.cydeo.enums.Gender;

import javax.persistence.*;

@Entity (name="Student")
//default is class name for the name of the table
@Table(name="student",
        uniqueConstraints = {
        @UniqueConstraint(name="student_email_unique", columnNames = "email")
}
)
public class Student {
    @Id
    @SequenceGenerator(
            name="student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    @Column(name="id",updatable = false)
    private Long id;

    @Column(name="first_name",nullable = false, columnDefinition = "TEXT")
    private String firstName;

    @Column(name="last_name",nullable = false, columnDefinition = "TEXT")
    private String lastName;

    @Column(name="email",nullable = false, columnDefinition = "TEXT")
    private String email;

    //not displayed in the table
    @Transient
    private String city;

    @Column(columnDefinition = "DATE")
    private String date;

    @Column(columnDefinition = "TIME")
    private String time;

    @Column(columnDefinition = "TIMESTAMP")
    private String timeStamp;

    @Enumerated(EnumType.STRING)
    private Gender gender;



    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Student() {

    }
}
