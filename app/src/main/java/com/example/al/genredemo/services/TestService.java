package com.example.al.genredemo.services;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;

import com.example.al.genredemo.util.UtilLog;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Al on 7/3/2017.
 */

public class TestService extends Service {


    public static final int LOADING = 111111;
    public static final int PLAYING = 222222;
    public static final int PAUSED = 333333;

    public static int PLAY = 555555;
    public static int PAUSE = 666666;

    private MediaPlayer mediaPlayer;


    private Timer timer;
    private int update = 0;
    public static final String ACTION = "action";
    public static final String UPDATE = "TestAction";
    public static final String AUDIO = "Audio";
    private String url = " ";


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        if(intent.getIntExtra("CMD",0) == PLAY) {
            String urlMsg = intent.getStringExtra("URL");
            if (url.equals(urlMsg)) {
                mediaPlayer.start();
                sendPlaying();
            }else{
                try {
                    mediaPlayer.setDataSource(url);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            try {
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (intent.getAction().equals("AUDIO")) {
                String url = intent.getStringExtra("URL");
                try {
                    mediaPlayer.reset();
                    mediaPlayer.setDataSource(url);
                    mediaPlayer.prepareAsync();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            } else {
                String value = intent.getStringExtra("Service");
//        timer.schedule(new UpdateTask(),0,1000);
                if (value.equals("Start")) {
                    timer.schedule(new UpdateTask(), 0, 2000);
                } else if (value.equals("Stop")) {
                    timer.cancel();
                }
            }
        }
        return super.onStartCommand(intent, flags, startId);
    }


    private void sendPlaying(){
        Intent intent = new Intent();
        intent.setAction(AUDIO);
        intent.putExtra("MSG", PLAYING);
        sendBroadcast(intent);
    }

    private void sendPaused(){
        Intent intent = new Intent();
        intent.setAction(AUDIO);
        intent.putExtra("MSG", PAUSED);
        sendBroadcast(intent);
    }

    private void sendLoading(){
        Intent intent = new Intent();
        intent.setAction(AUDIO);
        intent.putExtra("MSG", LOADING);
        sendBroadcast(intent);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    private class UpdateTask extends TimerTask {
        public void run(){
            Intent intent = new Intent();
            intent.setAction(ACTION);
            intent.putExtra(UPDATE, ++update);
            sendBroadcast(intent);
            UtilLog.d("Service", update+"");
        }
    }

}
