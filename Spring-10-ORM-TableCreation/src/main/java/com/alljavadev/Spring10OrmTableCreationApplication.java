package com.alljavadev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring10OrmTableCreationApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring10OrmTableCreationApplication.class, args);
    }
//@Bean
//    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
//        return args ->{
//            Student zeren=new Student("Zeren", "Demirkiran", "zeren@allJavaDev.com");
//            studentRepository.save(zeren);
//            studentRepository.findAll();
//        };
//}
}