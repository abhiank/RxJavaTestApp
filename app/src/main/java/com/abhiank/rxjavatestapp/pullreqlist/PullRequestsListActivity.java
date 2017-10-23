package com.abhiank.rxjavatestapp.pullreqlist;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.abhiank.rxjavatestapp.R;
import com.abhiank.rxjavatestapp.data.model.PullRequest;

import org.parceler.Parcels;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PullRequestsListActivity extends AppCompatActivity {

    @BindView(R.id.recycler_view)
    RecyclerView pullRequestsRecyclerView;
    private List<PullRequest> pullRequestList;

    private static final String PULL_REQUEST_INTENT_EXTRA = "pull_reqs";

    public static Intent getIntent(Context context, List<PullRequest> pullRequestList){
        Intent intent = new Intent(context, PullRequestsListActivity.class);
        Parcelable parcelable = Parcels.wrap(pullRequestList);
        intent.putExtra(PULL_REQUEST_INTENT_EXTRA, parcelable);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pull_requests_list);

        ButterKnife.bind(this);

        pullRequestList = Parcels.unwrap(getIntent().getParcelableExtra(PULL_REQUEST_INTENT_EXTRA));

        PullRequestRecyclerAdapter mAdapter = new PullRequestRecyclerAdapter(pullRequestList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        pullRequestsRecyclerView.setLayoutManager(mLayoutManager);
        pullRequestsRecyclerView.setItemAnimator(new DefaultItemAnimator());
        pullRequestsRecyclerView.setAdapter(mAdapter);
    }
}
