package com.example.al.genredemo.genres.fieldrecordings.fieldrecordingsAdapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.al.genredemo.R;

import java.util.ArrayList;

    public class FieldViewPagerAdapter extends FragmentPagerAdapter {

        private ArrayList<Fragment> list;

        public FieldViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        public FieldViewPagerAdapter(FragmentManager fm, ArrayList<Fragment> list) {
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

