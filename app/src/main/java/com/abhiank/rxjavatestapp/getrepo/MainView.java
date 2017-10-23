package com.abhiank.rxjavatestapp.getrepo;

import com.abhiank.rxjavatestapp.data.model.PullRequest;

import java.util.List;

/**
 * Created by abhimanyu on 23/10/17.
 */

public interface MainView {

    void showError(String error);

    void showPullRequestsList(List<PullRequest> pullRequestList);
}
