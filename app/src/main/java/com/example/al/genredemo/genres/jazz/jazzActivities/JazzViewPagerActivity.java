package com.example.al.genredemo.genres.jazz.jazzActivities;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.al.genredemo.R;
import com.example.al.genredemo.genres.industrial.industrialAdapters.IndustrialViewPagerAdapter;
import com.example.al.genredemo.genres.industrial.industrialFragments.IndustrialAlbumsFragment;
import com.example.al.genredemo.genres.industrial.industrialFragments.IndustrialFragment;
import com.example.al.genredemo.genres.jazz.jazzAdapters.JazzViewPagerAdapter;
import com.example.al.genredemo.genres.jazz.jazzFragments.JazzAlbumsFragment;
import com.example.al.genredemo.genres.jazz.jazzFragments.JazzFragment;

import java.util.ArrayList;

public class JazzViewPagerActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private ArrayList<Fragment> list = new ArrayList<Fragment>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jazz_view_pager);
        Log.d("LifeCycle", "onCreate");

        viewPager = (ViewPager)findViewById(R.id.activity_jazz_view_pager);
        list.add(new JazzFragment());
        list.add(new JazzAlbumsFragment());

        JazzViewPagerAdapter pagerAdapter =
                new JazzViewPagerAdapter(getSupportFragmentManager(), list);
        viewPager.setAdapter(pagerAdapter);
        viewPager.setCurrentItem(0);
    }

    public JazzViewPagerActivity() {
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
