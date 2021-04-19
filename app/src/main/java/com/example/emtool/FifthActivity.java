package com.example.emtool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class FifthActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
    }

    public void launchCubeVolumeActivity(View view) {
        Log.d(LOG_TAG, "Button Cube_Volume clicked!");
        Intent intent_cube = new Intent(this, CubeVolumeActivity.class);
        startActivity(intent_cube);
    }

    public void launchCuboidVolumeActivity(View view) {
        Log.d(LOG_TAG, "Button Cuboid_Volume clicked!");
        Intent intent_cuboid = new Intent(this, CuboidVolumeActivity.class);
        startActivity(intent_cuboid);
    }

    public void launchPyramidVolumeActivity(View view) {
        Log.d(LOG_TAG, "Button Pyramid_Volume clicked!");
        Intent intent_pyramid = new Intent(this, PyramidVolumeActivity.class);
        startActivity(intent_pyramid);
    }

    public void launchPrismVolumeActivity(View view) {
        Log.d(LOG_TAG, "Button Prism_Volume clicked!");
        Intent intent_prism = new Intent(this, PrismVolumeActivity.class);
        startActivity(intent_prism);
    }
}