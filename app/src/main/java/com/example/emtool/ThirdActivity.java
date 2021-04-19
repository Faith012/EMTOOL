package com.example.emtool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ThirdActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    public void launchRadianDegreeActivity(View view) {
        Log.d(LOG_TAG, "Button Radian_Degree clicked!");
        Intent intent_RD = new Intent(this, RadianDegreeActivity.class);
        startActivity(intent_RD);
    }

    public void launchMilesKmActivity(View view) {
        Log.d(LOG_TAG, "Button Miles_Km clicked!");
        Intent intent_MK = new Intent(this, MilesKmActivity.class);
        startActivity(intent_MK);
    }

    public void launchCelsiusFahrenheitActivity(View view) {
        Log.d(LOG_TAG, "Button Celsius_Fahrenheit clicked!");
        Intent intent_CF = new Intent(this, CelsiusFahrenheitActivity.class);
        startActivity(intent_CF);
    }

    public void launchInchesCmActivity(View view) {
        Log.d(LOG_TAG, "Button Inches_Cm clicked!");
        Intent intent_IC = new Intent(this, InchesCmActivity.class);
        startActivity(intent_IC);
    }
}