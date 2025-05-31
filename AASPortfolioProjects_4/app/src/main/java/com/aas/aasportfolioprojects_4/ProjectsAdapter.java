package com.aas.aasportfolioprojects_4;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProjectsAdapter extends RecyclerView.Adapter<ProjectsAdapter.ProjectViewHolder> {



    @NonNull
    @Override
    //This is where we create the view holder
    public ProjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    //This is where we bind the data to the view holder
    public void onBindViewHolder(@NonNull ProjectViewHolder holder, int position) {

    }

    @Override
    //This is where we get the size of the list
    public int getItemCount() {
        return 0;
    }

    static class ProjectViewHolder extends RecyclerView.ViewHolder{

        public ProjectViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
