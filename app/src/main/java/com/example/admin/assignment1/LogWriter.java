package com.example.admin.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.Arrays;

public class LogWriter extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);
        Log.i("LogWriter tag", "now running onCreate");
        // receive intent from Die_Roll
        Intent intent = getIntent();
        String [] stringArray = intent.getStringArrayExtra("string-array");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("LogWriter tag", "now running onStart");
        TextView logtextview = (TextView) findViewById(R.id.textView3);
        Intent intent = getIntent();
        // receive boolean from SaveLog? spinner from Die_Roll
        boolean logsavechecked = intent.getBooleanExtra("Checked", false);
        // receive string array from Die_Roll
        String[] stringArray = intent.getStringArrayExtra("string-array");
        Log.i("LogWriter tag", "intent received");
        int ArraySize = stringArray.length;
        // creating empty string for printing in TextView
        String str = "";
        if(logsavechecked){ // if SaveLog? has been ticked in Die_Roll
            for (int i = 0; i < ArraySize; i++) { // printing string
                if(stringArray[i] != null) { // stops printing upon reaching null element
                    str += stringArray[i];
                    if (i > 0 && (i + 1) % 4 == 0) {
                        str += "\n"; // new line for each 4 elements
                    }
                }
            }
            logtextview.setText(str);
        }
        else{
            logtextview.setText("Nothing here");
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("LogWriter tag", "now running onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("LogWriter tag", "now running onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("LogWriter tag", "now running onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("LogWriter tag", "now running onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("LogWriter tag", "now running onDestroy");
    }
}
