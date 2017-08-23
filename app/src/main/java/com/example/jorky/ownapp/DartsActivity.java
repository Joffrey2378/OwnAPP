package com.example.jorky.ownapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DartsActivity extends AppCompatActivity {

    // Tracks the score for Player A
    int scorePlayerA = 0;

    // Tracks the score for Player B
    int scorePlayerB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_darts);
    }

    /**
     * Increase the score for Player A by 1 point.
     */
    public void addPointForPlayerA(View v) {
        scorePlayerA = scorePlayerA + 1;
        displayForPlayerA(scorePlayerA);
    }

    /**
     * Increase the score for Player B by 1 point.
     */
    public void addPointForPlayerB(View v) {
        scorePlayerB = scorePlayerB + 1;
        displayForPlayerB(scorePlayerB);
    }

    /**
     * Resets the score for both Players back to 0.
     */
    public void resetScore(View v) {
        scorePlayerA = 0;
        scorePlayerB = 0;
        displayForPlayerA(scorePlayerA);
        displayForPlayerB(scorePlayerB);
    }

    /**
     * Displays the given score for Player A.
     */
    public void displayForPlayerA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Player B.
     */
    public void displayForPlayerB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
