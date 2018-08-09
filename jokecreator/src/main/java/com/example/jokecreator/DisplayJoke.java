package com.example.jokecreator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJoke extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        TextView jokeText = findViewById(R.id.displayjoketext);
        Intent intent = DisplayJoke.this.getIntent();
        String jokeResult = intent.getStringExtra("joke_key");

        if(jokeResult!= null) {
            jokeText.setText(jokeResult);
        }else {
            jokeText.setText("Couldn't find the joke");
        }

    }
}
