package com.example.al.genredemo.genres.spokenword.spokenwordAdapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.al.genredemo.R;

import java.util.ArrayList;


    public class SpokenViewPagerAdapter extends FragmentPagerAdapter {

        private ArrayList<Fragment> list;

        public SpokenViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        public SpokenViewPagerAdapter(FragmentManager fm, ArrayList<Fragment> list) {
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