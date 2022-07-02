package com.cydeo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//combines the following annotations:
// @SpringBootConfiguration: Designates a class as configuration class, specialized form of @Configuration
// @EnableAutoConfiguration: Tells Spring Boot to automatically configure any components
// @ComponentScan: Enables component scanning, automatically discover and register components

public class allJavaDevApp {

    public static void main(String[] args) {
        SpringApplication.run(allJavaDevApp.class, args);
    }

}
