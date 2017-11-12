package com.example.admin.assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

public class TestBed2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_bed2);
        Log.i("TestBed2 tag", "now running onCreate");
    }
    public void onClickButtonGet(View view){
        TimePicker timePicker = (TimePicker) findViewById(R.id.timePicker);
        TextView time = (TextView) findViewById(R.id.timeprint);
        time.setText(timePicker.getHour() + ":" + timePicker.getMinute());
        Log.i("TestBed2 tag", "time receieved");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("TestBed2 tag", "now running onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("TestBed2 tag", "now running onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("TestBed2 tag", "now running onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("TestBed2 tag", "now running onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("TestBed2 tag", "now running onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("TestBed2 tag", "now running onDestroy");
    }
}
