package com.example.android.soccerscore;

import android.view.View;
import android.widget.TextView;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.android.soccerscore.R;

import static android.R.id.message;


public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;
    int foulA = 0;
    int foulB = 0;
    int foulsA = 0;
    int foulsB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void oneScoreA(View v) {
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);
    }

    /**
     * Increases number of Red Cards for Team A.
     */
    public void redCardA(View v) {
        foulA = foulA + 1;
        displayRedForTeamA(foulA);
    }

    /**
     * Increases number of Yellow Cards for Team A.
     */
    public void yellowCardA(View v) {
        foulsA = foulsA + 1;
        displayYellowForTeamA(foulsA);
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void oneScoreB(View v) {
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }

    /**
     * This shows increase by 1 for Team B Red Cards.
     */
    public void redCardB(View v) {
        foulB = foulB + 1;
        displayRedForTeamB(foulB);
    }

    /**
     * This shows increase bby 1 for Team B yellow Cards.
     */
    public void yellowCardB(View v) {
        foulsB = foulsB + 1;
        displayYellowForTeamB(foulsB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scorea_text_view);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given number of Red Cards for Team A.
     */
    private void displayRedForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.redcard_text_view);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given number of Yellow Cards for Team A.
     */
    private void displayYellowForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellowcard_text_view);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreb_text_view);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Red Cards for Team, increase by 1.
     */
    private void displayRedForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.redcardb_text_view);
        scoreView.setText(String.valueOf(score));
    }

    private void displayYellowForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellowcardb_text_view);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * This resets the buttons to 0.
     */
    public void resetScore(View view) {
        scoreA = 0;
        scoreB = 0;
        foulA = 0;
        foulB = 0;
        foulsA = 0;
        foulsB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
        displayRedForTeamA(foulA);
        displayYellowForTeamA(foulB);
        displayRedForTeamB(foulsA);
        displayYellowForTeamB(foulsB);
    }
}