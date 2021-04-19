package com.example.emtool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void launchSecondActivity(View view) { // Porneste Activity pentru equivalent_resistor_calculator
        Log.d(LOG_TAG, "Button1 clicked!");
        Intent intent_second = new Intent(this, SecondActivity.class);
        startActivity(intent_second);
    }

    public void launchThirdActivity(View view) { // Porneste Activity pentru conversions
        Log.d(LOG_TAG, "Button2 clicked!");
        Intent intent_third = new Intent(this, ThirdActivity.class);
        startActivity(intent_third);
    }

    public void launchFourthActivity(View view) { // Porneste Activity pentru impedance_calculator
        Log.d(LOG_TAG, "Button3 clicked!");
        Intent intent_fourth = new Intent(this, FourthActivity.class);
        startActivity(intent_fourth);
    }

    public void launchFifthActivity(View view) { // Porneste Activity pentru volume_calculator
        Log.d(LOG_TAG, "Button4 clicked!");
        Intent intent_fifth = new Intent(this, FifthActivity.class);
        startActivity(intent_fifth);
    }
}