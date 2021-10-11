package com.example.fac3book;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login extends AppCompatActivity {
    EditText username = (EditText) findViewById(R.id.username);
    EditText pasword = (EditText) findViewById(R.id.password);
    Button login = (Button) findViewById(R.id.login);
    TextView register = (TextView) findViewById(R.id.register);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}