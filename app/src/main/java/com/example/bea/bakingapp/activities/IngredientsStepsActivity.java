package com.example.bea.bakingapp.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.example.bea.bakingapp.R;
import com.example.bea.bakingapp.fragment.IngredientsStepsFragment;

public class IngredientsStepsActivity extends AppCompatActivity {

    public boolean TwoPane = false;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ingredients_steps_activity);
        if (savedInstanceState == null){
            FragmentManager fragmentManager = getSupportFragmentManager();
            if (TwoPane){
                IngredientsStepsFragment ingredientsStepsFragment = new IngredientsStepsFragment();
                fragmentManager.beginTransaction()
                        .add(R.id.ingredients_steps_activity,ingredientsStepsFragment)
                        .commit();
            }else{
                IngredientsStepsFragment ingredientsStepsFragment = new IngredientsStepsFragment();
                fragmentManager.beginTransaction()
                        .add(R.id.ingredients_steps_activity,ingredientsStepsFragment)
                        .commit();
        }
        }
    }
}
