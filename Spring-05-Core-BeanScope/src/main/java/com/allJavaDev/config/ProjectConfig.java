package com.allJavaDev.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan (basePackages = "com.allJavaDev")
@ComponentScan (basePackages = {"com.allJavaDev.service","com.allJavaDev.proxy", "com.allJavaDev.repository" })
public class ProjectConfig {

}
