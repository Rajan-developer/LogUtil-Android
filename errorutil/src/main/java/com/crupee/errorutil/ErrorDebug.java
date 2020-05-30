package com.crupee.errorutil;

import android.util.Log;

public class ErrorDebug {

    public static final String TAG = "ErrorDebug";

    public static void e(String message) {
        Log.e(TAG, message);
    }
}
