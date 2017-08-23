package com.example.jorky.ownapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DartsActivity extends AppCompatActivity {

    // Tracks the score for Player A
    int scorePlayerA = 301;

    // Tracks the score for Player B
    int scorePlayerB = 301;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_darts);
    }

    /**
     * Increase the score for Player A by 1 point.
     */
    public void addPointForPlayerA(View v) {
        EditText shotAScoreField = (EditText) findViewById(R.id.hit_field_a);
        Editable shotAScoreEditable = shotAScoreField.getText();
        String shotAScore = shotAScoreEditable.toString();
        int numberShotAscore = Integer.parseInt(shotAScore);
        shotAScoreField.setText("");
        scorePlayerA = scorePlayerA - numberShotAscore;
        displayForPlayerA(scorePlayerA);
    }

    /**
     * Increase the score for Player B by 1 point.
     */
    public void addPointForPlayerB(View v) {
        EditText shotBScoreField = (EditText) findViewById(R.id.hit_field_b);
        Editable shotBScoreEditable = shotBScoreField.getText();
        String shotBScore = shotBScoreEditable.toString();
        int numberShotBscore = Integer.parseInt(shotBScore);
        shotBScoreField.setText("");
        scorePlayerB = scorePlayerB - numberShotBscore;
        displayForPlayerB(scorePlayerB);
    }

    /**
     * Resets the score for both Players back to 0.
     */
    public void resetScore(View v) {
        scorePlayerA = 301;
        scorePlayerB = 301;
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
