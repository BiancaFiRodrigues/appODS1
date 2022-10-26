package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ODS16Activity extends AppCompatActivity {

    Button btnVoltar16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ods16);

        //botão voltar
        btnVoltar16 = findViewById(R.id.btnVoltar16);
        btnVoltar16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Main = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(Main);
            }
        });
    }
}