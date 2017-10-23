
package com.abhiank.rxjavatestapp.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class Repo {

    @SerializedName("id")
    @Expose
    Integer id;
    @SerializedName("name")
    @Expose
    String name;
    @SerializedName("full_name")
    @Expose
    String fullName;
    @SerializedName("owner")
    @Expose
    Owner owner;
    @SerializedName("private")
    @Expose
    Boolean _private;
    @SerializedName("html_url")
    @Expose
    String htmlUrl;
    @SerializedName("description")
    @Expose
    String description;
    @SerializedName("fork")
    @Expose
    Boolean fork;
    @SerializedName("url")
    @Expose
    String url;
    @SerializedName("forks_url")
    @Expose
    String forksUrl;
    @SerializedName("keys_url")
    @Expose
    String keysUrl;
    @SerializedName("collaborators_url")
    @Expose
    String collaboratorsUrl;
    @SerializedName("teams_url")
    @Expose
    String teamsUrl;
    @SerializedName("hooks_url")
    @Expose
    String hooksUrl;
    @SerializedName("issue_events_url")
    @Expose
    String issueEventsUrl;
    @SerializedName("events_url")
    @Expose
    String eventsUrl;
    @SerializedName("assignees_url")
    @Expose
    String assigneesUrl;
    @SerializedName("branches_url")
    @Expose
    String branchesUrl;
    @SerializedName("tags_url")
    @Expose
    String tagsUrl;
    @SerializedName("blobs_url")
    @Expose
    String blobsUrl;
    @SerializedName("git_tags_url")
    @Expose
    String gitTagsUrl;
    @SerializedName("git_refs_url")
    @Expose
    String gitRefsUrl;
    @SerializedName("trees_url")
    @Expose
    String treesUrl;
    @SerializedName("statuses_url")
    @Expose
    String statusesUrl;
    @SerializedName("languages_url")
    @Expose
    String languagesUrl;
    @SerializedName("stargazers_url")
    @Expose
    String stargazersUrl;
    @SerializedName("contributors_url")
    @Expose
    String contributorsUrl;
    @SerializedName("subscribers_url")
    @Expose
    String subscribersUrl;
    @SerializedName("subscription_url")
    @Expose
    String subscriptionUrl;
    @SerializedName("commits_url")
    @Expose
    String commitsUrl;
    @SerializedName("git_commits_url")
    @Expose
    String gitCommitsUrl;
    @SerializedName("comments_url")
    @Expose
    String commentsUrl;
    @SerializedName("issue_comment_url")
    @Expose
    String issueCommentUrl;
    @SerializedName("contents_url")
    @Expose
    String contentsUrl;
    @SerializedName("compare_url")
    @Expose
    String compareUrl;
    @SerializedName("merges_url")
    @Expose
    String mergesUrl;
    @SerializedName("archive_url")
    @Expose
    String archiveUrl;
    @SerializedName("downloads_url")
    @Expose
    String downloadsUrl;
    @SerializedName("issues_url")
    @Expose
    String issuesUrl;
    @SerializedName("pulls_url")
    @Expose
    String pullsUrl;
    @SerializedName("milestones_url")
    @Expose
    String milestonesUrl;
    @SerializedName("notifications_url")
    @Expose
    String notificationsUrl;
    @SerializedName("labels_url")
    @Expose
    String labelsUrl;
    @SerializedName("releases_url")
    @Expose
    String releasesUrl;
    @SerializedName("deployments_url")
    @Expose
    String deploymentsUrl;
    @SerializedName("created_at")
    @Expose
    String createdAt;
    @SerializedName("updated_at")
    @Expose
    String updatedAt;
    @SerializedName("pushed_at")
    @Expose
    String pushedAt;
    @SerializedName("git_url")
    @Expose
    String gitUrl;
    @SerializedName("ssh_url")
    @Expose
    String sshUrl;
    @SerializedName("clone_url")
    @Expose
    String cloneUrl;
    @SerializedName("svn_url")
    @Expose
    String svnUrl;
    @SerializedName("homepage")
    @Expose
    String homepage;
    @SerializedName("size")
    @Expose
    Integer size;
    @SerializedName("stargazers_count")
    @Expose
    Integer stargazersCount;
    @SerializedName("watchers_count")
    @Expose
    Integer watchersCount;
    @SerializedName("has_issues")
    @Expose
    Boolean hasIssues;
    @SerializedName("has_projects")
    @Expose
    Boolean hasProjects;
    @SerializedName("has_downloads")
    @Expose
    Boolean hasDownloads;
    @SerializedName("has_wiki")
    @Expose
    Boolean hasWiki;
    @SerializedName("has_pages")
    @Expose
    Boolean hasPages;
    @SerializedName("forks_count")
    @Expose
    Integer forksCount;
    @SerializedName("archived")
    @Expose
    Boolean archived;
    @SerializedName("open_issues_count")
    @Expose
    Integer openIssuesCount;
    @SerializedName("forks")
    @Expose
    Integer forks;
    @SerializedName("open_issues")
    @Expose
    Integer openIssues;
    @SerializedName("watchers")
    @Expose
    Integer watchers;
    @SerializedName("default_branch")
    @Expose
    String defaultBranch;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Boolean getPrivate() {
        return _private;
    }

    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getFork() {
        return fork;
    }

    public void setFork(Boolean fork) {
        this.fork = fork;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getForksUrl() {
        return forksUrl;
    }

    public void setForksUrl(String forksUrl) {
        this.forksUrl = forksUrl;
    }

    public String getKeysUrl() {
        return keysUrl;
    }

    public void setKeysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
    }

    public String getCollaboratorsUrl() {
        return collaboratorsUrl;
    }

    public void setCollaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
    }

    public String getTeamsUrl() {
        return teamsUrl;
    }

    public void setTeamsUrl(String teamsUrl) {
        this.teamsUrl = teamsUrl;
    }

    public String getHooksUrl() {
        return hooksUrl;
    }

    public void setHooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
    }

    public String getIssueEventsUrl() {
        return issueEventsUrl;
    }

    public void setIssueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public String getAssigneesUrl() {
        return assigneesUrl;
    }

    public void setAssigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
    }

    public String getBranchesUrl() {
        return branchesUrl;
    }

    public void setBranchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
    }

    public String getTagsUrl() {
        return tagsUrl;
    }

    public void setTagsUrl(String tagsUrl) {
        this.tagsUrl = tagsUrl;
    }

    public String getBlobsUrl() {
        return blobsUrl;
    }

    public void setBlobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
    }

    public String getGitTagsUrl() {
        return gitTagsUrl;
    }

    public void setGitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
    }

    public String getGitRefsUrl() {
        return gitRefsUrl;
    }

    public void setGitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
    }

    public String getTreesUrl() {
        return treesUrl;
    }

    public void setTreesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
    }

    public String getStatusesUrl() {
        return statusesUrl;
    }

    public void setStatusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    public String getLanguagesUrl() {
        return languagesUrl;
    }

    public void setLanguagesUrl(String languagesUrl) {
        this.languagesUrl = languagesUrl;
    }

    public String getStargazersUrl() {
        return stargazersUrl;
    }

    public void setStargazersUrl(String stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
    }

    public String getContributorsUrl() {
        return contributorsUrl;
    }

    public void setContributorsUrl(String contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
    }

    public String getSubscribersUrl() {
        return subscribersUrl;
    }

    public void setSubscribersUrl(String subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
    }

    public String getSubscriptionUrl() {
        return subscriptionUrl;
    }

    public void setSubscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
    }

    public String getCommitsUrl() {
        return commitsUrl;
    }

    public void setCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    public String getGitCommitsUrl() {
        return gitCommitsUrl;
    }

    public void setGitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
    }

    public String getCommentsUrl() {
        return commentsUrl;
    }

    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public String getIssueCommentUrl() {
        return issueCommentUrl;
    }

    public void setIssueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
    }

    public String getContentsUrl() {
        return contentsUrl;
    }

    public void setContentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
    }

    public String getCompareUrl() {
        return compareUrl;
    }

    public void setCompareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
    }

    public String getMergesUrl() {
        return mergesUrl;
    }

    public void setMergesUrl(String mergesUrl) {
        this.mergesUrl = mergesUrl;
    }

    public String getArchiveUrl() {
        return archiveUrl;
    }

    public void setArchiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
    }

    public String getDownloadsUrl() {
        return downloadsUrl;
    }

    public void setDownloadsUrl(String downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
    }

    public String getIssuesUrl() {
        return issuesUrl;
    }

    public void setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    public String getPullsUrl() {
        return pullsUrl;
    }

    public void setPullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
    }

    public String getMilestonesUrl() {
        return milestonesUrl;
    }

    public void setMilestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
    }

    public String getNotificationsUrl() {
        return notificationsUrl;
    }

    public void setNotificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
    }

    public String getLabelsUrl() {
        return labelsUrl;
    }

    public void setLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
    }

    public String getReleasesUrl() {
        return releasesUrl;
    }

    public void setReleasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
    }

    public String getDeploymentsUrl() {
        return deploymentsUrl;
    }

    public void setDeploymentsUrl(String deploymentsUrl) {
        this.deploymentsUrl = deploymentsUrl;
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

    public String getPushedAt() {
        return pushedAt;
    }

    public void setPushedAt(String pushedAt) {
        this.pushedAt = pushedAt;
    }

    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public String getSshUrl() {
        return sshUrl;
    }

    public void setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
    }

    public String getCloneUrl() {
        return cloneUrl;
    }

    public void setCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
    }

    public String getSvnUrl() {
        return svnUrl;
    }

    public void setSvnUrl(String svnUrl) {
        this.svnUrl = svnUrl;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getStargazersCount() {
        return stargazersCount;
    }

    public void setStargazersCount(Integer stargazersCount) {
        this.stargazersCount = stargazersCount;
    }

    public Integer getWatchersCount() {
        return watchersCount;
    }

    public void setWatchersCount(Integer watchersCount) {
        this.watchersCount = watchersCount;
    }

    public Boolean getHasIssues() {
        return hasIssues;
    }

    public void setHasIssues(Boolean hasIssues) {
        this.hasIssues = hasIssues;
    }

    public Boolean getHasProjects() {
        return hasProjects;
    }

    public void setHasProjects(Boolean hasProjects) {
        this.hasProjects = hasProjects;
    }

    public Boolean getHasDownloads() {
        return hasDownloads;
    }

    public void setHasDownloads(Boolean hasDownloads) {
        this.hasDownloads = hasDownloads;
    }

    public Boolean getHasWiki() {
        return hasWiki;
    }

    public void setHasWiki(Boolean hasWiki) {
        this.hasWiki = hasWiki;
    }

    public Boolean getHasPages() {
        return hasPages;
    }

    public void setHasPages(Boolean hasPages) {
        this.hasPages = hasPages;
    }

    public Integer getForksCount() {
        return forksCount;
    }

    public void setForksCount(Integer forksCount) {
        this.forksCount = forksCount;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public Integer getOpenIssuesCount() {
        return openIssuesCount;
    }

    public void setOpenIssuesCount(Integer openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
    }

    public Integer getForks() {
        return forks;
    }

    public void setForks(Integer forks) {
        this.forks = forks;
    }

    public Integer getOpenIssues() {
        return openIssues;
    }

    public void setOpenIssues(Integer openIssues) {
        this.openIssues = openIssues;
    }

    public Integer getWatchers() {
        return watchers;
    }

    public void setWatchers(Integer watchers) {
        this.watchers = watchers;
    }

    public String getDefaultBranch() {
        return defaultBranch;
    }

    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

}
