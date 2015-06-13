package com.pratamawijaya.infocuacadangempaterkini.helper;

import android.util.Log;

import com.pratamawijaya.infocuacadangempaterkini.BuildConfig;


/**
 * Created by pratama on 6/13/15.
 */
public class LogUtils {
    public static void TRACE(String tag, String args) {
        if (BuildConfig.DEBUG) {
            Log.d(tag, args);
        }
    }
}
