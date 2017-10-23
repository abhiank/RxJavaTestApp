package com.abhiank.rxjavatestapp.data.source;

import android.support.annotation.NonNull;

import com.abhiank.rxjavatestapp.data.model.PullRequest;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by abhimanyu on 23/10/17.
 */

public interface PullRequestSourceInterface {

    Observable<List<PullRequest>> getAllPullRequests(@NonNull String repoOwner, @NonNull String repoName);

}
