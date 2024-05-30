package aiss.gitlabminer.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jdk.jfr.Enabled;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "web_url"
})
@Generated("jsonschema2pojo")
public class Project {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("web_url")
    private String webUrl;
    private List<Commit> commits;
    private List<Issue> issues;

    public List<Commit> getCommits() {
        return commits;
    }

    public void setCommits(List<Commit> commits) {
        this.commits = commits;
    }

    public List<Issue> getIssues() {
        return issues;
    }

    public void setIssues(List<Issue> issues) {
        this.issues = issues;
    }

    public Project() {
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("web_url")
    public String getWebUrl() {
        return webUrl;
    }

    @JsonProperty("web_url")
    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Project {\n");
        sb.append("    id: ").append(id == null ? "<null>" : id).append("\n");
        sb.append("    name: ").append(name == null ? "<null>" : name).append("\n");
        sb.append("    webUrl: ").append(webUrl == null ? "<null>" : webUrl).append("\n");
        sb.append("    commits: ").append(commits == null ? "<null>" : commits).append("\n");
        sb.append("    issues: ").append(issues == null ? "<null>" : issues).append("\n");
        sb.append("}");
        return sb.toString();
    }
}