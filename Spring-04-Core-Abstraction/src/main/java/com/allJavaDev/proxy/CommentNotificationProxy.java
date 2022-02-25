package com.allJavaDev.proxy;

import com.allJavaDev.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
