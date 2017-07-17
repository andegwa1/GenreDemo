package com.example.al.genredemo.genres.classical.classicalAdapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;


public class ClassicalViewPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> list;

    public ClassicalViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public ClassicalViewPagerAdapter(FragmentManager fm, ArrayList<Fragment> list) {
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

