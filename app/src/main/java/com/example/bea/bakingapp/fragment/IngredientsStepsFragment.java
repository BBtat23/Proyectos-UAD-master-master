package com.example.bea.bakingapp.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bea.bakingapp.R;
import com.example.bea.bakingapp.adapter.IngredientsAdapter;
import com.example.bea.bakingapp.data.Ingredients;
import com.example.bea.bakingapp.data.Recipe;
import com.example.bea.bakingapp.data.Steps;

import java.util.ArrayList;

public class IngredientsStepsFragment extends Fragment {
    RecyclerView ingredientsRecyclerView;
    RecyclerView stepsRecyclerView;
    ArrayList<Steps> stepsArrayList;
    ArrayList<Ingredients> ingredientsArrayList;
    ArrayList<Recipe> recipeArrayList;
    int position;
    public IngredientsStepsFragment(){}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_steps_ingredients_detail,container,false);
        //Creating RecyclerView instance
        ingredientsRecyclerView = (RecyclerView)rootView.findViewById(R.id.ingredients_list);
        stepsRecyclerView = (RecyclerView) rootView.findViewById(R.id.steps_list_details);

        //Setting layoutManager
        ingredientsRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        stepsRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        //Getting data in recipeList with position
        recipeArrayList = getActivity().getIntent().getParcelableArrayListExtra(RecipeFragment.RECIPE_LIST);
        position = getActivity().getIntent().getExtras().getInt(RecipeFragment.POSITION);

        //Getting steps and ingredients from the recipeArrayList
        stepsArrayList = recipeArrayList.get(position).getStepsArrayList();
        ingredientsArrayList = recipeArrayList.get(position).getIngredientsArrayList();

        //Ingredients and steps Adapter with RecyclerViews
        IngredientsAdapter ingredientsAdapter = new IngredientsAdapter(ingredientsArrayList);
        ingredientsRecyclerView.setAdapter(ingredientsAdapter);

        return rootView;
    }
}
