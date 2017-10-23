package com.abhiank.rxjavatestapp.getrepo;

/**
 * Created by abhimanyu on 23/10/17.
 */

public interface MainPresenter {

    public void onResume();

    public void onCreate();

    public void getPullRequests(String repoOwner, String repoName);

}
