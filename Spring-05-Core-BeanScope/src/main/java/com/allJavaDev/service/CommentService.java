package com.allJavaDev.service;

import com.allJavaDev.model.Comment;
import com.allJavaDev.proxy.CommentNotificationProxy;
import com.allJavaDev.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy //Triggers the initialization when somebody calls the service
//@Scope("prototype")
//@Scope(BeanDefinition.SCOPE_PROTOTYPE) //There are two ways to define the bean scope

public class CommentService {
    private  final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    //@Autowired //No need since there is only one constructor
    public CommentService(CommentRepository commentRepository, @Qualifier("EMAIL") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
        System.out.println("Bean created!");
    }

    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
