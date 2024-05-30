package aiss.gitlabminer.service;

import aiss.gitlabminer.model.Commit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CommitService {
    @Autowired
    RestTemplate template;
    private String baseUri = "https://gitlab.com/api/v4/";

    public List<Commit> getCommits(Integer idProject) {
        String uri = baseUri + "projects/" + idProject + "/repository/commits";
        Commit[] commits = template.getForObject(uri, Commit[].class);
        return Arrays.stream(commits).toList();
    }

    public Commit getCommitById(Integer idProject, String idCommit) {
        String uri = baseUri + "projects/" + idProject + "/repository/commits/" + idCommit;
        return template.getForObject(uri, Commit.class);
    }

    public List<Commit> getCommitsByEmail(Integer idProject, String email) {
        String uri = baseUri + "projects/" + idProject + "/repository/commits?" + email;
        Commit[] commit = template.getForObject(uri, Commit[].class);
        return Arrays.stream(commit).toList();
    }

    public List<Commit> getCommitsSinceDay(Integer idProject, Integer day) {
        if (day == null)
            day = 2;
        LocalDateTime date = LocalDateTime.now().minusDays(day);
        String uri = baseUri + "projects/" + idProject + "/repository/commits?since=" + date;
        Commit[] commit = template.getForObject(uri, Commit[].class);
        return Arrays.stream(commit).toList();
    }

    public List<Commit> getCommitsSinceDayPagination(Integer idProject, Integer day, Integer maxPage) {
        if (day == null)
            day = 2;
        if (maxPage == null)
            maxPage = 2;
        LocalDateTime date = LocalDateTime.now().minusDays(day);
        List<Commit> result = new ArrayList<>();
        for (int i = 1; i < maxPage; i++) {
            String uri = baseUri + "projects/" + idProject + "/repository/commits?since=" + date + "&page=" + i;
            Commit[] commit = template.getForObject(uri, Commit[].class);
            List<Commit> commitsList = Arrays.stream(commit).toList();
            if (commitsList.isEmpty())
                break;
            result.addAll(commitsList);
        }
        return result;
    }
}