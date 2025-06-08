package com.aas.aasportfolioprojects_4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProjectsAdapter extends RecyclerView.Adapter<ProjectsAdapter.ProjectViewHolder> {

    private Project[] projects;

    public ProjectsAdapter(Project[] projects) {
        this.projects = projects;
    }

    @Override

    public int getItemCount() {
        return projects.length;
    }

    @NonNull
    @Override
    //This is where we create the view holder
    public ProjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_project,parent,false);
        return new ProjectViewHolder(view);
    }

    @Override

    public void onBindViewHolder(@NonNull ProjectViewHolder holder, int position) {

    }


    static class ProjectViewHolder extends RecyclerView.ViewHolder{

        public ProjectViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
