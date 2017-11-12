package com.example.admin.assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Chronometer;

public class TestBed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_bed);
        Log.i("TestBed tag", "now running onCreate");
         // initiate a chronometer
        Chronometer simpleChronometer = (Chronometer) findViewById(R.id.chronometer2);
        simpleChronometer.setFormat("Time Running - %s"); // set format
    }
    public void onClickButtonStart(View view){
        Chronometer simpleChronometer = (Chronometer) findViewById(R.id.chronometer2);
        simpleChronometer.start(); // start the chronometer
        Log.i("TestBed tag", "counter started");
    }
    public void onClickButtonStop(View view){
        Chronometer simpleChronometer = (Chronometer) findViewById(R.id.chronometer2);
        simpleChronometer.stop(); // stop the chronometer
        Log.i("TestBed tag", "counter stopped");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("TestBed tag", "now running onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("TestBed tag", "now running onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("TestBed tag", "now running onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("TestBed tag", "now running onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("TestBed tag", "now running onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("TestBed tag", "now running onDestroy");
    }
}
