package com.andro.anant.autocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView actv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actv = findViewById(R.id.actv);

        String[] values = getResources().getStringArray(R.array.country);

        //String[] values = new String[]{"India","pakistan","china"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item,values);

        actv.setAdapter(adapter);
        actv.setThreshold(2);

    }
}
