package com.example.suman.setup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText edName = (EditText)findViewById(R.id.edName);
        final EditText edUsername = (EditText)findViewById(R.id.edUserName);
        final EditText edPassword = (EditText)findViewById(R.id.edPassword);
        final EditText edAge = (EditText)findViewById(R.id.edAge);

        final Button bRegister = (Button)findViewById(R.id.bRegister);


    }
}
