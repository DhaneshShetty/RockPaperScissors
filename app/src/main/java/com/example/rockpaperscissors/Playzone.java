package com.example.rockpaperscissors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Playzone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playzone);
        TextView name = (TextView) findViewById(R.id.player);
        name.setText(getIntent().getStringExtra("play1"));
        TextView name1 = (TextView) findViewById(R.id.p1);
        name1.setText(getIntent().getStringExtra("play1"));
        TextView name2 = (TextView) findViewById(R.id.p2);
        name2.setText(getIntent().getStringExtra("play2"));
    }

    int score1 = 0;
    int score2 = 0;
    int player = 1;
    int one_choice, two_choice;

    public void rock(View view) {

        if (player == 1)
            one_choice = 0;
        else
            two_choice = 0;
    }

    public void paper(View view) {
        if (player == 1)
            one_choice = 1;
        else
            two_choice = 1;
    }

    public void scissors(View view) {
        if (player == 1)
            one_choice = 2;
        else
            two_choice = 2;
    }

    public void scoredisp() {
        TextView s1 = findViewById(R.id.sc1);
        s1.setText("" + score1);
        TextView s2 = findViewById(R.id.sc2);
        s2.setText("" + score2);

    }

    public void next1(View view) {

        if (player == 1) {
            TextView name = (TextView) findViewById(R.id.player);
            name.setText(getIntent().getStringExtra("play2"));
            player = 2;
        }
        else if (player == 2) {
            if (one_choice == 0 && two_choice == 1)
                score2 = score2 + 1;
            if (one_choice == 1 && two_choice == 0)
                score1 = score1 + 1;
            if (one_choice == 2 && two_choice == 0)
                score2 = score2 + 1;
            if (one_choice == 0 && two_choice == 2)
                score1 = score1 + 1;
            if (one_choice == 1 && two_choice == 2)
                score2 = score2 + 1;
            if (one_choice == 2 && two_choice == 1)
                score1 = score1 + 1;
            scoredisp();
            if(score1>=5)
            {
                Intent i=new Intent(Playzone.this,scoreActivity.class);
                i.putExtra("winner",(getIntent().getStringExtra("play1")));
                startActivity(i);
            }
            else if(score2>=5)
            {
                Intent i=new Intent(Playzone.this,scoreActivity.class);
                i.putExtra("winner",(getIntent().getStringExtra("play2")));
                startActivity(i);
            }
            else {
                TextView name1 = (TextView) findViewById(R.id.player);
                name1.setText(getIntent().getStringExtra("play1"));
                player = 1;
            }


        }
    }


}
