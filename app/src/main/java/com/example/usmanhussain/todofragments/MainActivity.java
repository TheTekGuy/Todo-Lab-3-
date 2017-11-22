package com.example.usmanhussain.todofragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { // runs whent the app starts
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // sets the content view to the main activity.

        // Note, the activity_main contains only the dimensions, not any of the components

        FragmentManager fm = getSupportFragmentManager(); // initilase the fragment manager
        Fragment fragment = fm.findFragmentById(R.id.fragment_container); // set up the fragment manager to use the fragment container from teh resource files

        if (fragment == null){
            TodoFragment todoFragment = new TodoFragment();
            fm.beginTransaction()
                    .add(R.id.fragment_container, todoFragment) // instantiates the fragment onbjects from the fragmentstodo.xml into a fragment view
                    .commit();
        }

    }
}