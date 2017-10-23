package com.abhiank.rxjavatestapp.getrepo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.abhiank.rxjavatestapp.R;
import com.abhiank.rxjavatestapp.data.model.PullRequest;

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

        pullReqButton = (Button) findViewById(R.id.show_pull_req_button);
        pullReqButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(LOG_TAG, "pull req button clicked1");

                mainPresenter.getPullRequests("googlesamples", "android-architecture");
                pullReqButton.setEnabled(false);
                progressBar.setVisibility(View.VISIBLE);
            }
        });
    }

    @OnClick(R.id.show_pull_req_button)
    public void showPullRequestsButtonClicked() {
        Log.i(LOG_TAG, "pull req button clicked");

        mainPresenter.getPullRequests("googlesamples", "android-architecture");
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
    }
}
