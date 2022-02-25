package com.allJavaDev.service;

import com.allJavaDev.model.Comment;
import com.allJavaDev.proxy.CommentNotificationProxy;
import com.allJavaDev.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CommentService {
    private  final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    //@Autowired //No need since there is only one constructor
    public CommentService(CommentRepository commentRepository, @Qualifier("EMAIL") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
