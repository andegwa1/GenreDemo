package com.example.al.genredemo;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.al.genredemo.ambient.ambientActivities.AmbientViewPagerActivity;
import com.example.al.genredemo.blues.bluesActivities.BluesViewPagerActivity;


public class GenreFragment extends Fragment {


    private Context context;
    private TextView tv_ambient;
    private TextView tv_blues;



    public GenreFragment() {
        // Required empty public constructor
        context = getContext();
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_genre, container, false);


        //Ambient genre
        //AmbientViewPagerAdapter adapter = new AmbientViewPagerAdapter();
        tv_ambient = (TextView) view.findViewById(R.id.genre_ambient);
        tv_ambient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(),"Ambient", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), AmbientViewPagerActivity.class);
                startActivity(intent);
            }
        });

        //Blues genre
        tv_blues = (TextView) view.findViewById(R.id.genre_blues);
        tv_blues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(),"Ambient", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), BluesViewPagerActivity.class);
                startActivity(intent);
            }
        });


        return view;
    }

}
