package com.crupee.logutil;

import android.util.Log;

public class LogDebug {
    public static final String TAG = "LogDebug";

    public static void d(String message) {
        Log.d(TAG, message);
    }

}
