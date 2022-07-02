package com.cydeo.controller;

import com.cydeo.entity.Student;
import com.cydeo.service.StudentService;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(StudentController.class)
class StudentControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean //there is a bean in StudentController, we need to mock
    StudentService studentService;

    @Test
    void getStudent() throws Exception{
        mvc.perform(MockMvcRequestBuilders.get("/student").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"id\": 0,\"firstName\": \"Mike\",\"lastName\": \"Smith\",\"age\": 20}"));
    }
    @Test
    void JsonAssert() throws Exception{
        String expected ="{\"id\": 0,\"firstName\": \"Mike\",\"lastName\": \"Smith\",\"age\": 20}";
        String actual="{\"id\": 0,\"firstName\": \"Mike\",\"lastName\": \"Smith\"}";
        JSONAssert.assertEquals(expected,actual, true);
//strict: if true, everything should match, if false, matching ones are fine to pass

    }

    @Test
    void getStudentService() throws Exception{
        when(studentService.getStudent()).thenReturn(Arrays.asList(
                new Student("John", "Doe", 20),
                new Student("Loreena", "Wilson", 32)
        ));

        mvc.perform(MockMvcRequestBuilders.get("/service/student").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(
                        content().json(
                                "[{\"id\": 0,\"firstName\": \"John\",\"lastName\": \"Doe\",\"age\": 20}," +
                                "{\"id\": 0,\"firstName\": \"Loreena\",\"lastName\": \"Wilson\",\"age\": 32}]"));
    }

}