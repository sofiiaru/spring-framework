package com.repository;

import com.model.Comment;

public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Stroing comment : " + comment.getText());
    }
}