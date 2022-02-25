package com.allJavaDev;

import com.allJavaDev.config.ProjectConfig;
import com.allJavaDev.model.Comment;
import com.allJavaDev.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class allJavaDevApp {
    public static void main(String[] args) {
        Comment comment = new Comment();
        comment.setAuthor("allJavaDev");
        comment.setText("Spring Framework");

        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        CommentService commentService1 = context.getBean(CommentService.class);
        CommentService commentService2 = context.getBean(CommentService.class);
        System.out.println(commentService1==commentService2);


        //----Bean Scope-----
        //True=>same objects, default is singleton scope
        //if scope ("prototype") is defined, then the different instances are created

        //---Eager vs Lazy Initialization-----
        //Default is Eager
        //Lazy: creates the object whenever it is called



    }
}
