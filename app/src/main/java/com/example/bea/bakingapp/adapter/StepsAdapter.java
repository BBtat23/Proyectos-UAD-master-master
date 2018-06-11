package com.example.bea.bakingapp.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.bea.bakingapp.R;
import com.example.bea.bakingapp.data.Steps;

import java.util.ArrayList;

public class StepsAdapter extends RecyclerView.Adapter<StepsAdapter.StepViewHolder> {

    ArrayList<Steps> stepsArrayList;
    RecipeAdapter.ListItemClickListener listItemClickListener;

    public StepsAdapter(RecipeAdapter.ListItemClickListener listener, ArrayList<Steps> stepsArrayList){
        this.stepsArrayList = stepsArrayList;
        listItemClickListener = listener;
    }
    @NonNull
    @Override
    public StepsAdapter.StepViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.steps_list_item,parent,false);
        StepViewHolder viewHolder = new StepViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull StepsAdapter.StepViewHolder holder, int position) {
    holder.idTextView.setText(stepsArrayList.get(position).getId());
    holder.shortDescriptionTextView.setText(stepsArrayList.get(position).getShortDescription());
    }

    @Override
    public int getItemCount() {
        return stepsArrayList.size();
    }

    public class StepViewHolder extends RecyclerView.ViewHolder {
        TextView idTextView;
        TextView shortDescriptionTextView;
        public StepViewHolder(View itemView) {
            super(itemView);

            idTextView = (TextView) itemView.findViewById(R.id.list_steps_id);
            shortDescriptionTextView = (TextView) itemView.findViewById(R.id.list_step_description);
        }
    }
}
