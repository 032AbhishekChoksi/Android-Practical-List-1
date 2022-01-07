package com.abhishekchoksi.palindromeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextNumber;
    Button bttnCheck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber = findViewById(R.id.editTextNumber);
        bttnCheck = findViewById(R.id.bttnCheck);

        bttnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r,sum=0,temp;
                int n= Integer.parseInt(editTextNumber.getText().toString());//It is the number variable to be checked for palindrome

                temp=n;
                while(n>0){
                    r=n%10;  //getting remainder
                    sum=(sum*10)+r;
                    n=n/10;
                }
                if(temp==sum)
                    Toast.makeText(getApplicationContext(), "Palindrome number", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(), "Not A Palindrome number", Toast.LENGTH_LONG).show();
            }
        });
    }
}