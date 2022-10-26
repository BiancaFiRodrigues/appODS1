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

        //ODS3
        btnODS3 = findViewById(R.id.btnODS3);
        btnODS3.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view){
                Intent ODS3 = new Intent( getApplicationContext(), ODS3Activity.class);
                startActivity(ODS3);
            }
        });

        //ODS4
        btnODS4 = findViewById(R.id.btnODS4);
        btnODS4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ODS4 = new Intent(getApplicationContext(), ODS4Activity.class);
                startActivity(ODS4);
            }
        });

        //ODS5
        btnODS5 = findViewById(R.id.btnODS5);
        btnODS5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ODS5 = new Intent(getApplicationContext(), ODS5Activity.class);
                startActivity(ODS5);
            }
        });

        //ODS6
        btnODS6 = findViewById(R.id.btnODS6);
        btnODS6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ODS6 = new Intent(getApplicationContext(), ODS6Activity.class);
                startActivity(ODS6);
            }
        });

        //ODS7
        btnODS7 = findViewById(R.id.btnODS7);
        btnODS7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ODS7 = new Intent(getApplicationContext(), ODS7Activity.class);
                startActivity(ODS7);
            }
        });

        //ODS8
        btnODS8 = findViewById(R.id.btnODS8);
        btnODS8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ODS8 = new Intent(getApplicationContext(), ODS8Activity.class);
                startActivity(ODS8);
            }
        });

        //ODS9
        btnODS9 = findViewById(R.id.btnODS9);
        btnODS9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ODS9 = new Intent(getApplicationContext(), ODS9Activity.class);
                startActivity(ODS9);
            }
        });

        //ODS10
        btnODS10 = findViewById(R.id.btnODS10);
        btnODS10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ODS10 = new Intent(getApplicationContext(), ODS10Activity.class);
                startActivity(ODS10);
            }
        });

        //ODS11
        btnODS11 = findViewById(R.id.btnODS11);
        btnODS11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ODS11 = new Intent(getApplicationContext(), ODS11Activity.class);
                startActivity(ODS11);
            }
        });

        //ODS12
        btnODS12 = findViewById(R.id.btnODS12);
        btnODS12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ODS12 = new Intent(getApplicationContext(), ODS12Activity.class);
                startActivity(ODS12);
            }
        });

        //ODS13
        btnODS13 = findViewById(R.id.btnODS13);
        btnODS13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ODS13 = new Intent(getApplicationContext(), ODS13Activity.class);
                startActivity(ODS13);
            }
        });

        //ODS14
        btnODS14 = findViewById(R.id.btnODS14);
        btnODS14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ODS14 = new Intent(getApplicationContext(), ODS14Activity.class);
                startActivity(ODS14);
            }
        });

        //ODS15
        btnODS15 = findViewById(R.id.btnODS15);
        btnODS15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ODS15 = new Intent(getApplicationContext(), ODS15Activity.class);
                startActivity(ODS15);
            }
        });

        //ODS16
        btnODS16 = findViewById(R.id.btnODS16);
        btnODS16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ODS16 = new Intent(getApplicationContext(), ODS16Activity.class);
                startActivity(ODS16);
            }
        });

        //ODS17
        btnODS17 = findViewById(R.id.btnODS17);
        btnODS17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ODS17 = new Intent(getApplicationContext(), ODS17Activity.class);
                startActivity(ODS17);
            }
        });

        //Botão Sair
        btnSair = findViewById(R.id.btnSair);
        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                finishAffinity();
            }
        });

    }
}