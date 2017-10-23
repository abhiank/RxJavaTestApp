package com.abhiank.rxjavatestapp.getrepo;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.abhiank.rxjavatestapp.R;
import com.abhiank.rxjavatestapp.data.model.PullRequest;
import com.abhiank.rxjavatestapp.pullreqlist.PullRequestsListActivity;

import org.parceler.Parcels;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainView {

    @BindView(R.id.repo_name_edittext)
    EditText repoNameEditText;
    @BindView(R.id.repo_owner_edittext)
    EditText repoOwnerEditText;
    @BindView(R.id.progress_bar)
    ProgressBar progressBar;
    @BindView(R.id.show_pull_req_button)
    Button pullReqButton;

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mainPresenter = new MainPresenterImpl(this, getApplicationContext());
    }

    @OnClick(R.id.show_pull_req_button)
    public void showPullRequestsButtonClicked() {
        Log.i(LOG_TAG, "pull req button clicked");

        if (TextUtils.isEmpty(repoOwnerEditText.getText())) {
            Toast.makeText(MainActivity.this, "No repo owner given!", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(repoNameEditText.getText())) {
            Toast.makeText(MainActivity.this, "No repo name given!", Toast.LENGTH_SHORT).show();
            return;
        }

        mainPresenter.getPullRequests(repoOwnerEditText.getText().toString(),
                repoNameEditText.getText().toString());
        pullReqButton.setEnabled(false);
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void showError(String error) {
        Toast.makeText(MainActivity.this, error, Toast.LENGTH_SHORT).show();
        pullReqButton.setEnabled(true);
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void showPullRequestsList(List<PullRequest> pullRequestList) {
        pullReqButton.setEnabled(true);
        progressBar.setVisibility(View.GONE);
        Toast.makeText(MainActivity.this, "Got " + pullRequestList.size() + " Pull reqs", Toast.LENGTH_SHORT).show();

        startActivity(PullRequestsListActivity.getIntent(MainActivity.this, pullRequestList));
    }
}
