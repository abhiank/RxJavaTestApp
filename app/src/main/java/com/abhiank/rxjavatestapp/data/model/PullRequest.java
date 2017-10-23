
package com.abhiank.rxjavatestapp.data.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class PullRequest {

    @SerializedName("url")
    @Expose
    String url;
    @SerializedName("id")
    @Expose
    Integer id;
    @SerializedName("html_url")
    @Expose
    String htmlUrl;
    @SerializedName("diff_url")
    @Expose
    String diffUrl;
    @SerializedName("patch_url")
    @Expose
    String patchUrl;
    @SerializedName("issue_url")
    @Expose
    String issueUrl;
    @SerializedName("number")
    @Expose
    Integer number;
    @SerializedName("state")
    @Expose
    String state;
    @SerializedName("locked")
    @Expose
    Boolean locked;
    @SerializedName("title")
    @Expose
    String title;
    @SerializedName("user")
    @Expose
    User user;
    @SerializedName("body")
    @Expose
    String body;
    @SerializedName("created_at")
    @Expose
    String createdAt;
    @SerializedName("updated_at")
    @Expose
    String updatedAt;
    @SerializedName("closed_at")
    @Expose
    String mergeCommitSha;
    @SerializedName("requested_reviewers")
    @Expose
    List<RequestedReviewer> requestedReviewers = null;
    @SerializedName("commits_url")
    @Expose
    String commitsUrl;
    @SerializedName("review_comments_url")
    @Expose
    String reviewCommentsUrl;
    @SerializedName("review_comment_url")
    @Expose
    String reviewCommentUrl;
    @SerializedName("comments_url")
    @Expose
    String commentsUrl;
    @SerializedName("statuses_url")
    @Expose
    String statusesUrl;
    @SerializedName("head")
    @Expose
    Head head;
    @SerializedName("base")
    @Expose
    Base base;
    @SerializedName("_links")
    @Expose
    Links links;
    @SerializedName("author_association")
    @Expose
    String authorAssociation;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getDiffUrl() {
        return diffUrl;
    }

    public void setDiffUrl(String diffUrl) {
        this.diffUrl = diffUrl;
    }

    public String getPatchUrl() {
        return patchUrl;
    }

    public void setPatchUrl(String patchUrl) {
        this.patchUrl = patchUrl;
    }

    public String getIssueUrl() {
        return issueUrl;
    }

    public void setIssueUrl(String issueUrl) {
        this.issueUrl = issueUrl;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getMergeCommitSha() {
        return mergeCommitSha;
    }

    public void setMergeCommitSha(String mergeCommitSha) {
        this.mergeCommitSha = mergeCommitSha;
    }

    public List<RequestedReviewer> getRequestedReviewers() {
        return requestedReviewers;
    }

    public void setRequestedReviewers(List<RequestedReviewer> requestedReviewers) {
        this.requestedReviewers = requestedReviewers;
    }

    public String getCommitsUrl() {
        return commitsUrl;
    }

    public void setCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    public String getReviewCommentsUrl() {
        return reviewCommentsUrl;
    }

    public void setReviewCommentsUrl(String reviewCommentsUrl) {
        this.reviewCommentsUrl = reviewCommentsUrl;
    }

    public String getReviewCommentUrl() {
        return reviewCommentUrl;
    }

    public void setReviewCommentUrl(String reviewCommentUrl) {
        this.reviewCommentUrl = reviewCommentUrl;
    }

    public String getCommentsUrl() {
        return commentsUrl;
    }

    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public String getStatusesUrl() {
        return statusesUrl;
    }

    public void setStatusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public String getAuthorAssociation() {
        return authorAssociation;
    }

    public void setAuthorAssociation(String authorAssociation) {
        this.authorAssociation = authorAssociation;
    }

}
