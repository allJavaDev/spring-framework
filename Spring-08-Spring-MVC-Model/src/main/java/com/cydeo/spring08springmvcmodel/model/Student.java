package com.cydeo.spring08springmvcmodel.model;

import com.cydeo.spring08springmvcmodel.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private Gender gender;

}
