package com.example.ivytech.edu.crimetracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public abstract class CrimeActivity extends SingleFragmentActivity {

    @Override
    protected  Fragment createFragment() {
        return new CrimeFragment();
    }

}
