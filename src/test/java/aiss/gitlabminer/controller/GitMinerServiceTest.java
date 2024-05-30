package aiss.gitlabminer.controller;

import aiss.gitlabminer.controller.GitMinerService;
import aiss.gitlabminer.model.Project;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GitMinerServiceTest {
    @Autowired
    GitMinerService service;

    @Test
    @DisplayName("getProject")
    void getProject() {
        Project pj = service.getProject(4207231, 30, 30, 2);
        System.out.println(pj);
    }

    @Test
    @DisplayName("postProject")
    void postProject() {
        Project pj = service.postProject(4207231, 30, 30, 2);
        System.out.println(pj);
    }
}