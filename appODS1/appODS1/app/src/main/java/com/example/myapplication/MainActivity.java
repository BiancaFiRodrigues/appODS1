package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnODS1, btnODS2, btnODS3, btnODS4, btnODS5, btnODS6, btnODS7, btnODS8, btnODS9, btnODS10,
            btnODS11, btnODS12, btnODS13, btnODS14, btnODS15, btnODS16, btnODS17, btnSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // abrir ODS's
        //ODS1

        btnODS1 = findViewById(R.id.btnODS1);
        btnODS1.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view){
                Intent ODS1 = new Intent( getApplicationContext(), ODS1Activity.class);
                startActivity( ODS1);
            }
        });

        //ODS2

        btnODS2 = findViewById(R.id.btnODS2);
        btnODS2.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view){
                Intent ODS2 = new Intent( getApplicationContext(), ODS2Activity.class);
                startActivity( ODS2);
            }
        });
    }
}