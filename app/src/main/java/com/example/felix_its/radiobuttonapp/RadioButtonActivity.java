package com.example.felix_its.radiobuttonapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtonActivity extends AppCompatActivity {


    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         radioGroup=findViewById(R.id.radioGroup);
    }

    public void OnSelectOption(View view) {

        int checked=radioGroup.getCheckedRadioButtonId();

        RadioButton rdbSelected = findViewById(checked);

        String selected = rdbSelected.getText().toString();

        Toast.makeText(this, selected, Toast.LENGTH_LONG).show();

    }
}
