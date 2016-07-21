package com.example.android.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the user touches the Popular Movies button
     */
    public void openPopularMovies(View view) {
        // Display a Toast in response to button click
        Toast.makeText(MainActivity.this, R.string.popular_movies_toast,Toast.LENGTH_SHORT).show();
    }

    /**
     * Called when the user touches the Stock Hawk button
     */
    public void openStockHawk(View view) {
        // Display a Toast in response to button click
        Toast.makeText(MainActivity.this, R.string.stock_hawk_toast,Toast.LENGTH_SHORT).show();
    }

    /**
     * Called when the user touches the BuildItBigger button
     */
    public void openBuildItBigger(View view) {
        // Display a Toast in response to button click
        Toast.makeText(MainActivity.this, R.string.build_it_bigger_toast,Toast.LENGTH_SHORT).show();
    }

    /**
     * Called when the user touches the Make Your App Material button
     */
    public void openMakeYourAppMaterial(View view) {
        // Display a Toast in response to button click
        Toast.makeText(MainActivity.this, R.string.make_your_app_material_toast,Toast.LENGTH_SHORT).show();
    }

    /**
     * Called when the user touches the Go Ubiquitous button
     */
    public void openGoUbiquitous(View view) {
        // Display a Toast in response to button click
        Toast.makeText(MainActivity.this, R.string.go_ubiquitous_toast,Toast.LENGTH_SHORT).show();
    }

    /**
     * Called when the user touches the Capstone button
     */
    public void openCapstone(View view) {
        // Display a Toast in response to button click
        Toast.makeText(MainActivity.this, R.string.capstone_toast,Toast.LENGTH_SHORT).show();
    }
}
