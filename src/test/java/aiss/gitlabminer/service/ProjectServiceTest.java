package aiss.gitlabminer.service;

import aiss.gitlabminer.model.Project;
import aiss.gitlabminer.service.ProjectService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@SpringBootTest
class ProjectServiceTest {
    @Autowired
    ProjectService service;

    @Test
    @DisplayName("getProjects")
    void getProjects() {
        List<Project> projects = service.getProjects();
        System.out.println(projects);
    }

    @Test
    @DisplayName("getProjectById")
    void getProjectById() {
        Project project = service.getProjectById(4207231);
        System.out.println(project);
    }
}