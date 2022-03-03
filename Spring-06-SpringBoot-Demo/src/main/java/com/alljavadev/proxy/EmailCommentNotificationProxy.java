package com.alljavadev.proxy;

import com.alljavadev.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier ("EMAIL")
//@Primary
public class EmailCommentNotificationProxy implements  CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending comment: " + comment.getText());
    }
}
