package com.cydeo.spring08springmvcmodel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/car")
public class CarController {

    @RequestMapping("/info")
    public String carInfo(@RequestParam String make, @RequestParam String year, Model model){
        model.addAttribute("make", make);
        model.addAttribute("year", year);
        return "car/car-info.html";
    }

    /**
     * @RequestParam: Whatever we enter as a query parameter, it will be retrieved from the query.
     * @param make
     * @param year
     * @param model
     * @return
     */
    @RequestMapping("/info2")
    public String carInfo2(@RequestParam(value="make", required = false, defaultValue = "Tesla") String make,
                           @RequestParam(value="year", required = false, defaultValue = "2022") String year,
                           Model model){
        model.addAttribute("make", make);
        model.addAttribute("year", year);
        return "car/car-info.html";
    }

    /**
     * @PathVariable: Whatever we enter the path is dynamic.
     * @param make
     * @param model
     * @return
     */
    @RequestMapping("/info/{make}/{year}")
    public String carInfo3(@PathVariable String make, @PathVariable String year, Model model){
        model.addAttribute("make", make);
        model.addAttribute("year", year);

        return "car/car-info.html";
    }
}
