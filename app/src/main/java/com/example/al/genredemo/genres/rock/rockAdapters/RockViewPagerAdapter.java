package com.example.al.genredemo.genres.rock.rockAdapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.al.genredemo.R;

import java.util.ArrayList;

public class RockViewPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> list;

    public RockViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public RockViewPagerAdapter(FragmentManager fm, ArrayList<Fragment> list) {
        super(fm);
        this.list = list;

    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}