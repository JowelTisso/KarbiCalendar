package com.jangphong.hem.karbicalender2;

import android.content.Intent;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    private Handler handler;
    private Runnable runnable;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        runnable = new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent(getApplicationContext(),MainActivity.class));

            }
        };
        handler = new Handler();
        handler.postDelayed(runnable,500);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(handler!=null && runnable!=null)
        {
            handler.removeCallbacks(runnable);

        }
    }
}
