package aiss.gitlabminer.service;

import aiss.gitlabminer.model.Commit;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CommitServiceTest {
    @Autowired
    CommitService service;

    @Test
    @DisplayName("getCommits")
    void getCommits() {
        List<Commit> commits = service.getCommits(4207231);
        System.out.println(commits);
    }

    @Test
    @DisplayName("getCommitById")
    void getCommitById() {
        Commit commit = service.getCommitById(4207231, "75220c91902ead6e8d57c694f3f7fb6d49d05711");
        System.out.println(commit);
    }

    @Test
    @DisplayName("getCommitsByEmail")
    void getCommitsByEmail() {
        List<Commit> commits = service.getCommitsByEmail(4207231, "matthew.fernandez@gmail.com");
        System.out.println(commits);
    }

    @Test
    @DisplayName("getCommitsSinceDay")
    void getCommitsSinceDay() {
        List<Commit> commits = service.getCommitsSinceDay(4207231, 0);
        System.out.println(commits);
    }

    @Test
    @DisplayName("getCommitsSinceDayPagination")
    void getCommitsSinceDayPagination() {
        List<Commit> commits = service.getCommitsSinceDayPagination(6722790, null, 30);
        System.out.println(commits);
    }
}