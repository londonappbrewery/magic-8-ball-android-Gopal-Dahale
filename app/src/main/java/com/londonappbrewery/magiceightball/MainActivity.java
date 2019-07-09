package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ask;
        ask = findViewById(R.id.ask);
        final int[] ballarray = { R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,};

        final ImageView ball = findViewById(R.id.ball);

        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("magic_ball","asked");

                Random randomnumbergenerator = new Random();
                int num = randomnumbergenerator.nextInt(5);
                Log.d("magic_ball","thr random number is : "+ num);
                ball.setImageResource(ballarray[num]);
            }
        });
    }
}
