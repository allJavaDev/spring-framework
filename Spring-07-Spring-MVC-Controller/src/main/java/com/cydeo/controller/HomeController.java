package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //Annotate the class with the @Controller Steorotype Annotation
public class HomeController {

    @RequestMapping("/home") //Associate the action with the HTTP request path
    public String home(){
        return "home.html";
    } //Return the HTML document that we want to display

    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome.html";
    }

    @RequestMapping
    public String welcome2(){
        return "welcome.html";
    }


}
