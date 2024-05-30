package aiss.gitlabminer.service;

import aiss.gitlabminer.model.Issue;
import aiss.gitlabminer.service.IssueService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class IssueServiceTest {
    @Autowired
    IssueService service;

    @Test
    @DisplayName("getIssues")
    void getIssues() {
        List<Issue> issues = service.getIssues(4207231);
        System.out.println(issues);
    }

    @Test
    @DisplayName("getIssuesSinceDay")
    void getIssuesSinceDay() {
        List<Issue> issues = service.getIssuesSinceDay(4207231, null);
        System.out.println(issues);
    }

    @Test
    @DisplayName("getIssuesSinceDayPagination")
    void getIssuesSinceDayPagination() {
        List<Issue> issues = service.getIssuesSinceDayPagination(4207231, null, 30);
        System.out.println(issues);
    }

    @Test
    @DisplayName("getIssuesWithComments")
    void getIssuesWithComments() {
        List<Issue> issues = service.getIssuesWithComments(278964);
        System.out.println(issues);
    }

    @Test
    void getIssuesSinceDayPaginationWithComments() {
        List<Issue> issues = service.getIssuesSinceDayPaginationWithComments(278964, 1, 2);
        System.out.println(issues);
    }
}