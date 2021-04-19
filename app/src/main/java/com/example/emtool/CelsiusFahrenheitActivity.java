package com.example.emtool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class CelsiusFahrenheitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celsius_fahrenheit);
        Button buttonConvFahrenheitToCelsius = (Button) findViewById(R.id.buttonConvFahrenheitToCelsius);
        buttonConvFahrenheitToCelsius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText TextBoxFahrenheit = (EditText) findViewById(R.id.editTextFahrenheit);
                EditText TextBoxCelsius = (EditText) findViewById(R.id.editTextCelsius);
                String strTextBoxFahrenheit = TextBoxFahrenheit.getText().toString();
                if (TextUtils.isEmpty(strTextBoxFahrenheit)){
                    TextBoxFahrenheit.setError("Please write the value for Fahrenheit");
                    return;
                }
                double vFahrenheit = Double.valueOf(strTextBoxFahrenheit);
                double vCelsius = (vFahrenheit - 32) * 0.5556;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                TextBoxCelsius.setText(formatVal.format(vCelsius));

            }
        });
        Button buttonConvCelsiusToFahrenheit = (Button) findViewById(R.id.buttonConvCelsiusToFahrenheit);
        buttonConvCelsiusToFahrenheit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText TextBoxFahrenheit = (EditText) findViewById(R.id.editTextFahrenheit);
                EditText TextBoxCelsius = (EditText) findViewById(R.id.editTextCelsius);
                String strTextBoxCelsius = TextBoxCelsius.getText().toString();
                if (TextUtils.isEmpty(strTextBoxCelsius)){
                    TextBoxCelsius.setError("Please write the value for Celsius");
                    return;
                }
                double vCelsius = Double.valueOf(strTextBoxCelsius);
                double vFahrenheit = (vCelsius * 1.8) + 32;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                TextBoxFahrenheit.setText(formatVal.format(vFahrenheit));

            }
        });
    }
}