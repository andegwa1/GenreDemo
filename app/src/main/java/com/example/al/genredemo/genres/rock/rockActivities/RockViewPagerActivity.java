package com.example.al.genredemo.genres.rock.rockActivities;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.al.genredemo.R;
import com.example.al.genredemo.genres.punk.punkAdapters.PunkViewPagerAdapter;
import com.example.al.genredemo.genres.punk.punkFragments.PunkAlbumsFragment;
import com.example.al.genredemo.genres.punk.punkFragments.PunkFragment;
import com.example.al.genredemo.genres.rock.rockAdapters.RockViewPagerAdapter;
import com.example.al.genredemo.genres.rock.rockFragments.RockAlbumsFragment;
import com.example.al.genredemo.genres.rock.rockFragments.RockFragment;

import java.util.ArrayList;

public class RockViewPagerActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private ArrayList<Fragment> list = new ArrayList<Fragment>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock_view_pager);
        Log.d("LifeCycle", "onCreate");

        viewPager = (ViewPager)findViewById(R.id.activity_rock_view_pager);
        list.add(new RockFragment());
        list.add(new RockAlbumsFragment());

        RockViewPagerAdapter pagerAdapter =
                new RockViewPagerAdapter(getSupportFragmentManager(), list);
        viewPager.setAdapter(pagerAdapter);
        viewPager.setCurrentItem(0);
    }

    public RockViewPagerActivity() {
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
