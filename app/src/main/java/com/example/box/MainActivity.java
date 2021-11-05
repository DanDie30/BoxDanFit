package com.example.box;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar tb = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(tb);
    }

    private void setSupportActionBar(Toolbar tb) {
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //incorporar el menu dentro del activity
        getMenuInflater().inflate(R.menu.menu1, menu);
        return true;
    }

    public void login(View v) {
        Intent i = new Intent(this, GolpesBasicos.class);
        startActivity(i);
    }
    public void loginPrincipal(View i){
        Intent n = new Intent(this, Principal1.class);
        startActivity(n);

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId(); //Recuperar el id de la seccion seleccionada
        if (id == R.id.op1) {
            Toast.makeText(this, "Vas a configuracion", Toast.LENGTH_SHORT).show();
        }
        else if (id==R.id.op2){
            Toast.makeText(this, "Vas a Premium", Toast.LENGTH_SHORT).show();
        }


        return super.onOptionsItemSelected(item);
    }


    public void menu(View M){
        Intent i = new Intent(this,Menus.class);
        startActivity(i);




    }
}

