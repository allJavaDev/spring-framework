package com.alljavadev.proxy;


import com.alljavadev.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
