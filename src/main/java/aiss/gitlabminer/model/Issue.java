package aiss.gitlabminer.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "iid",
        "title",
        "description",
        "state",
        "created_at",
        "updated_at",
        "closed_at",
        "labels",
        "upvotes",
        "downvotes",
        "author",
        "web_url",
        "assignee"
})
@Generated("jsonschema2pojo")
public class Issue {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("web_url")
    private String web_url;
    @JsonProperty("description")
    private String description;
    @JsonProperty("state")
    private String state;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("closed_at")
    private Object closedAt;
    @JsonProperty("labels")
    private List<String> labels;
    @JsonProperty("upvotes")
    private Integer upvotes;
    @JsonProperty("downvotes")
    private Integer downvotes;
    @JsonProperty("ref_id")
    @JsonAlias("iid")
    private Integer iid;
    @JsonProperty("author")
    private User author;
    @JsonProperty("assignee")
    private User assignee;
    private List<Comment> comments;

    @JsonProperty("author")
    public User getAuthor() {
        return author;
    }

    @JsonProperty("assignee")
    public User getAssignee() {
        return assignee;
    }

    @JsonProperty("ref_id")
    @JsonAlias("iid")
    public Integer getIid() {
        return iid;
    }

    @JsonProperty("web_url")
    public String getWeb_url() {
        return web_url;
    }

    @JsonProperty("web_url")
    public void setWeb_url(String web_url) {
        this.web_url = web_url;
    }

    @JsonProperty("ref_id")
    @JsonAlias("iid")
    public void setIid() {
        this.iid = iid;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
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

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("closed_at")
    public Object getClosedAt() {
        return closedAt;
    }

    @JsonProperty("closed_at")
    public void setClosedAt(Object closedAt) {
        this.closedAt = closedAt;
    }

    @JsonProperty("labels")
    public List<String> getLabels() {
        return labels;
    }

    @JsonProperty("labels")
    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    @JsonProperty("upvotes")
    public Integer getUpvotes() {
        return upvotes;
    }

    @JsonProperty("upvotes")
    public void setUpvotes(Integer upvotes) {
        this.upvotes = upvotes;
    }

    @JsonProperty("downvotes")
    public Integer getDownvotes() {
        return downvotes;
    }

    @JsonProperty("downvotes")
    public void setDownvotes(Integer downvotes) {
        this.downvotes = downvotes;
    }

    @JsonProperty("author")
    public void setAuthor(User author) {
        this.author = author;
    }

    @JsonProperty("assignee")
    public void setAssignee(User assignee) {
        this.assignee = assignee;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Issue {\n");
        sb.append("    id: ").append(id == null ? "<null>" : id).append("\n");
        sb.append("    iid: ").append(iid == null ? "<null>" : iid).append("\n");
        sb.append("    title: ").append(title == null ? "<null>" : title).append("\n");
        sb.append("    description: ").append(description == null ? "<null>" : description).append("\n");
        sb.append("    state: ").append(state == null ? "<null>" : state).append("\n");
        sb.append("    created_at: ").append(createdAt == null ? "<null>" : createdAt).append("\n");
        sb.append("    updated_at: ").append(updatedAt == null ? "<null>" : updatedAt).append("\n");
        sb.append("    closed_at: ").append(closedAt == null ? "<null>" : closedAt).append("\n");
        sb.append("    labels: ").append(labels == null ? "<null>" : labels).append("\n");
        sb.append("    upvotes: ").append(upvotes == null ? "<null>" : upvotes).append("\n");
        sb.append("    downvotes: ").append(downvotes == null ? "<null>" : downvotes).append("\n");
        sb.append("    comments: ").append(comments == null ? "<null>" : comments).append("\n");
        sb.append("    author: ").append(author == null ? "<null>" : author).append("\n");
        sb.append("    assignee: ").append(assignee == null ? "<null>" : assignee).append("\n");
        sb.append("}");
        return sb.toString();
    }
}