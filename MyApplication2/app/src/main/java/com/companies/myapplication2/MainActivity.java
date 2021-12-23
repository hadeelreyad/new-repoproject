package com.companies.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText username, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=  (EditText) findViewById(R.id.ed_username);
        password=   (EditText) findViewById(R.id.ed_password);
    }
    public void onClick(View view){
        User user = new user();
        user.setUsername(username. getText().toString());
        user.setPassword(password.getText().toString());
    }

    public void go(View view) {
    }
}
