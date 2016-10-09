package com.example.suhas.friendtracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText etName = (EditText)findViewById(R.id.etName);
        final EditText etUsername = (EditText)findViewById(R.id.etUsername);
        final EditText etPassword = (EditText)findViewById(R.id.etPassword);
        final EditText etPhone = (EditText)findViewById(R.id.etPhone);
        final EditText etEmail = (EditText)findViewById(R.id.etEmail);
        final Button bRegister = (Button) findViewById(R.id.bRegister);

        //*****************
        //Data entered to be sent to the cloud before going back to the Login Activity from Register Activity
        //*****************

        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent =new Intent(RegisterActivity.this, LoginActivity.class);
                RegisterActivity.this.startActivity(registerIntent);


            }
        });

    }
}
