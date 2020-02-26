package com.example.rockpaperscissors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class scoreActivity extends Playzone {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        TextView name = (TextView) findViewById(R.id.winer);
        name.setText(getIntent().getStringExtra("winner"));
    }
    public void nw(View view)
    {
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }
    public void exit(View view)
    {
        System.exit(0);
    }

}
