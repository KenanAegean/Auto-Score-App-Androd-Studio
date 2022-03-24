package com.example.quiz3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    TextView iy_1, sc_1, iy_2, sc_2, iy_3, sc_3, iy_4, sc_4, iy_5, sc_5, iy_6, sc_6, iy_7, sc_7, iy_9, sc_9, iy_10, sc_10, iy_11, sc_11, iy_12, sc_12;
    SearchView searchBar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchBar = (SearchView)findViewById(R.id.searchBar);

        enterSearchBar();
        scoreGetter();
        scoreSetter();

    }

    private void enterSearchBar()
    {

        searchBar.setOnQueryTextListener(new SearchView.OnQueryTextListener()
        {
            @Override
            public boolean onQueryTextSubmit(String query)
            {
                Toast.makeText(getApplicationContext(), "SEARCH BAR ISN'T WORKING YET.. MAYBE AT 2022.. HAPPY NEW YEAR :)", Toast.LENGTH_SHORT).show();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText)
            {
                return false;
            }
        });

    }

    private void scoreMaker(TextView iy, TextView score)
    {
        int iyH, iyD, scH, scD, bound;

        Random rand = new Random();

        bound = 1 + rand.nextInt(5);
        iyH = rand.nextInt(bound);
        bound = 1 + rand.nextInt(5);
        scH = iyH + rand.nextInt(bound);

        bound = 1 + rand.nextInt(5);
        iyD = rand.nextInt(bound);
        bound = 1 + rand.nextInt(5);
        scD = iyD + rand.nextInt(bound);

        iy.setText("İY: " + String.valueOf(iyH) + " - " + String.valueOf(iyD));
        score.setText(scH + " - " + scD);

    }

    private void scoreSetter()
    {
        scoreMaker(iy_1, sc_1);
        scoreMaker(iy_2, sc_2);
        scoreMaker(iy_3, sc_3);
        scoreMaker(iy_4, sc_4);
        scoreMaker(iy_5, sc_5);
        scoreMaker(iy_6, sc_6);
        scoreMaker(iy_7, sc_7);
        scoreMaker(iy_9, sc_9);
        scoreMaker(iy_10, sc_10);
        scoreMaker(iy_11, sc_11);
        scoreMaker(iy_12, sc_12);
    }

    private void scoreGetter()
    {
        iy_1 = (TextView)findViewById(R.id.firstHalf_1);
        sc_1 = (TextView)findViewById(R.id.score_1);
        iy_2 = (TextView)findViewById(R.id.firstHalf_2);
        sc_2 = (TextView)findViewById(R.id.score_2);
        iy_3 = (TextView)findViewById(R.id.firstHalf_3);
        sc_3 = (TextView)findViewById(R.id.score_3);
        iy_4 = (TextView)findViewById(R.id.firstHalf_4);
        sc_4 = (TextView)findViewById(R.id.score_4);
        iy_5 = (TextView)findViewById(R.id.firstHalf_5);
        sc_5 = (TextView)findViewById(R.id.score_5);
        iy_6 = (TextView)findViewById(R.id.firstHalf_6);
        sc_6 = (TextView)findViewById(R.id.score_6);
        iy_7 = (TextView)findViewById(R.id.firstHalf_7);
        sc_7 = (TextView)findViewById(R.id.score_7);
        iy_9 = (TextView)findViewById(R.id.firstHalf_9);
        sc_9 = (TextView)findViewById(R.id.score_9);
        iy_10 = (TextView)findViewById(R.id.firstHalf_10);
        sc_10 = (TextView)findViewById(R.id.score_10);
        iy_11 = (TextView)findViewById(R.id.firstHalf_11);
        sc_11 = (TextView)findViewById(R.id.score_11);
        iy_12 = (TextView)findViewById(R.id.firstHalf_12);
        sc_12 = (TextView)findViewById(R.id.score_12);
    }


}