package com.example.box;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

public class GolpesBasicos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_golpes_basicos);
//Referencia al toolbar

    }
    public void back(View v){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);

    }
}