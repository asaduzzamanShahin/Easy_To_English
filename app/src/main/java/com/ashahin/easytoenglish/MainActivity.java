package com.ashahin.easytoenglish;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView day1Card,day2Card,day3Card,day4Card,day5Card,day6Card,day7Card,day8Card,day9Card,day10Card, day11Card, day12Card;
    private AdView mAdView;
    //private Button button;

    // @SuppressLint("MissingInflatedId")
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        //deling adview

        //ads initialization here

       /* mAdView=findViewById(R.id.adView);
//-------------------------------------
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);*/

        //defining cardview here

        day1Card=(CardView) findViewById(R.id.card1Id);
        day2Card=(CardView)findViewById(R.id.card2Id);
        day3Card=(CardView)findViewById(R.id.card3Id);
        day4Card=(CardView)findViewById(R.id.card4Id);
        day5Card=(CardView)findViewById(R.id.card5Id);
        day6Card=(CardView)findViewById(R.id.card6Id);
        day7Card=(CardView)findViewById(R.id.card7Id);
        day8Card=(CardView)findViewById(R.id.card8Id);
        day9Card=(CardView)findViewById(R.id.card9Id);
        day10Card=(CardView)findViewById(R.id.card10Id);
        day11Card=(CardView)findViewById(R.id.card11Id);
        day12Card=(CardView)findViewById(R.id.card12Id);

        //end of defing cardview

//add onclick listener
        day1Card.setOnClickListener(this);
        day2Card.setOnClickListener(this);
        day3Card.setOnClickListener(this);
        day4Card.setOnClickListener(this);
        day5Card.setOnClickListener(this);
        day6Card.setOnClickListener(this);
        day7Card.setOnClickListener(this);
        day8Card.setOnClickListener(this);
        day9Card.setOnClickListener(this);
        day10Card.setOnClickListener(this);
        day11Card.setOnClickListener(this);
        day12Card.setOnClickListener(this);

        //end of onclick

    }
    /////backpressed method

    @Override
    public void onBackPressed()
    {
        finish();
        super.onBackPressed();

    }


    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){

            case R.id.card1Id:i=new Intent(this,Day1.class); startActivity(i); break;
            case R.id.card2Id:i=new Intent(this,Day2.class); startActivity(i); break;
            case R.id.card3Id:i=new Intent(this,Day3.class); startActivity(i); break;
            case R.id.card4Id:i=new Intent(this,Day4.class); startActivity(i); break;
            case R.id.card5Id:i=new Intent(this,Day5.class); startActivity(i); break;
            case R.id.card6Id:i=new Intent(this,Day6.class); startActivity(i); break;
            case R.id.card7Id:i=new Intent(this,Day7.class); startActivity(i); break;
            case R.id.card8Id:i=new Intent(this,Day8.class); startActivity(i); break;
            case R.id.card9Id:i=new Intent(this,Day9.class); startActivity(i); break;
            case R.id.card10Id:i=new Intent(this,Day10.class); startActivity(i); break;
            case R.id.card11Id:i=new Intent(this,Day11.class); startActivity(i); break;
            case R.id.card12Id:i=new Intent(this,Day12.class); startActivity(i); break;

        }
    }
}