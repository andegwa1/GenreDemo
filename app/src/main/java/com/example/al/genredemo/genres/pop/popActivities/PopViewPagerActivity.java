package com.example.al.genredemo.genres.pop.popActivities;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.al.genredemo.R;
import com.example.al.genredemo.genres.plunderphonics.plunderphonicsAdapters.PlunderViewPagerAdapter;
import com.example.al.genredemo.genres.plunderphonics.plunderphonicsFragments.PlunderAlbumsFragment;
import com.example.al.genredemo.genres.plunderphonics.plunderphonicsFragments.PlunderFragment;
import com.example.al.genredemo.genres.pop.popAdapters.PopViewPagerAdapter;
import com.example.al.genredemo.genres.pop.popFragments.PopAlbumsFragment;
import com.example.al.genredemo.genres.pop.popFragments.PopFragment;
import com.example.al.genredemo.genres.psychedelia.psychedeliaAdapters.PsychViewPagerAdapter;
import com.example.al.genredemo.genres.psychedelia.psychedeliaFragments.PsychAlbumsFragment;
import com.example.al.genredemo.genres.psychedelia.psychedeliaFragments.PsychFragment;

import java.util.ArrayList;

public class PopViewPagerActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private ArrayList<Fragment> list = new ArrayList<Fragment>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_view_pager);
        Log.d("LifeCycle", "onCreate");

        viewPager = (ViewPager)findViewById(R.id.activity_pop_view_pager);
        list.add(new PopFragment());
        list.add(new PopAlbumsFragment());

        PopViewPagerAdapter pagerAdapter =
                new PopViewPagerAdapter(getSupportFragmentManager(), list);
        viewPager.setAdapter(pagerAdapter);
        viewPager.setCurrentItem(0);
    }

    public PopViewPagerActivity() {
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
