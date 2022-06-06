package com.alljavadev.controller;

import com.alljavadev.entity.ResponseWrapper;
import com.alljavadev.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //@Controller + @ResponseBody
@RequestMapping("/courses/api/v3") //we will create a custom object
public class CourseController_ResponseWrapper {

    private final CourseService courseService;

    public CourseController_ResponseWrapper(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public ResponseEntity<ResponseWrapper> getAllCourses(){
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("Version", "V3")
                .body(new ResponseWrapper("Successfully retrieved", courseService.getCourses()));
    }

    @GetMapping("{id}")
    public ResponseEntity<ResponseWrapper> getCourseById(@PathVariable("id") Long id){
        return ResponseEntity.ok(new ResponseWrapper("course: "+id+" retrieved", courseService.getCourseById(id)));
    }
}
