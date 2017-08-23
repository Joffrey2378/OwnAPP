package com.example.jorky.ownapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the basketball category
        TextView basketball = (TextView) findViewById(R.id.basketball);

        // Set a click listener on that View
        basketball.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent basketballIntent = new Intent(MainActivity.this, BasketballActivity.class);
                startActivity(basketballIntent);
            }
        });

        // Find the View that shows the family category
        TextView football = (TextView) findViewById(R.id.football);

        // Set a click listener on that View
        football.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent footballIntent = new Intent(MainActivity.this, FootballActivity.class);
                startActivity(footballIntent);
            }
        });

        // Find the View that shows the pingpong category
        TextView pingpong = (TextView) findViewById(R.id.pingpong);

        // Set a click listener on that View
        pingpong.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent pingpongIntent = new Intent(MainActivity.this, PingpongActivity.class);
                startActivity(pingpongIntent);
            }
        });

        // Find the View that shows the pingpong category
        TextView darts = (TextView) findViewById(R.id.darts);

        // Set a click listener on that View
        darts.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent dartsIntent = new Intent(MainActivity.this, DartsActivity.class);
                startActivity(dartsIntent);
            }
        });
    }
}
