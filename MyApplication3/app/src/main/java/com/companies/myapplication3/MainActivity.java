package com.companies.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText usernameText;
    EditText emailText;
    EditText passwordText;
    private Intent PackageContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernameText = findViewById(R.id.usernameText);
        emailText = findViewById(R.id.emailText);
        passwordText = findViewById(R.id.emailText);
    }

    private EditText findViewById() {
    }

    public void go(View view) {
        string username = usernameText.getText().toString();
        if(username.length()<=0){
            Toast.makeText(this, "Please Enter Your username or password first", Toast.LENGTH_SHORT).show();
        }
        else{
            Intent in  = new Intent(PackageContext);MainActivity.this.<registrationactivity>.class);
            startActivity(in);
        }
    }

    private class string {
        public boolean length() {
        }
    }
}