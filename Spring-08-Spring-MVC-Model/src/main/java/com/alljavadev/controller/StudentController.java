package com.alljavadev.controller;

import com.alljavadev.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homePage(Model model){

        model.addAttribute("name","allJavaDev");
        model.addAttribute("course","MVC");

        //create some random student id and show it
        int studentID= new Random().nextInt(1000);
        model.addAttribute("studentID",studentID);
        List<Integer> numbers=new ArrayList<>();
        numbers.add(4);
        numbers.add(6);
        numbers.add(10);
        model.addAttribute("numbers",numbers);
        model.addAttribute("firstNumber",numbers.get(0));

        Student student = new Student(1,"Mike", "Smith");
        model.addAttribute("student", student);



        return "/student/welcome"; //no need to put html, it is thymeleaf
    }
}
