package aiss.gitlabminer.service;

import aiss.gitlabminer.model.Comment;
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
public class CommentService {
    private String baseUri = "https://gitlab.com/api/v4/";
    private String token = "glpat-HP_B5FjVtztXZtCJGLWy";

    @Autowired
    RestTemplate template;

    public List<Comment> getComments(Integer projectId, Integer issueIdd) {
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(token);
        HttpEntity<Comment[]> request = new HttpEntity<>(null, headers);
        String uri = baseUri + "projects/" + projectId + "/issues/" + issueIdd + "/notes";
        ResponseEntity<Comment[]> response = template.exchange(uri, HttpMethod.GET, request, Comment[].class);
        return Arrays.asList(response.getBody());
    }
}