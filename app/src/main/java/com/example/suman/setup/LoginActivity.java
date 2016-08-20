package com.example.suman.setup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final EditText edName = (EditText)findViewById(R.id.edName);
        final EditText edUsername = (EditText)findViewById(R.id.edUserName);
        final Button bLogin = (Button)findViewById(R.id.bLogin);
        final TextView tvRegisterHere = (TextView)findViewById(R.id.tvRegisterHere);

        tvRegisterHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(LoginActivity.this,RegisterActivity.class);
                LoginActivity.this.startActivity(registerIntent);
            }
        });
    }
}
