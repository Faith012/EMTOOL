package com.example.emtool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MilesKmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miles_km);
        Button buttonConvMilesToKm = (Button) findViewById(R.id.buttonConvMilesToKm);
        buttonConvMilesToKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText TextBoxMiles = (EditText) findViewById(R.id.editTextMiles);
                EditText TextBoxKm = (EditText) findViewById(R.id.editTextKm);
                String strTextBoxMiles = TextBoxMiles.getText().toString();
                if (TextUtils.isEmpty(strTextBoxMiles)){
                    TextBoxMiles.setError("Please write the value for Miles");
                    return;
                }
                double vMiles = Double.valueOf(strTextBoxMiles);
                double vKm = vMiles / 0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                TextBoxKm.setText(formatVal.format(vKm));

            }
        });
        Button buttonConvKmToMiles = (Button) findViewById(R.id.buttonConvKmToMiles);
        buttonConvKmToMiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText TextBoxMiles = (EditText) findViewById(R.id.editTextMiles);
                EditText TextBoxKm = (EditText) findViewById(R.id.editTextKm);
                String strTextBoxKm = TextBoxKm.getText().toString();
                if (TextUtils.isEmpty(strTextBoxKm)){
                    TextBoxKm.setError("Please write the value for Kilometers");
                    return;
                }
                double vKm = Double.valueOf(strTextBoxKm);
                double vMiles = vKm * 0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                TextBoxMiles.setText(formatVal.format(vMiles));

            }
        });
    }
}