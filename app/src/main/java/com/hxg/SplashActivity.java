package com.hxg;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.hxg.base.MyBaseActivity;

public class SplashActivity extends MyBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_splash;
    }
}
