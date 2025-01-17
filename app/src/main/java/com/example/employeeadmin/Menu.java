package com.example.employeeadmin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Menu extends AppCompatActivity {

    Button b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);

        b2=(Button) findViewById(R.id.bt2);
        b3=(Button) findViewById(R.id.bt3);
        b4=(Button) findViewById(R.id.bt4);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob2 = new Intent(getApplicationContext(), Addemp.class);
                startActivity(ob2);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob3 = new Intent(getApplicationContext(), SearchEmp.class);
                startActivity(ob3);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob4 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ob4);
            }
        });

    }
}