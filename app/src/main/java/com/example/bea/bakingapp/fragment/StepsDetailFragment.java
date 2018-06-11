package com.example.bea.bakingapp.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bea.bakingapp.R;
import com.example.bea.bakingapp.data.Steps;

import java.util.ArrayList;

public class StepsDetailFragment extends Fragment{
    ArrayList<Steps> stepsArrayList;
    public StepsDetailFragment(){}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_steps_main,container,false);

        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (savedInstanceState != null){
            stepsArrayList = savedInstanceState.getParcelableArrayList(RecipeFragment.RECIPE_LIST)
        }
    }
}
