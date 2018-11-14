package com.example.kimberly.tallerlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

import java.util.Random;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }


    public void sendMessage(View view) {
        final EditText user = (EditText) findViewById(R.id.usernameBox);
        final EditText pass = (EditText) findViewById(R.id.passwordBox);
        final EditText code = (EditText) findViewById(R.id.codeBox);

        if(checkPassword(user.getText(), pass.getText(),code.getText())){
            Intent intent = new Intent(this, Principal.class);
            String userMsg = user.getText().toString();
            String passMsg = pass.getText().toString();
            String codeMsg = code.getText().toString();
            intent.putExtra("user", userMsg);
            intent.putExtra("pass", passMsg);
            intent.putExtra("code", codeMsg);
            startActivity(intent);
        }else{
            user.setText("");
            pass.setText("");
            code.setText("");
        }


    }

    private boolean checkPassword(Editable user, Editable pass, Editable code) {
        return new Random().nextBoolean();
    }


}
