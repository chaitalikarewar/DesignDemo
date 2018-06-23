package com.example.felix_its.radiobuttonapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    public void goToCheckBoxActivity(View view) {
        Intent intent=new Intent(HomeActivity.this, CheckBoxActivity.class);
        startActivity(intent);

    }

    public void goToRealtiveActivity(View view) {
        Intent intent=new Intent(HomeActivity.this, RealtiveLayoutActivity.class);
        startActivity(intent);
    }

    public void goToRadioButtonActivity(View view) {
        Intent intent=new Intent(HomeActivity.this, RadioButtonActivity.class);
        startActivity(intent);
    }

    public void goToSpinnerActivity(View view) {
        Intent intent=new Intent(HomeActivity.this, SpinnerActivity.class);
        startActivity(intent);
    }

    public void goToAutoCompleteTextview(View view) {
        Intent intent=new Intent(HomeActivity.this, AutoCompleteTextViewActivity.class);
        startActivity(intent);
    }
}
