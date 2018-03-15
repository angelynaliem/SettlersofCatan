package com.example.android.settlersofcatan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreWhite = 0;
    int scoreBlue = 0;

    TextView white_score;
    TextView blue_score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        white_score = findViewById(R.id.white_score);
        blue_score = findViewById(R.id.blue_score);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("someVarA", scoreWhite);
        outState.putInt("someVarB", scoreBlue);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scoreWhite = savedInstanceState.getInt("someVarA");
        scoreBlue = savedInstanceState.getInt("someVarB");
        displayForWhite(scoreWhite);
        displayForBlue(scoreBlue);
    }


    /**
     * Adds 1 settlement point for White.
     */

    public void addOneSettlementForWhite(View v) {
        scoreWhite = scoreWhite + 1;
        displayForWhite(scoreWhite);
    }

    /**
     * Adds 2 city points for White.
     */

    public void addTwoCityForWhite(View v) {
        scoreWhite = scoreWhite + 2;
        displayForWhite(scoreWhite);
    }

    /**
     * Adds 1 VP point for White.
     */

    public void addOneVPForWhite(View v) {
        scoreWhite = scoreWhite + 1;
        displayForWhite(scoreWhite);
    }

    /**
     * Adds 1 largest army or road point for White.
     */

    public void addOneArmyOrRoadForWhite(View v) {
        scoreWhite = scoreWhite + 1;
        displayForWhite(scoreWhite);
    }

    /**
     * Adds 1 settlement points for Blue.
     */

    public void addOneSettlementForBlue(View v) {
        scoreBlue = scoreBlue + 1;
        displayForBlue(scoreBlue);
    }

    /**
     * Adds 2 city points for Blue.
     */

    public void addTwoCityForBlue(View v) {
        scoreBlue = scoreBlue + 2;
        displayForBlue(scoreBlue);
    }

    /**
     * Adds 1 VP point for Blue.
     */

    public void addOneVPForBlue(View v) {
        scoreBlue = scoreBlue + 1;
        displayForBlue(scoreBlue);
    }

    /**
     * Adds 1 largest army or road point for Blue.
     */

    public void addOneArmyOrRoadForBlue(View v) {
        scoreBlue = scoreBlue + 1;
        displayForBlue(scoreBlue);
    }

    public void resetScore(View v) {
        scoreWhite = 0;
        scoreBlue = 0;
        displayForWhite(scoreWhite);
        displayForBlue(scoreBlue);
    }

    /**
     * Displays the given score for White.
     */
    public void displayForWhite(int score) {
        white_score.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Blue.
     */
    public void displayForBlue(int score) {
        blue_score.setText(String.valueOf(score));
    }

}
