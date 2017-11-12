package com.example.admin.assignment1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;

import java.lang.reflect.Array;
import java.util.Random;

import static java.lang.Integer.parseInt;

public class Die_Roll extends AppCompatActivity {
    // initializing variables
    private int die1 = new Integer(0);
    private int die2 = new Integer(0);
    private int die3 = new Integer(0);
    private int die4 = new Integer(0);
    private Spinner spinner;
    private int n = 0;
    private String[] num = new String[100];
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_die__roll);
        Log.i("Die_Roll tag", "now running onCreate");
        Log.i("Die_Roll tag", "calling onCreate functions");
        // calling functions to add items into spinner
        addItemsintoSpinner();
        addListenerOnSpinnerItemSelection();
        Log.i("Die_Roll tag", "added items into spinner");
    }
    public void addItemsintoSpinner(){
        // identify spinner
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.dienumber_array, android.R.layout.simple_spinner_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    }
    public void addListenerOnSpinnerItemSelection() {
        spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(new SpinnerActivity());
    }
    public class SpinnerActivity extends Activity implements AdapterView.OnItemSelectedListener {
        // onClickItemListener for debugging purposes
        public void onItemSelected(AdapterView<?> parent, View view,
                                   int pos, long id) {
            // An item was selected. You can retrieve the selected item using
            // parent.getItemAtPosition(pos)
            Toast.makeText(parent.getContext(),
                    "OnItemSelectedListener : " + parent.getItemAtPosition(pos).toString(),
                    Toast.LENGTH_SHORT).show();
        }
        // when nothing is selected
        public void onNothingSelected(AdapterView<?> parent) {
            // Another interface callback
            Toast.makeText(parent.getContext(),
                    "OnItemSelectedListener : Nothing has been selected",
                    Toast.LENGTH_SHORT).show();
        }
    }
    // when the Roll! button is pressed
    public void onClickButtonRoll(View view){


        Random randomno = new Random();

        TextView textViewdie1 = (TextView) findViewById(R.id.die1view);
        TextView textViewdie2 = (TextView) findViewById(R.id.die2view);
        TextView textViewdie3 = (TextView) findViewById(R.id.die3view);
        TextView textViewdie4 = (TextView) findViewById(R.id.die4view);
        spinner = (Spinner) findViewById(R.id.spinner);
        // convert item selected in spinner into string
        String SpinnerItem = spinner.getSelectedItem().toString();
        // depending on the number of die specified, the matching number of die is rolled
        if(SpinnerItem.equals("4 dice")){
            // randomly generate number
            die1 = randomno.nextInt(6) + 1;
            die2 = randomno.nextInt(6) + 1;
            die3 = randomno.nextInt(6) + 1;
            die4 = randomno.nextInt(6) + 1;
            // print to textView
            textViewdie1.setText( Integer.toString(die1) );
            textViewdie2.setText( Integer.toString(die2) );
            textViewdie3.setText( Integer.toString(die3) );
            textViewdie4.setText( Integer.toString(die4) );
            // convert to string then append into array
            num[n] = Integer.toString(die1);
            num[n+1] = Integer.toString(die2);
            num[n+2] = Integer.toString(die3);
            num[n+3] = Integer.toString(die4);
        }
        else if(SpinnerItem.equals("3 dice")){
            die1 = randomno.nextInt(6) + 1;
            die2 = randomno.nextInt(6) + 1;
            die3 = randomno.nextInt(6) + 1;
            die4 = parseInt(String.valueOf(0)); // not rolled, hence 0
            textViewdie1.setText( Integer.toString(die1) );
            textViewdie2.setText( Integer.toString(die2) );
            textViewdie3.setText( Integer.toString(die3) );
            textViewdie4.setText( Integer.toString(die4) );
            num[n] = Integer.toString(die1);
            num[n+1] = Integer.toString(die2);
            num[n+2] = Integer.toString(die3);
            num[n+3] = Integer.toString(die4);
        }
        else if(SpinnerItem.equals("2 dice")){
            die1 = randomno.nextInt(6) + 1;
            die2 = randomno.nextInt(6) + 1;
            die3 = parseInt(String.valueOf(0));
            die4 = parseInt(String.valueOf(0));
            textViewdie1.setText( Integer.toString(die1) );
            textViewdie2.setText( Integer.toString(die2) );
            textViewdie3.setText( Integer.toString(die3) );
            textViewdie4.setText( Integer.toString(die4) );
            num[n] = Integer.toString(die1);
            num[n+1] = Integer.toString(die2);
            num[n+2] = Integer.toString(die3);
            num[n+3] = Integer.toString(die4);
        }
        else if(SpinnerItem.equals("1 die")){
            die1 = randomno.nextInt(6) + 1;
            die2 = parseInt(String.valueOf(0));
            die3 = parseInt(String.valueOf(0));
            die4 = parseInt(String.valueOf(0));
            textViewdie1.setText( Integer.toString(die1) );
            textViewdie2.setText( Integer.toString(die2) );
            textViewdie3.setText( Integer.toString(die3) );
            textViewdie4.setText( Integer.toString(die4) );
            num[n] = Integer.toString(die1);
            num[n+1] = Integer.toString(die2);
            num[n+2] = Integer.toString(die3);
            num[n+3] = Integer.toString(die4);
        }
        n += 4; // the array is continuously added with new elements
        if(n == 100){
            n = 0;
        }
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Die_Roll tag", "now running onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Die_Roll tag", "now running onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Die_Roll tag", "now running onPause");
        // create boolean to transfer
        boolean SaveLogChecked = ((CheckBox)findViewById(R.id.savelog)).isChecked();
        // creating intent
        Intent intent = new Intent(this, LogWriter.class);
        // messages sent by intent
        intent.putExtra("string-array", num);
        intent.putExtra("Checked", SaveLogChecked);
        startActivity(intent);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Die_Roll tag", "now running onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Die_Roll tag", "now running onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Die_Roll tag", "now running onDestroy");
    }
}
