package com.example.al.genredemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.al.genredemo.dialog.ExitDialog;

public class MainActivity extends AppCompatActivity {

    //private TextView tv_genre;


    @Override
    public void onBackPressed() {
        ExitDialog exitDialog = new ExitDialog(MainActivity.this, new ExitDialog.IExitDialogListener() {
            @Override
            public void onOKClicked(String msg) {
                Toast.makeText(MainActivity.this,msg, Toast.LENGTH_SHORT).show();
            }
        });
        exitDialog.setCanceledOnTouchOutside(true);
        exitDialog.show();
    }

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
