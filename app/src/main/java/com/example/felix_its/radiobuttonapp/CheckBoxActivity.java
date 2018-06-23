package com.example.felix_its.radiobuttonapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity {
    Button btnSelect;
    CheckBox chbCoffee,chbTea,chbGreenTea,chbColdDrinks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        btnSelect=findViewById(R.id.btnSelect);
        chbTea=findViewById(R.id.chbTea);
        chbCoffee=findViewById(R.id.chbCoffee);
        chbColdDrinks=findViewById(R.id.chbColdDrinks);
        chbGreenTea=findViewById(R.id.chbGreenTea);
        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int totalAmount=0;
                StringBuilder result= new StringBuilder();
                result.append("Selected Items:");
                if(chbCoffee.isChecked()) {
                    result.append("\n" + chbCoffee.getText().toString() + " Rs 30");
                    totalAmount=+30;
                }
                if(chbTea.isChecked()) {
                    result.append("\n" + chbTea.getText().toString() + " Rs 25");
                    totalAmount=+25;
                }
                if(chbGreenTea.isChecked()) {
                    result.append("\n" + chbGreenTea.getText().toString() + " Rs 20");
                    totalAmount=+20;
                }
                if(chbColdDrinks.isChecked()) {
                    result.append("\n" + chbCoffee.getText().toString() + " Rs 25");
                    totalAmount=+25;
                }
               result.append("\n Total Ammount ="+totalAmount);
                Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_LONG).show();

            }
        });
    }
}
