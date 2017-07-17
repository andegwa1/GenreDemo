package com.example.al.genredemo.genres.ambient.ambientAdapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Al on 6/12/2017.
 */

public class AmbientViewPagerAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> list;

    public AmbientViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public AmbientViewPagerAdapter(FragmentManager fm, ArrayList<Fragment> list) {
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
