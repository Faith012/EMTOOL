package com.example.emtool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class RadianDegreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radian_degree);
        Button buttonConvRadiansToDegrees = (Button) findViewById(R.id.buttonConvRadiansToDegrees);
        buttonConvRadiansToDegrees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText TextBoxRadians = (EditText) findViewById(R.id.editTextRadians);
                EditText TextBoxDegrees = (EditText) findViewById(R.id.editTextDegrees);
                String strTextBoxRadians = TextBoxRadians.getText().toString();
                if (TextUtils.isEmpty(strTextBoxRadians)){
                    TextBoxRadians.setError("Please write the value for Radians");
                    return;
                }
                double vRadians = Double.valueOf(strTextBoxRadians);
                double vDegrees = vRadians * 57.295779513;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                TextBoxDegrees.setText(formatVal.format(vDegrees));

            }
        });
        Button buttonConvDegreesToRadians = (Button) findViewById(R.id.buttonConvDegreesToRadians);
        buttonConvDegreesToRadians.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText TextBoxRadians = (EditText) findViewById(R.id.editTextRadians);
                EditText TextBoxDegrees = (EditText) findViewById(R.id.editTextDegrees);
                String strTextBoxDegrees = TextBoxDegrees.getText().toString();
                if (TextUtils.isEmpty(strTextBoxDegrees)){
                    TextBoxDegrees.setError("Please write the value for Degrees");
                    return;
                }
                double vDegrees = Double.valueOf(strTextBoxDegrees);
                double vRadians = vDegrees * 0.01745329252;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                TextBoxRadians.setText(formatVal.format(vRadians));

            }
        });
    }
}