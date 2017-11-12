package com.example.admin.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;
import static java.lang.Float.parseFloat;

public class Calculator extends AppCompatActivity {
    private Float currentResult = new Float(0);
    private Float operandA = new Float(0);
    private Float operandB = new Float(0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        Log.i("Calculator tag", "now running onCreate");
    }

    public void onClickButtonPlus(View view) {
        // create variable for editText
        EditText editText = (EditText) findViewById(R.id.operandA);
        // error report when operand A input is null
        if(editText.getText().toString().equals("")){
            editText.setText("0");
            Log.i("Calculator tag", "empty input");
        }
        operandA = parseFloat(editText.getText().toString()); // convert to string

        EditText editText2 = (EditText) findViewById(R.id.operandB);
        // error report when operand B input is null
        if(editText2.getText().toString().equals("")){
            editText2.setText("0");
            Log.i("Calculator tag", "empty input");
        }
        operandB = parseFloat(editText2.getText().toString()); // convert to string
        currentResult = operandA + operandB; // operation
        TextView textView = (TextView) findViewById(R.id.result);
        textView.setText( currentResult.toString() ); // convert result to string
        Toast.makeText(this, "Result is " + currentResult.toString(),
                Toast.LENGTH_LONG).show(); // print whole string
    }
    // minus button
    public void onClickButtonMinus(View view) {
        EditText editText = (EditText) findViewById(R.id.operandA);
        if(editText.getText().toString().equals("")){
            editText.setText("0");
            Log.i("Calculator tag", "empty input");
        }
        operandA = parseFloat(editText.getText().toString());

        EditText editText2 = (EditText) findViewById(R.id.operandB);
        if(editText2.getText().toString().equals("")){
            editText2.setText("0");
            Log.i("Calculator tag", "empty input");
        }
        operandB = parseFloat(editText2.getText().toString());
        currentResult = operandA - operandB; // operation
        TextView textView = (TextView) findViewById(R.id.result);
        textView.setText( currentResult.toString() );
        Toast.makeText(this, "Result is " + currentResult.toString(),
                Toast.LENGTH_LONG).show(); // print whole string
    }
    // multiply button
    public void onClickButtonMultiply(View view) {
        // create variable for editText
        EditText editText = (EditText) findViewById(R.id.operandA);
        if(editText.getText().toString().equals("")){
            editText.setText("0");
            Log.i("Calculator tag", "empty input");
        }
        operandA = parseFloat(editText.getText().toString()); // convert to string

        EditText editText2 = (EditText) findViewById(R.id.operandB);
        if(editText2.getText().toString().equals("")){
            editText2.setText("0");
            Log.i("Calculator tag", "empty input");
        }
        operandB = parseFloat(editText2.getText().toString()); // convert to string
        currentResult = operandA * operandB; // operation
        TextView textView = (TextView) findViewById(R.id.result);
        textView.setText( currentResult.toString() ); // convert result to string
        Toast.makeText(this, "Result is " + currentResult.toString(),
                Toast.LENGTH_LONG).show(); // print whole string
    }
    // divide button
    public void onClickButtonDivide(View view) {
        // create variable for editText
        EditText editText = (EditText) findViewById(R.id.operandA);

        if(editText.getText().toString().equals("")){
            editText.setText("0");
            Log.i("Calculator tag", "empty input");
        }
        operandA = parseFloat(editText.getText().toString());

        EditText editText2 = (EditText) findViewById(R.id.operandB);
        if(editText2.getText().toString().equals("")){
            editText2.setText("0");
            Log.i("Calculator tag", "empty input");
        }
        operandB = parseFloat(editText2.getText().toString());
        // error report when operand B is 0
        if(operandB == 0) {
            Toast.makeText(this, "Error, division by 0", Toast.LENGTH_LONG).show();
            Log.i("Calculator tag", "Error, division by 0");
            currentResult = parseFloat(String.valueOf(0));
        }
        else {
            currentResult = operandA / operandB; // operation
            TextView textView = (TextView) findViewById(R.id.result);
            textView.setText(currentResult.toString()); // convert result to string
            Toast.makeText(this, "Result is " + currentResult.toString(),
                    Toast.LENGTH_LONG).show();
        }
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Calculator tag", "now running onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Calculator tag", "now running onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Calculator tag", "now running onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Calculator tag", "now running onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Calculator tag", "now running onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Calculator tag", "now running onDestroy");
    }


}
