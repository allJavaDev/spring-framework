package com.alljavadev.spring08springmvcmodel.controller;

import com.alljavadev.spring08springmvcmodel.enums.Gender;
import com.alljavadev.spring08springmvcmodel.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    @RequestMapping("/list")
    public String studentList(Model model){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Mike", "Smith", 45, Gender.MALE));
        studentList.add(new Student("Kathryn", "Dwell", 34, Gender.FEMALE));
        studentList.add(new Student("John", "Hawkins", 35, Gender.MALE));
        model.addAttribute("students", studentList);

        return "student/student-list";
    }
}
