package com.example.suman.setup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        final EditText edUsername = (EditText)findViewById(R.id.edUserName);
        final EditText edAge = (EditText)findViewById(R.id.edAge);
        final TextView welcomeMsg = (TextView)findViewById(R.id.tvWelcomeMsg);
    }
}
