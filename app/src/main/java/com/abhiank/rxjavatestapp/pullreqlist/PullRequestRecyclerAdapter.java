package com.abhiank.rxjavatestapp.pullreqlist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.abhiank.rxjavatestapp.R;
import com.abhiank.rxjavatestapp.data.model.PullRequest;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by abhimanyu on 24/10/17.
 */

public class PullRequestRecyclerAdapter extends RecyclerView.Adapter<PullRequestRecyclerAdapter.PullRequestViewHolder> {

    private List<PullRequest> pullRequestList;

    public PullRequestRecyclerAdapter(List<PullRequest> pullRequestList) {
        this.pullRequestList = pullRequestList;
    }

    @Override
    public PullRequestViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.pull_request_list_item, parent, false);
        return new PullRequestViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(PullRequestViewHolder holder, int position) {
        PullRequest pullRequest = pullRequestList.get(position);
        holder.id.setText("ID : " + pullRequest.getId());
    }

    @Override
    public int getItemCount() {
        return pullRequestList.size();
    }

    public class PullRequestViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.pull_request_id_textview)
        TextView id;

        public PullRequestViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
