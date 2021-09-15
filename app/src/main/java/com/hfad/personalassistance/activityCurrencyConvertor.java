package com.hfad.personalassistance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

// adjust the image position later
public class activityCurrencyConvertor extends AppCompatActivity {
    EditText editAmount;   // amount to be converted
    TextView textViewDollars;
    TextView TextViewEuros;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_convertor);
        editAmount = findViewById(R.id.editTextNumberAmount);
        textViewDollars = findViewById(R.id.textViewDollar);
        TextViewEuros = findViewById(R.id.textViewEuro);
    }
    public void convert(View v){
       // Toast.makeText(this,"converting",Toast.LENGTH_SHORT).show();
        float amountRs = 0;
        float dollar =0 , euro = 0;  // amount to be displayed
        amountRs = Float.valueOf(editAmount.getText().toString()); // value entered is stored
        Toast.makeText(this,Float.toString(amountRs),Toast.LENGTH_SHORT).show();
        dollar = (float) (amountRs/75.02);
        euro = (float)(amountRs/89.28);
        //textViewDollars.setText(Float.toString(dollar)+"$");
        textViewDollars.setText(String.format("%.2f $", dollar ));
        TextViewEuros.setText(String.format("%.2f €", euro ));

    }
}