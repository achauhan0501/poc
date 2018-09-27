package com.example.ashish.task.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ashish.task.R;

import org.jetbrains.annotations.NotNull;

/*
public class RepositoriesRecyclerAdapter extends RecyclerView.Adapter<RepositoriesRecyclerAdapter.RepositoryViewHolder> {

    private final RepositoriesListPresenter presenter;

    public RepositoriesRecyclerAdapter(RepositoriesListPresenter repositoriesPresenter) {
        this.presenter = repositoriesPresenter;
    }

    @Override
    public RepositoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RepositoryViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cell_repo_view, parent, false));
    }

    @Override
    public void onBindViewHolder(RepositoryViewHolder holder, int position) {
        presenter.onBindRepositoryRowViewAtPosition(position, holder);

    }

    @Override
    public int getItemCount() {
        return presenter.getRepositoriesRowsCount();
    }

    public class RepositoryViewHolder extends RecyclerView.ViewHolder implements GetDataInterface.RowView {

        TextView titleTextView;
        TextView starsCountTextView;

        public RepositoryViewHolder(View itemView) {
            super(itemView);
//        titleTextView = itemView.findViewById(R.id.repoTitleText);
//        starsCountTextView = itemView.findViewById(R.id.repoStarsCountText);
        }

        @Override
        public void setTitle(String title) {
            titleTextView.setText(title);
        }


        @Override
        public void setDescription(@NotNull String description) {

        }

        @Override
        public void setImage(@NotNull String url) {

        }
    }
}
*/
