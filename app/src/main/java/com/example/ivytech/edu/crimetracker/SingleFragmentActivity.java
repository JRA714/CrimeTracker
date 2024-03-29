package com.example.ivytech.edu.crimetracker;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public abstract class SingleFragmentActivity extends AppCompatActivity {
    protected abstract Fragment createFragment();

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_fragment);

            FragmentManager fm  = getSupportFragmentManager();
            Fragment fragment = fm.findFragmentById(R.id.fragment_constrainer);

            if(fragment == null) {
                fragment = createFragment();
                fm.beginTransaction().add(R.id.fragment_constrainer,fragment).commit();
            }
        }

}
