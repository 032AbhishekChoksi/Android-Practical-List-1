package com.abhishekchoksi.unitconversionfahrenheittocelsiusapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     Button bttnConvert;
     TextView textViewCelsius;
     EditText editTextFahrenheit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Unit Conversion Application");

        bttnConvert = findViewById(R.id.bttnConvert);
        textViewCelsius = findViewById(R.id.textViewCelsius);
        editTextFahrenheit = findViewById(R.id.editTextFahrenheit);

        bttnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double fahrenheit = 0 ,celsius = 0;
                fahrenheit = Integer.parseInt(editTextFahrenheit.getText().toString());
                celsius = 0.55 * (fahrenheit - 32);
                textViewCelsius.setText(String.format("The corresponding value in Celsius is %.2f", celsius));
            }
        });
    }
}