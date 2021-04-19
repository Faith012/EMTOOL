package com.example.emtool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class InchesCmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inches_cm);
        Button buttonConvInchesToCm = (Button) findViewById(R.id.buttonConvInchesToCm);
        buttonConvInchesToCm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText TextBoxInches = (EditText) findViewById(R.id.editTextInches);
                EditText TextBoxCm = (EditText) findViewById(R.id.editTextCm);
                String strTextBoxInches = TextBoxInches.getText().toString();
                if (TextUtils.isEmpty(strTextBoxInches)){
                    TextBoxInches.setError("Please write the value for Inches");
                    return;
                }
                double vInches = Double.valueOf(strTextBoxInches);
                double vCm = vInches / 0.3937;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                TextBoxCm.setText(formatVal.format(vCm));

            }
        });
        Button buttonConvCmToInches = (Button) findViewById(R.id.buttonConvCmToInches);
        buttonConvCmToInches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText TextBoxInches = (EditText) findViewById(R.id.editTextInches);
                EditText TextBoxCm = (EditText) findViewById(R.id.editTextCm);
                String strTextBoxCm = TextBoxCm.getText().toString();
                if (TextUtils.isEmpty(strTextBoxCm)){
                    TextBoxCm.setError("Please write the value for Centimeters");
                    return;
                }
                double vCm = Double.valueOf(strTextBoxCm);
                double vInches = vCm * 0.3937;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                TextBoxInches.setText(formatVal.format(vInches));

            }
        });
    }
}