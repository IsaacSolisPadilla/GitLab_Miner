package aiss.gitlabminer.service;

import aiss.gitlabminer.model.Comment;
import aiss.gitlabminer.model.Issue;
import aiss.gitlabminer.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class IssueService {
    @Autowired
    CommentService commentService;
    @Autowired
    RestTemplate template;
    private String baseUri = "https://gitlab.com/api/v4/";

    public List<Issue> getIssues(Integer id) {
        String uri = baseUri + "projects/" + id + "/issues";
        Issue[] issues = template.getForObject(uri, Issue[].class);
        return Arrays.stream(issues).toList();
    }

    public List<Issue> getIssuesWithComments(Integer id) {
        String uri = baseUri + "projects/" + id + "/issues";
        Issue[] issues = template.getForObject(uri, Issue[].class);
        List<Comment> comments = new ArrayList<>();
        for (Issue issue : issues) {
            try {
                comments = commentService.getComments(id, issue.getIid());
                System.out.println(comments);
            } catch (Exception e) {
                System.out.println(issue.getId() + ": No comments");
            }
            if (!comments.isEmpty())
                issue.setComments(comments);
            else
                issue.setComments(new ArrayList<>());
        }
        return Arrays.stream(issues).toList();
    }

    public List<Issue> getIssuesSinceDay(Integer id, Integer day) {
        if (day == null)
            day = 2;
        LocalDateTime date = LocalDateTime.now().minusDays(day);
        String uri = baseUri + "projects/" + id + "/issues?created_after" + date;
        Issue[] issues = template.getForObject(uri, Issue[].class);
        return Arrays.stream(issues).toList();
    }

    public List<Issue> getIssuesSinceDayPagination(Integer id, Integer day, Integer maxPage) {
        if (day == null)
            day = 2;
        if (maxPage == null)
            maxPage = 2;
        LocalDateTime date = LocalDateTime.now().minusDays(day);
        List<Issue> result = new ArrayList<>();
        for (int i = 1; i < maxPage; i++) {
            String uri = baseUri + "projects/" + id + "/issues?created_after=" + date + "&page=" + i;
            Issue[] issues = template.getForObject(uri, Issue[].class);
            List<Issue> issuesList = Arrays.stream(issues).toList();
            if (issuesList.isEmpty())
                break;
            result.addAll(issuesList);
        }
        return result;
    }

    public List<Issue> getIssuesSinceDayPaginationWithComments(Integer id, Integer day, Integer maxPage) {
        if (day == null)
            day = 2;
        if (maxPage == null)
            maxPage = 2;
        LocalDateTime date = LocalDateTime.now().minusDays(day);
        List<Issue> result = new ArrayList<>();
        for (int i = 1; i < maxPage; i++) {
            String uri = baseUri + "projects/" + id + "/issues?created_after=" + date + "&page=" + i;
            Issue[] issues = template.getForObject(uri, Issue[].class);
            List<Comment> comments = new ArrayList<>();
            for (Issue issue : issues) {
                try {
                    comments = commentService.getComments(id, issue.getIid());
                } catch (Exception e) {
                    System.out.println(issue.getId() + ": No comments");
                }
                if (!comments.isEmpty())
                    issue.setComments(comments);
                else
                    issue.setComments(new ArrayList<>());
            }
            List<Issue> issuesList = Arrays.stream(issues).toList();
            if (issuesList.isEmpty())
                break;
            result.addAll(issuesList);
        }
        return result;
    }
}