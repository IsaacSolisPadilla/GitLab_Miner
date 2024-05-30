package aiss.gitlabminer.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "title",
        "message",
        "author_name",
        "author_email",
        "authored_date",
        "committer_name",
        "committer_email",
        "committed_date",
        "web_url"
})
@Generated("jsonschema2pojo")
public class Commit {
    @JsonProperty("id")
    private String id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("message")
    private String message;
    @JsonProperty("author_name")
    private String authorName;
    @JsonProperty("author_email")
    private String authorEmail;
    @JsonProperty("authored_date")
    private String authoredDate;
    @JsonProperty("committer_name")
    private String committerName;
    @JsonProperty("committer_email")
    private String committerEmail;
    @JsonProperty("committed_date")
    private String committedDate;
    @JsonProperty("web_url")
    private String webUrl;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonProperty("author_name")
    public String getAuthorName() {
        return authorName;
    }

    @JsonProperty("author_name")
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @JsonProperty("author_email")
    public String getAuthorEmail() {
        return authorEmail;
    }

    @JsonProperty("author_email")
    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    @JsonProperty("authored_date")
    public String getAuthoredDate() {
        return authoredDate;
    }

    @JsonProperty("authored_date")
    public void setAuthoredDate(String authoredDate) {
        this.authoredDate = authoredDate;
    }

    @JsonProperty("committer_name")
    public String getCommitterName() {
        return committerName;
    }

    @JsonProperty("committer_name")
    public void setCommitterName(String committerName) {
        this.committerName = committerName;
    }

    @JsonProperty("committer_email")
    public String getCommitterEmail() {
        return committerEmail;
    }

    @JsonProperty("committer_email")
    public void setCommitterEmail(String committerEmail) {
        this.committerEmail = committerEmail;
    }

    @JsonProperty("committed_date")
    public String getCommittedDate() {
        return committedDate;
    }

    @JsonProperty("committed_date")
    public void setCommittedDate(String committedDate) {
        this.committedDate = committedDate;
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
        sb.append("Commit {\n");
        sb.append("    id: ").append(id == null ? "<null>" : id).append("\n");
        sb.append("    title: ").append(title == null ? "<null>" : title).append("\n");
        sb.append("    message: ").append(message == null ? "<null>" : message).append("\n");
        sb.append("    author_name: ").append(authorName == null ? "<null>" : authorName).append("\n");
        sb.append("    author_email: ").append(authorEmail == null ? "<null>" : authorEmail).append("\n");
        sb.append("    authored_date: ").append(authoredDate == null ? "<null>" : authoredDate).append("\n");
        sb.append("    committer_name: ").append(committerName == null ? "<null>" : committerName).append("\n");
        sb.append("    committer_email: ").append(committerEmail == null ? "<null>" : committerEmail).append("\n");
        sb.append("    committed_date: ").append(committedDate == null ? "<null>" : committedDate).append("\n");
        sb.append("    webUrl: ").append(webUrl == null ? "<null>" : webUrl).append("\n");
        sb.append("}");
        return sb.toString();
    }
}