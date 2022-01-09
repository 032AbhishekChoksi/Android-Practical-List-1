package com.example.unitconversionkilogramtopoundsapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextKilogram;
    Button bttnConversion;
    TextView textViewPounds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Unit Conversion Application");

        editTextKilogram = findViewById(R.id.editTextKilogram);
        bttnConversion = findViewById(R.id.bttnConversion);
        textViewPounds = findViewById(R.id.textViewPounds);

        bttnConversion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double kg = 0, pound = 0 ;
                kg = Double.parseDouble(editTextKilogram.getText().toString());
                pound = 2.205 * kg;
                textViewPounds.setText(String.format("The corresponding value in Pound is %.2f", pound));
            }
        });
    }
}