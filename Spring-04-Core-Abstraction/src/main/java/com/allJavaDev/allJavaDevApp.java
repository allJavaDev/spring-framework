package com.allJavaDev;

import com.allJavaDev.config.ProjectConfig;
import com.allJavaDev.model.Comment;
import com.allJavaDev.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

public class allJavaDevApp {
    public static void main(String[] args) {
        Comment comment = new Comment();
        comment.setAuthor("allJavaDev");
        comment.setText("Spring Framework");

        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
