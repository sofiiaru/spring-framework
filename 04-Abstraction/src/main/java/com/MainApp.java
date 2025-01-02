package com;

import com.config.ProjectConfig;
import com.model.Comment;
import com.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        Comment comment = new Comment();
        comment.setAuthor("John");
        comment.setText("Spring Framework");

        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);

        CommentService cs2 = context.getBean(CommentService.class);

        //Showing that  same object is used - singleton scope
        System.out.println(commentService);
        System.out.println(cs2);
        System.out.println(commentService == cs2);
    }
}
