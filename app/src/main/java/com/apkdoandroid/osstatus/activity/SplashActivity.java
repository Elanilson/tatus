package com.apkdoandroid.osstatus.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.apkdoandroid.osstatus.R;
import com.tt.whorlviewlibrary.WhorlView;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        WhorlView whorlView = (WhorlView) this.findViewById(R.id.whorl2);
        whorlView.start();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                abrirAutenticacao();
            }
        },5000);
    }
    private void abrirAutenticacao(){
        finish();
        Intent i = new Intent(SplashActivity.this,MainActivity.class);
        startActivity(i);
    }
}