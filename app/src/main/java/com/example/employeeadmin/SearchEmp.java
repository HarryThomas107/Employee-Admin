package com.example.employeeadmin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SearchEmp extends AppCompatActivity {

    EditText e8;
    Button b7,b8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_search_emp);

        e8=(EditText) findViewById(R.id.et8);
        b7=(Button) findViewById(R.id.bt7);
        b8=(Button) findViewById(R.id.bt8);

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob8 = new Intent(getApplicationContext(), Menu.class);
                startActivity(ob8);
            }
        });

    }
}