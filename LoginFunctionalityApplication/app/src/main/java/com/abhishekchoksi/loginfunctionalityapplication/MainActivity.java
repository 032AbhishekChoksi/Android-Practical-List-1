package com.abhishekchoksi.loginfunctionalityapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextUserName,editTextUserPassword;
    Button btnLogin;
    TextView textViewMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Login Page");

        editTextUserName = findViewById(R.id.editTextUserName);
        editTextUserPassword = findViewById(R.id.editTextUserPassword);
        btnLogin = findViewById(R.id.btnLogin);
        textViewMessage = findViewById(R.id.textViewMessage);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = editTextUserName.getText().toString();
                String userpassword = editTextUserPassword.getText().toString();

                if(username.equals("Admin") && userpassword.equals("Admin")){
                    Intent i = new Intent(view.getContext(),Dashboard.class);
                    i.putExtra("usernamedata" ,username);
                    startActivity(i);
                }
                else {
                    textViewMessage.setText("Invalid User Name And Password");
                }
            }
        });
    }
}