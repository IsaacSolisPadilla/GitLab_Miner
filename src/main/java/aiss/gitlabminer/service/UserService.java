package aiss.gitlabminer.service;

import aiss.gitlabminer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    private String baseUri = "https://gitlab.com/api/v4/";
    private String token = "glpat-V2HyAj2y718TjX3rUyht";
    @Autowired
    RestTemplate template;

    public User getUserByUsername(String username) {
        String uri = baseUri + "users?username=" + username;
        User[] user = template.getForObject(uri, User[].class);
        return Arrays.stream(user).toList().get(0);
    }

    public List<User> getUsers(Integer projectId) {
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(token);
        HttpEntity<User[]> request = new HttpEntity<>(null, headers);
        String uri = baseUri + "projects/" + projectId + "/members";
        ResponseEntity<User[]> response = template.exchange(uri, HttpMethod.GET, request, User[].class);
        return Arrays.asList(response.getBody());
    }

    public User getIssueParticipant(Integer projectId, Integer issueId) {
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(token);
        HttpEntity<User[]> request = new HttpEntity<>(null, headers);
        String uri = baseUri + "projects/" + projectId + "/issues/" + issueId + "/participants";
        ResponseEntity<User[]> response = template.exchange(uri, HttpMethod.GET, request, User[].class);
        return Arrays.asList(response.getBody()).get(0);
    }
}