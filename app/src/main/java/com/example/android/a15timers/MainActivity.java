package com.example.android.a15timers;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(10000, 1000){

            @Override
            public void onTick(long l) {
                Log.i("Seconds left", String.valueOf(l/1000));
            }

            @Override
            public void onFinish() {
                Log.i("Done","Countdown done");

            }
        }.start();

        /*final Handler handler = new Handler();
        final Runnable run = new Runnable() {
            @Override
            public void run() {
                //code here keeps running. the handler delays the runs by the time mentioned
                handler.postDelayed(this, 1000);
                Log.i("Runner has run", "Again");

            }
        };
                handler.post(run);*/
    }
}
