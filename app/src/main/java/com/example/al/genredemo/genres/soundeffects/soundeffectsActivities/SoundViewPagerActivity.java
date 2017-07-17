package com.example.al.genredemo.genres.soundeffects.soundeffectsActivities;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.al.genredemo.R;
import com.example.al.genredemo.genres.ska.skaAdapters.SkaViewPagerAdapter;
import com.example.al.genredemo.genres.ska.skaFragments.SkaAlbumsFragment;
import com.example.al.genredemo.genres.ska.skaFragments.SkaFragment;
import com.example.al.genredemo.genres.soundeffects.soundeffectsAdapters.SoundViewPagerAdapter;
import com.example.al.genredemo.genres.soundeffects.soundeffectsFragments.SoundAlbumsFragment;
import com.example.al.genredemo.genres.soundeffects.soundeffectsFragments.SoundFragment;

import java.util.ArrayList;

public class SoundViewPagerActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private ArrayList<Fragment> list = new ArrayList<Fragment>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound_view_pager);
        Log.d("LifeCycle", "onCreate");

        viewPager = (ViewPager)findViewById(R.id.activity_sound_view_pager);
        list.add(new SoundFragment());
        list.add(new SoundAlbumsFragment());

        SoundViewPagerAdapter pagerAdapter =
                new SoundViewPagerAdapter(getSupportFragmentManager(), list);
        viewPager.setAdapter(pagerAdapter);
        viewPager.setCurrentItem(0);
    }

    public SoundViewPagerActivity() {
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
