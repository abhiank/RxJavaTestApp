package com.abhiank.rxjavatestapp.data.source;

import android.content.Context;
import android.support.annotation.NonNull;

import com.abhiank.rxjavatestapp.data.model.PullRequest;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.util.List;

import io.reactivex.Observable;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by abhimanyu on 23/10/17.
 */

public class PullRequestsSource implements PullRequestSourceInterface {

    private static PullRequestsSource INSTANCE;
    private Context context;

    private Retrofit retrofit;
    GithubApi githubApi;

    private static final String BASE_URL = "https://api.github.com/";
    private static final String REPO_PULL_REQUESTS = "repos/{repoOwner}/{repoName}/pulls";

    private PullRequestsSource(Context context) {
        this.context = context;

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder builder = new OkHttpClient.Builder().addInterceptor(interceptor);
        OkHttpClient client = builder.build();


        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(client)
                .build();

        githubApi = retrofit.create(GithubApi.class);
    }

    interface GithubApi {

        @GET(REPO_PULL_REQUESTS)
        Observable<List<PullRequest>> getPullRequests(@Path("repoOwner") String repoOwner,
                                                      @Path("repoName") String repoName);
    }

    public static PullRequestsSource getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = new PullRequestsSource(context);
        }
        return INSTANCE;
    }

    @Override
    public Observable<List<PullRequest>> getAllPullRequests(@NonNull String repoOwner, @NonNull String repoName) {
        return githubApi.getPullRequests(repoOwner, repoName);
    }
}
