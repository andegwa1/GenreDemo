package com.example.al.genredemo.genres.comedy.comedyActivities;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.al.genredemo.R;
import com.example.al.genredemo.genres.classical.classicalAdapters.ClassicalViewPagerAdapter;
import com.example.al.genredemo.genres.classical.classicalFragments.ClassicalAlbumsFragment;
import com.example.al.genredemo.genres.classical.classicalFragments.ClassicalFragment;
import com.example.al.genredemo.genres.comedy.comedyAdapters.ComedyViewPagerAdapter;
import com.example.al.genredemo.genres.comedy.comedyFragments.ComedyAlbumsFragment;
import com.example.al.genredemo.genres.comedy.comedyFragments.ComedyFragment;

import java.util.ArrayList;

public class ComedyViewPagerActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private ArrayList<Fragment> list = new ArrayList<Fragment>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comedy_view_pager);
        Log.d("LifeCycle", "onCreate");

        viewPager = (ViewPager)findViewById(R.id.activity_comedy_view_pager);
        list.add(new ComedyFragment());
        list.add(new ComedyAlbumsFragment());

        ComedyViewPagerAdapter pagerAdapter =
                new ComedyViewPagerAdapter(getSupportFragmentManager(), list);
        viewPager.setAdapter(pagerAdapter);
        viewPager.setCurrentItem(0);
    }

    public ComedyViewPagerActivity() {
        super();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle", "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle", "onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle", "onDestroy");

    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle", "onPause");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle", "onResume");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle", "onRestart");

    }
}


