package aiss.gitlabminer.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "body",
        "created_at",
        "updated_at",
        "author"
})
@Generated("jsonschema2pojo")
public class Comment {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("body")
    private String body;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("author")
    private User author;

    @JsonProperty("author")
    public User getAuthor() {
        return author;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    @JsonProperty("body")
    public void setBody(String body) {
        this.body = body;
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

    @JsonProperty("author")
    public void setAuthor(User author) {
        this.author = author;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Comment {\n");
        sb.append("    id: ").append(id == null ? "<null>" : id).append("\n");
        sb.append("    body: ").append(body == null ? "<null>" : body).append("\n");
        sb.append("    created_at: ").append(createdAt == null ? "<null>" : createdAt).append("\n");
        sb.append("    updated_at: ").append(updatedAt == null ? "<null>" : updatedAt).append("\n");
        sb.append("    author: ").append(author == null ? "<null>" : author).append("\n");
        sb.append("}");
        return sb.toString();
    }
}