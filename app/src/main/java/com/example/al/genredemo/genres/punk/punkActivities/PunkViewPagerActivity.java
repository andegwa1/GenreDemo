package com.example.al.genredemo.genres.punk.punkActivities;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.al.genredemo.R;
import com.example.al.genredemo.genres.psychedelia.psychedeliaAdapters.PsychViewPagerAdapter;
import com.example.al.genredemo.genres.psychedelia.psychedeliaFragments.PsychAlbumsFragment;
import com.example.al.genredemo.genres.psychedelia.psychedeliaFragments.PsychFragment;
import com.example.al.genredemo.genres.punk.punkAdapters.PunkViewPagerAdapter;
import com.example.al.genredemo.genres.punk.punkFragments.PunkAlbumsFragment;
import com.example.al.genredemo.genres.punk.punkFragments.PunkFragment;

import java.util.ArrayList;

public class PunkViewPagerActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private ArrayList<Fragment> list = new ArrayList<Fragment>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punk_view_pager);
        Log.d("LifeCycle", "onCreate");

        viewPager = (ViewPager)findViewById(R.id.activity_punk_view_pager);
        list.add(new PunkFragment());
        list.add(new PunkAlbumsFragment());

        PunkViewPagerAdapter pagerAdapter =
                new PunkViewPagerAdapter(getSupportFragmentManager(), list);
        viewPager.setAdapter(pagerAdapter);
        viewPager.setCurrentItem(0);
    }

    public PunkViewPagerActivity() {
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
