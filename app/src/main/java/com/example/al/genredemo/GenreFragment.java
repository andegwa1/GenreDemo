package com.example.al.genredemo;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.al.genredemo.genres.ambient.ambientActivities.AmbientViewPagerActivity;
import com.example.al.genredemo.genres.blues.bluesActivities.BluesViewPagerActivity;
import com.example.al.genredemo.genres.classical.classicalActivities.ClassicalViewPagerActivity;
import com.example.al.genredemo.genres.comedy.comedyActivities.ComedyViewPagerActivity;
import com.example.al.genredemo.genres.dance.danceActivities.DanceViewPagerActivity;
import com.example.al.genredemo.genres.darkwave.darkwaveActivities.DarkwaveViewPagerActivity;
import com.example.al.genredemo.genres.electronic.electronicActivities.ElectronicViewPagerActivity;
import com.example.al.genredemo.genres.experimental.experimentalActivities.ExperimentalViewPagerActivity;
import com.example.al.genredemo.genres.fieldrecordings.fieldrecordingsActivities.FieldViewPagerActivity;
import com.example.al.genredemo.genres.folk.folkActivities.FolkViewPagerActivity;
import com.example.al.genredemo.genres.hiphop.hiphopActivities.HipHopViewPagerActivity;
import com.example.al.genredemo.genres.industrial.industrialActivities.IndustrialViewPagerActivity;
import com.example.al.genredemo.genres.jazz.jazzActivities.JazzViewPagerActivity;
import com.example.al.genredemo.genres.metal.metalActivities.MetalViewPagerActivity;
import com.example.al.genredemo.genres.musictheatre.musictheatreActivities.MusicTheatreViewPagerActivity;
import com.example.al.genredemo.genres.newage.newageActivities.NewAgeViewPagerActivity;
import com.example.al.genredemo.genres.plunderphonics.plunderphonicsActivities.PlunderViewPagerActivity;
import com.example.al.genredemo.genres.pop.popActivities.PopViewPagerActivity;
import com.example.al.genredemo.genres.psychedelia.psychedeliaActivities.PsychViewPagerActivity;
import com.example.al.genredemo.genres.punk.punkActivities.PunkViewPagerActivity;
import com.example.al.genredemo.genres.rock.rockActivities.RockViewPagerActivity;
import com.example.al.genredemo.genres.singer.singerActivities.SingerViewPagerActivity;
import com.example.al.genredemo.genres.ska.skaActivities.SkaViewPagerActivity;
import com.example.al.genredemo.genres.soundeffects.soundeffectsActivities.SoundViewPagerActivity;
import com.example.al.genredemo.genres.spaghettiwestern.spaghettiwesternActivities.SpaghettiViewPagerActivity;
import com.example.al.genredemo.genres.spokenword.spokenwordActivities.SpokenViewPagerActivity;
import com.example.al.genredemo.misc.AnimatorActivity;
import com.example.al.genredemo.misc.GestureActivity;
import com.example.al.genredemo.misc.RunnableHandlerActivity;


public class GenreFragment extends Fragment {


    private Context context;
    private TextView tv_ambient;
    private TextView tv_blues;

    private TextView tv_classical;
    private TextView tv_comedy;

    private TextView tv_dance;
    private TextView tv_darkwave;

    private TextView tv_elect;
    private TextView tv_exper;

    private TextView tv_field;
    private TextView tv_folk;

    private TextView tv_hip;
    private TextView tv_ind;

    private TextView tv_jazz;
    private TextView tv_metal;

    private TextView tv_musthr;
    private TextView tv_newage;

    private TextView tv_plunder;
    private TextView tv_pop;

    private TextView tv_psych;
    private TextView tv_punk;

    private TextView tv_rock;
    private TextView tv_singer;

    private TextView tv_ska;
    private TextView tv_sound;

    private TextView tv_spag;
    private TextView tv_spoken;



    ///
    private TextView tv_anim;
    private TextView tv_handler;

    private TextView tv_bundle;
    private TextView tv_gesture;



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

        //Classical genre
        tv_classical = (TextView) view.findViewById(R.id.genre_classical);
        tv_classical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(),"Ambient", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), ClassicalViewPagerActivity.class);
                startActivity(intent);
            }
        });

        //Comedy genre
        tv_comedy = (TextView) view.findViewById(R.id.genre_comedy);
        tv_comedy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(),"Ambient", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), ComedyViewPagerActivity.class);
                startActivity(intent);
            }
        });

        //Dance genre
        tv_dance = (TextView) view.findViewById(R.id.genre_dance);
        tv_dance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(),"Ambient", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), DanceViewPagerActivity.class);
                startActivity(intent);
            }
        });

        //Darkwave genre
        tv_darkwave = (TextView) view.findViewById(R.id.genre_dark);
        tv_darkwave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(),"Ambient", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), DarkwaveViewPagerActivity.class);
                startActivity(intent);
            }
        });



        //Dance genre
        tv_elect = (TextView) view.findViewById(R.id.genre_electronic);
        tv_elect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(),"Ambient", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), ElectronicViewPagerActivity.class);
                startActivity(intent);
            }
        });

        //Darkwave genre
        tv_exper = (TextView) view.findViewById(R.id.genre_expr);
        tv_exper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(),"Ambient", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), ExperimentalViewPagerActivity.class);
                startActivity(intent);
            }
        });

        //Dance genre
        tv_field = (TextView) view.findViewById(R.id.genre_field);
        tv_field.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(),"Ambient", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), FieldViewPagerActivity.class);
                startActivity(intent);
            }
        });

        //Darkwave genre
        tv_folk = (TextView) view.findViewById(R.id.genre_folk);
        tv_folk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(),"Ambient", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), FolkViewPagerActivity.class);
                startActivity(intent);
            }
        });

        //Dance genre
        tv_hip = (TextView) view.findViewById(R.id.genre_hip);
        tv_hip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(),"Ambient", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), HipHopViewPagerActivity.class);
                startActivity(intent);
            }
        });

        //Darkwave genre
        tv_ind = (TextView) view.findViewById(R.id.genre_ind);
        tv_ind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(),"Ambient", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), IndustrialViewPagerActivity.class);
                startActivity(intent);
            }
        });

        //Dance genre
        tv_jazz = (TextView) view.findViewById(R.id.genre_jazz);
        tv_jazz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(),"Ambient", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), JazzViewPagerActivity.class);
                startActivity(intent);
            }
        });

        //Darkwave genre
        tv_metal = (TextView) view.findViewById(R.id.genre_metal);
        tv_metal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(),"Ambient", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), MetalViewPagerActivity.class);
                startActivity(intent);
            }
        });


        //Dance genre
        tv_musthr = (TextView) view.findViewById(R.id.genre_music_thr);
        tv_musthr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(),"Ambient", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), MusicTheatreViewPagerActivity.class);
                startActivity(intent);
            }
        });

        //Darkwave genre
        tv_newage = (TextView) view.findViewById(R.id.genre_new_age);
        tv_newage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(),"Ambient", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), NewAgeViewPagerActivity.class);
                startActivity(intent);
            }
        });

        tv_plunder = (TextView) view.findViewById(R.id.genre_plund);
        tv_plunder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(),"Ambient", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), PlunderViewPagerActivity.class);
                startActivity(intent);
            }
        });

        tv_pop = (TextView) view.findViewById(R.id.genre_pop_tv);
        tv_pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(),"Ambient", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), PopViewPagerActivity.class);
                startActivity(intent);
            }
        });

        tv_psych = (TextView) view.findViewById(R.id.genre_physch);
        tv_psych.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(),"Ambient", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), PsychViewPagerActivity.class);
                startActivity(intent);
            }
        });


        tv_punk = (TextView) view.findViewById(R.id.genre_punk);
        tv_punk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(),"Ambient", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), PunkViewPagerActivity.class);
                startActivity(intent);
            }
        });

        tv_rock = (TextView) view.findViewById(R.id.genre_rock);
        tv_rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(),"Ambient", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), RockViewPagerActivity.class);
                startActivity(intent);
            }
        });

        tv_singer = (TextView) view.findViewById(R.id.genre_singer);
        tv_singer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(),"Ambient", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), SingerViewPagerActivity.class);
                startActivity(intent);
            }
        });


        tv_ska = (TextView) view.findViewById(R.id.genre_ska);
        tv_ska.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(),"Ambient", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), SkaViewPagerActivity.class);
                startActivity(intent);
            }
        });


        tv_sound = (TextView) view.findViewById(R.id.genre_sound);
        tv_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(),"Ambient", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), SoundViewPagerActivity.class);
                startActivity(intent);
            }
        });

        tv_spag = (TextView) view.findViewById(R.id.genre_spagh_west);
        tv_spag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(),"Ambient", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), SpaghettiViewPagerActivity.class);
                startActivity(intent);
            }
        });


        tv_spoken = (TextView) view.findViewById(R.id.genre_spoken);
        tv_spoken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(),"Ambient", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), SpokenViewPagerActivity.class);
                startActivity(intent);
            }
        });


        tv_anim = (TextView) view.findViewById(R.id.genre_anim);
        tv_anim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(),"Ambient", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), AnimatorActivity.class);
                startActivity(intent);
            }
        });

        tv_handler = (TextView) view.findViewById(R.id.genre_hanldler);
        tv_handler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(),"Ambient", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), RunnableHandlerActivity.class);
                startActivity(intent);
            }
        });


        tv_gesture = (TextView) view.findViewById(R.id.genre_gesture);
        tv_gesture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(),"Ambient", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), GestureActivity.class);
                startActivity(intent);
            }
        });





        return view;
    }

}
