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

public class Addemp extends AppCompatActivity {

    EditText e3,e4,e5,e6,e7;
    Button b5,b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_addemp);

        e3=(EditText) findViewById(R.id.et3);
        e4=(EditText) findViewById(R.id.et4);
        e5=(EditText) findViewById(R.id.et5);
        e6=(EditText) findViewById(R.id.et6);
        e7=(EditText) findViewById(R.id.et7);
        b5=(Button) findViewById(R.id.bt5);
        b6=(Button) findViewById(R.id.bt6);

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob6 = new Intent(getApplicationContext(), Menu.class);
                startActivity(ob6);
            }
        });

    }
}