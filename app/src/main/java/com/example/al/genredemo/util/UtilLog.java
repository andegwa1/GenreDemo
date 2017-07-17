package com.example.al.genredemo.util;

import android.util.Log;

/**
 * Created by Al on 6/19/2017.
 */

public class UtilLog {

    private static boolean isLog = false;

    public static void setIsLog(boolean b) {
        isLog = b;
    }

    public static void d(String tag, String msg) {
        if (isLog) {
            Log.d(tag, msg);
        }
    }

    public static void v(String tag, String msg) {
        if (isLog) {
            Log.v(tag, msg);
        }
    }
}
