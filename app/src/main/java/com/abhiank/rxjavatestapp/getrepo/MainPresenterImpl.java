package com.abhiank.rxjavatestapp.getrepo;

import android.content.Context;
import android.util.Log;

import com.abhiank.rxjavatestapp.data.model.PullRequest;
import com.abhiank.rxjavatestapp.data.source.PullRequestSourceInterface;
import com.abhiank.rxjavatestapp.data.source.PullRequestsSource;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by abhimanyu on 23/10/17.
 */

public class MainPresenterImpl implements MainPresenter {

    public MainView mainView;
    public PullRequestsSource pullRequestsSource;
    public List<PullRequest> pullRequestList;

    public MainPresenterImpl(MainView mainView, Context context) {
        this.mainView = mainView;
        pullRequestsSource = PullRequestsSource.getInstance(context);
    }

    @Override
    public void onResume() {

    }

    @Override
    public void onCreate() {

    }



    @Override
    public void getPullRequests(String repoOwner, String repoName) {

        Log.i("mainPresenterImpl", "getPullReqeusts");
        Observable<List<PullRequest>> observable = pullRequestsSource.getAllPullRequests(repoOwner, repoName);

        observable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new Observer<List<PullRequest>>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull List<PullRequest> pullRequestList) {
                        mainView.showPullRequestsList(pullRequestList);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

}

