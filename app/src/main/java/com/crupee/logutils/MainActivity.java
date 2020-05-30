package com.crupee.logutils;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.crupee.logutil.LogDebug;
import com.crupee.logutils.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LogDebug.d("App Starting using test sdk");
    }
}
