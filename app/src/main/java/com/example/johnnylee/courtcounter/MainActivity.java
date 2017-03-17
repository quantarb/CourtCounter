package com.example.johnnylee.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addPointsForTeamA(View v)
    {
        scoreTeamA += Integer.parseInt(v.getTag().toString());
        displayForTeamA(scoreTeamA);
    }

    public void addPointsForTeamB(View v)
    {
        scoreTeamB += Integer.parseInt(v.getTag().toString());
        displayForTeamB(scoreTeamB);
    }



    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }



    public void resetScore(View v){
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);

        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
    }
}
