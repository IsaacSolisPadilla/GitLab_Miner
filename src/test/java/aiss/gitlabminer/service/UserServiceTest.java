package aiss.gitlabminer.service;

import aiss.gitlabminer.model.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class UserServiceTest {
    @Autowired
    UserService service;

    @Test
    @DisplayName("getUserByUsername")
    void getUserByUsername() {
        User user = service.getUserByUsername("jack_smith");
        System.out.println(user);
    }

    @Test
    @DisplayName("getUsers")
    void getUsers() {
        List<User> users = service.getUsers(278964);
        System.out.println(users);
    }

    @Test
    @DisplayName("getIssueParticipant")
    void getIssueParticipant() {
        User user = service.getIssueParticipant(278964, 409790);
        System.out.println(user);
    }
}