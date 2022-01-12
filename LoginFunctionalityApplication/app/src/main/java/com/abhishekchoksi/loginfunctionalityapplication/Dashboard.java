package com.abhishekchoksi.loginfunctionalityapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        setTitle("Dashboard");

        textView = findViewById(R.id.textView);

        Bundle extras = getIntent().getExtras();

        if(extras != null){
            String usernamedata = extras.getString("usernamedata");
            textView.setText(usernamedata);
        }
    }
}