package aiss.gitlabminer.service;

import aiss.gitlabminer.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ProjectService {
    private String baseUri = "https://gitlab.com/api/v4/";
    @Autowired
    RestTemplate template;

    public List<Project> getProjects() {
        String uri = baseUri + "projects";
        Project[] projects = template.getForObject(uri, Project[].class);
        return Arrays.stream(projects).toList();
    }

    public Project getProjectById(Integer id) {
        String uri = baseUri + "projects/" + id;
        Project project = template.getForObject(uri, Project.class);
        return project;
    }

    public void postProject(Project project) {
        String uri = "http://localhost:8080/gitminer/projects";
        template.postForObject(uri, project, Project.class);
    }
}