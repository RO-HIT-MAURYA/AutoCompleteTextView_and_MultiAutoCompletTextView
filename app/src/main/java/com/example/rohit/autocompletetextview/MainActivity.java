package com.example.rohit.autocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    /*AutoCompleteTextView autoCompleteTextView;
    String[] countries;*/


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        countries = getResources().getStringArray(R.array.countries);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,countries);
        autoCompleteTextView.setAdapter(arrayAdapter);*/

        String[] names = getResources().getStringArray(R.array.name);
        MultiAutoCompleteTextView multiAutoCompleteTextView = findViewById(R.id.multiAutoCompleteTextView);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,names);

        multiAutoCompleteTextView.setAdapter(arrayAdapter);
        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

    }
}
