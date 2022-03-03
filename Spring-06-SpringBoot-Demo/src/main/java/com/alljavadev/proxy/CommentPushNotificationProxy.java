package com.alljavadev.proxy;

import com.alljavadev.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier ("PUSH")
public abstract class CommentPushNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("sending push notification: "+comment.getText());
    }
}
