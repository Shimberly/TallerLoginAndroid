package com.example.kimberly.tallerlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String user = getIntent().getStringExtra("user");
        String pass = getIntent().getStringExtra("pass");
        String code = getIntent().getStringExtra("code");

        // Capture the layout's TextView and set the string as its text
        final TextView userR = (TextView) findViewById(R.id.usernameTxtR);
        userR.setText(user);

        final TextView passR = (TextView) findViewById(R.id.passwordTxtR);
        passR.setText(pass);

        final TextView codeR = (TextView) findViewById(R.id.codeTxtR);
        codeR.setText(code);
    }



}
