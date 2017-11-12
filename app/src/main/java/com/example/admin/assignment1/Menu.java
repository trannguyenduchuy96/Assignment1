package com.example.admin.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Log.i("Menu tag", "now running onCreate");
    }
    public void onClickDieRoll (View view) {
        Intent intent = new Intent(this, Die_Roll.class);
        startActivity(intent);
    }
    public void onClickLog (View view) {
        Intent intent = new Intent(this, LogWriter.class);
        startActivity(intent);
    }
    public void onClickCalculator (View view) {
        Intent intent = new Intent(this, Calculator.class);
        startActivity(intent);
    }
    public void onClickTestBed (View view) {
        Intent intent = new Intent(this, TestBed.class);
        startActivity(intent);
    }
    public void onClickTestBed2 (View view) {
        Intent intent = new Intent(this, TestBed2.class);
        startActivity(intent);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Menu tag", "now running onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Menu tag", "now running onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Menu tag", "now running onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Menu tag", "now running onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Menu tag", "now running onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Menu tag", "now running onDestroy");
    }
}
