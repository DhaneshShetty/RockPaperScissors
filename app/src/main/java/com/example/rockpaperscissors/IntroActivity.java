package com.example.rockpaperscissors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        new Timer().schedule(new TimerTask() {
            public void run() {
                Intent i=new Intent(IntroActivity.this,InstructionActivity.class);
                startActivity(i);
                finish();
            }
        }, 5000);
    }
}
