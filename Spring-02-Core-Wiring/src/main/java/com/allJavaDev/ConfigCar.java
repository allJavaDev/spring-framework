package com.allJavaDev;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCar {
    @Bean
    Car car(){
        Car c = new Car();
        c.setMake("Honda");
        return c;
    }
    //Direct Wiring - calls the method for the object from the other object using a methos (setCar)
//    @Bean
//    Person person(){
//        Person p = new Person();
//        p.setName("Mike");
//        p.setCar(car());
//        return p;
//    }
    //Autowiring - uses the object as a parameter of the method
    @Bean
    Person person(Car car){
        Person p = new Person();
        p.setName("Mike");
        p.setCar(car);
        return p;
    }
}
