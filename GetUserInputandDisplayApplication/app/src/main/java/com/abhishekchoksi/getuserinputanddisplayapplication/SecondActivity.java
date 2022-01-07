package com.abhishekchoksi.getuserinputanddisplayapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView textResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setTitle("Result Application");
        textResult = findViewById(R.id.textResult);

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            String mydata = extras.getString("mydata");
            textResult.setText(mydata);
        }
    }
}