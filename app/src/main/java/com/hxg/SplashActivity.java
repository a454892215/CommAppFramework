package com.hxg;

import android.content.Intent;
import android.os.Bundle;

import com.hxg.base.MyBaseActivity;

public class SplashActivity extends MyBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().postDelayed(() -> {
            startActivity(new Intent(this, MainActivity.class));
            finish();
        }, 5000);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_splash;
    }
}
