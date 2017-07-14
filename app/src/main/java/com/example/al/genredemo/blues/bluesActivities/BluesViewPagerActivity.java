package com.example.al.genredemo.blues.bluesActivities;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.al.genredemo.ambient.ambientAdapters.AmbientViewPagerAdapter;
import com.example.al.genredemo.R;
import com.example.al.genredemo.ambient.ambientFragments.AmbientAlbumsFragment;
import com.example.al.genredemo.ambient.ambientFragments.AmbientFragment;
import com.example.al.genredemo.ambient.ambientFragments.AmbientSubGenreFragment;
import com.example.al.genredemo.blues.bluesAdapters.BluesViewPagerAdapter;
import com.example.al.genredemo.blues.bluesFragments.BluesAlbumsFragment;
import com.example.al.genredemo.blues.bluesFragments.BluesFragment;

import java.util.ArrayList;

public class BluesViewPagerActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private ArrayList<Fragment> list = new ArrayList<Fragment>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blues_view_pager);
        Log.d("LifeCycle", "onCreate");

        viewPager = (ViewPager)findViewById(R.id.activity_blues_view_pager);
        list.add(new BluesFragment());
        list.add(new BluesAlbumsFragment());

        BluesViewPagerAdapter pagerAdapter =
                new BluesViewPagerAdapter(getSupportFragmentManager(), list);
        viewPager.setAdapter(pagerAdapter);
        viewPager.setCurrentItem(0);
    }

    public BluesViewPagerActivity() {
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
