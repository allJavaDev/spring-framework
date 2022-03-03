package com.alljavadev.repository;

import com.alljavadev.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
