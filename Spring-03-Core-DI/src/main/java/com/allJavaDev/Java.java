package com.allJavaDev;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Java {
    //Constructor injection
    //Lombok can create the constructor - no need, just create the variable
//    @Autowired
//    public Java(OfficeHours officeHours){
//        this.officeHours=officeHours;
//    }

    //Field Injection
    //@Autowired
    OfficeHours officeHours;
    public void getTeachingHours(){
        System.out.println("Weekly teaching hours: "+ (25+ officeHours.getHours()));
    }

    //Third way is the setter injection
}
