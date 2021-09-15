package com.hfad.personalassistance;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void currencyConvertor(View v)
    {
        Toast.makeText(this, "Clicked on currency convertor", Toast.LENGTH_LONG).show();
        Intent myIntent = new Intent(this, activityCurrencyConvertor.class);
        startActivity(myIntent);
    }
    public void interestConvertor(View v){
        Toast.makeText(this,"clicked on interest convertor",Toast.LENGTH_SHORT).show();
        Intent myIntent = new Intent(this, ActivityInterestCalculator.class);
        startActivity(myIntent);
    }
    public void search(View v){
        Toast.makeText(this,"Fetching results",Toast.LENGTH_SHORT).show();
        Intent myIntent = new Intent(this, MainActivityWeather.class);
       // startActivity(myIntent);


    }
}