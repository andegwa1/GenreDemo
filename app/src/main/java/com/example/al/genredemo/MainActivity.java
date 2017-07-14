package com.example.al.genredemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //private TextView tv_genre;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initialView();
        setListener();
    }

//    private void initialView() {
//
//    }

    private void setListener() {
        GenreFragment genreFragment = new GenreFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.activity_genre_fragment,
                genreFragment).commit();
    }
}
