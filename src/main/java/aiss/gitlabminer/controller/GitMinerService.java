package aiss.gitlabminer.controller;

import aiss.gitlabminer.model.*;
import aiss.gitlabminer.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/gitlab")
public class GitMinerService {



    @Autowired
    ProjectService projectService;

    @Autowired
    CommitService commitService;

    @Autowired
    CommentService commentService;

    @Autowired
    IssueService issueService;

    @Autowired
    UserService userService;

    // Fetch project with the commits, issues and comments and save the json file
    @GetMapping("/{id}")
    public Project getProject(@PathVariable Integer id,
                              @RequestParam(required = false, defaultValue = "2") Integer sinceCommits,
                              @RequestParam(required = false, defaultValue = "20") Integer sinceIssues,
                              @RequestParam(required = false, defaultValue = "2") Integer maxPages){
        Project project = projectService.getProjectById(id);
        List<Commit> commits = commitService.getCommitsSinceDayPagination(id, sinceCommits, maxPages);
        List<Issue> issues = issueService.getIssuesSinceDayPaginationWithComments(id, sinceIssues, maxPages);
        project.setCommits(commits);
        project.setIssues(issues);
        System.out.println(project);
        return project;
    }

    // Post the project to the gitminer database
    @PostMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Project postProject(@PathVariable Integer id,
                               @RequestParam(required = false, defaultValue = "2") Integer sinceCommits,
                               @RequestParam(required = false, defaultValue = "20") Integer sinceIssues,
                               @RequestParam(required = false, defaultValue = "2") Integer maxPages){
        Project project = getProject(id, sinceCommits, sinceIssues, maxPages);
        // POST http://localhost:8080/gitminer/projects
        projectService.postProject(project);
        return project;
    }
}