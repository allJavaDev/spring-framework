package com.alljavadev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/car")
public class CarController {
@RequestMapping("info")
    public String carInfo(@RequestParam String make){
    System.out.println(make);
    return "car/car-info";
    }
}
