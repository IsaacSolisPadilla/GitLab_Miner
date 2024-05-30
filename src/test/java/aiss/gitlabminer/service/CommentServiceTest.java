package aiss.gitlabminer.service;

import aiss.gitlabminer.model.Comment;
import aiss.gitlabminer.service.CommentService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CommentServiceTest {
    @Autowired
    CommentService service;

    @Test
    @DisplayName("getComments")
    void getComments() {
        List<Comment> comments = service.getComments(278964, 409790);
        System.out.println(comments);
    }
}