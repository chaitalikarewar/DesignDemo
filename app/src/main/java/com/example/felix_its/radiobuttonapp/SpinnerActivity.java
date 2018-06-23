package com.example.felix_its.radiobuttonapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinnerActivity extends AppCompatActivity {
    String[] country = { "India", "USA", "China", "Japan", "Other"};
    String[] state = { "Andhra Pradesh", "Bihar", "Maharashtra", "Madhya Pradesh", "Other"};
    String[] city = { "Pune", "Hyderabad", "Jaipur", "Patana", "Other"};
    Spinner spnCountry,spnState,spnCity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        spnCountry=findViewById(R.id.spnCounty);
        spnCity=findViewById(R.id.spnCity);
        spnState=findViewById(R.id.spnState);



        ArrayAdapter countyAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,country);
        countyAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);

        spnCountry.setAdapter(countyAdapter);

        ArrayAdapter cityAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,city);
        cityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnCity.setAdapter(cityAdapter);

        ArrayAdapter stateAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,state);
        stateAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnState.setAdapter(stateAdapter);
    }


    public void OnSelectOption(View view) {
        StringBuilder selectedInfo =new StringBuilder();
         selectedInfo.append("selected Data: ").append(spnCountry.getSelectedItem().toString()).append("\n")
                 .append(spnState.getSelectedItem().toString()).append("\n")
                         .append(spnCity.getSelectedItem().toString());
        Toast.makeText(this,selectedInfo.toString(),Toast.LENGTH_LONG).show();

    }
}
