package com.example.al.genredemo.blues.bluesAdapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Al on 6/12/2017.
 */

public class BluesViewPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> list;

    public BluesViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public BluesViewPagerAdapter(FragmentManager fm, ArrayList<Fragment> list) {
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
