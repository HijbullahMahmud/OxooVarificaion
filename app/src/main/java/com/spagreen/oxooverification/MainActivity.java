package com.spagreen.oxooverification;

import android.os.Bundle;

import com.spagreen.codevarify.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public String customView() {
        return "";
    }

    @Override
    public String packageName() {
        return BuildConfig.APPLICATION_ID;
    }
}