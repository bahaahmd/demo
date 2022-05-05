package com.example.profitez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setThread().start();



    }

    private Thread setThread() {
        Thread thread = new Thread()
        {
            @Override
            public void run() {
                try {
                    sleep(1500);
                    Intent intent =new Intent(getApplicationContext(),HomeActivity.class);
                    startActivity(intent);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        return  thread;


    }


}