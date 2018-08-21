package com.example.jokecreator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJoke extends AppCompatActivity {

    String JOKE_KEY = "JOKE_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        TextView jokeText = findViewById(R.id.displayjoketext);
        Intent intent = DisplayJoke.this.getIntent();
        String jokeResult = intent.getStringExtra(JOKE_KEY);

        if(jokeResult!= null) {
            jokeText.setText(jokeResult);
        }else {
            jokeText.setText(R.string.no_joke);
        }

    }
}
