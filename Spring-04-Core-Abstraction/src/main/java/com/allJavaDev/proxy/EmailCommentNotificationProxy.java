package com.allJavaDev.proxy;

import com.allJavaDev.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
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
