package com.example.rockpaperscissors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    String player1="Hello";
    String player2="Hello";
    int max1=5;






    public void setNameAndMax(View view)
    {
        EditText set=findViewById(R.id.play1);
        player1=set.getText().toString();
        EditText set1=findViewById(R.id.play2);
        player2=set1.getText().toString();

        Intent i1=new Intent(MainActivity.this,Playzone.class);
        i1.putExtra("play1",player1);
        i1.putExtra("play2",player2);
        startActivity(i1);
    }
}

