package com.example.suman.setup;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

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

        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String name = edName.getText().toString();
                final String username = edUsername.getText().toString();
                final String passeord = edPassword.getText().toString();
                final int age = Integer.parseInt(edAge.getText().toString());

                Response.Listener<String> responseListener = new Response.Listener<String>(){

                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");
                            if(success){
                                Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
                                RegisterActivity.this.startActivity(intent);
                            }else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(RegisterActivity.this);
                                builder.setMessage("Register Failed");
                                builder.setNegativeButton("Retry",null);
                                builder.create();
                                builder.show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                };

                RegisterRequest registerRequest = new RegisterRequest(name, username,age,passeord,responseListener);
                RequestQueue queue = Volley.newRequestQueue(RegisterActivity.this);
                queue.add(registerRequest);
            }
        });

    }
}
