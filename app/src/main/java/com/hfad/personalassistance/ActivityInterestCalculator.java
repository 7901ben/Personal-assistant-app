package com.hfad.personalassistance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityInterestCalculator extends AppCompatActivity {
    EditText editTextPrinclpal , editTextRate,editTextTime,editTextAmount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interest_calculator);
        editTextPrinclpal = findViewById(R.id.editTextNumberDecimalPrincipal);
        editTextRate = findViewById(R.id.editTextNumberDecimalRate);
        editTextTime = findViewById(R.id.editTextNumberDecimalTime);
        editTextAmount = findViewById(R.id.editTextNumberDecimalAmount);
    }
    public void calculate(View v){
        //Toast.makeText(this,"calculating",Toast.LENGTH_SHORT).show();
        //calculation for amount
       // editTextPrinclpal.setText("1281");
        //editTextRate.setText("1281");
        //editTextTime.setText("1281");
        float principl = Float.valueOf(editTextPrinclpal.getText().toString());
        float rate = Float.valueOf(editTextRate.getText().toString());
        float time = Float.valueOf(editTextTime.getText().toString());
        //Toast.makeText(this,Float.toString(principl)+" "+Float.toString(rate)+" "+Float.toString(time),Toast.LENGTH_SHORT).show();
        float amount = principl * (1 + ((rate/100) * time));
        editTextAmount.setText(String.format("%.2f ", amount ));
    }
}