package com.example.al.genredemo.genres.metal.metalActivities;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.al.genredemo.R;
import com.example.al.genredemo.genres.jazz.jazzAdapters.JazzViewPagerAdapter;
import com.example.al.genredemo.genres.jazz.jazzFragments.JazzAlbumsFragment;
import com.example.al.genredemo.genres.jazz.jazzFragments.JazzFragment;
import com.example.al.genredemo.genres.metal.metalAdapters.MetalViewPagerAdapter;
import com.example.al.genredemo.genres.metal.metalFragments.MetalAlbumsFragment;
import com.example.al.genredemo.genres.metal.metalFragments.MetalFragment;

import java.util.ArrayList;

public class MetalViewPagerActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private ArrayList<Fragment> list = new ArrayList<Fragment>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metal_view_pager);
        Log.d("LifeCycle", "onCreate");

        viewPager = (ViewPager)findViewById(R.id.activity_metal_view_pager);
        list.add(new MetalFragment());
        list.add(new MetalAlbumsFragment());

        MetalViewPagerAdapter pagerAdapter =
                new MetalViewPagerAdapter(getSupportFragmentManager(), list);
        viewPager.setAdapter(pagerAdapter);
        viewPager.setCurrentItem(0);
    }

    public MetalViewPagerActivity() {
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
