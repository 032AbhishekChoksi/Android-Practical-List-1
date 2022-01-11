package com.abhishekchoksi.CalculatorTwoTextBoxApplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textResult;
    EditText editTextNumber1,editTextNumber2;
    Button btnPlus,btnMinus,btnMultiplication,btnDivision;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Calculator Application");

        textResult = findViewById(R.id.textResult);

        editTextNumber1 = findViewById(R.id.editTextNumber1);
        editTextNumber2 = findViewById(R.id.editTextNumber2);

        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiplication = findViewById(R.id.btnMultiplication);
        btnDivision = findViewById(R.id.btnDivision);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(editTextNumber1.getText().toString());
                double n2 = Double.parseDouble(editTextNumber2.getText().toString());
                double result = n1 + n2;
                textResult.setText("Result : " + result);
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(editTextNumber1.getText().toString());
                double n2 = Double.parseDouble(editTextNumber2.getText().toString());
                double result = n1 - n2;
                textResult.setText("Result : " + result);
            }
        });

        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(editTextNumber1.getText().toString());
                double n2 = Double.parseDouble(editTextNumber2.getText().toString());
                double result = n1 * n2;
                textResult.setText("Result : " + result);
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double n1 = Double.parseDouble(editTextNumber1.getText().toString());
                    double n2 = Double.parseDouble(editTextNumber2.getText().toString());
                    double result = n1 / n2;
                    textResult.setText("Result : " + result);
                }catch (Exception exception){
                    textResult.setText(exception.toString());
                }
            }
        });
    }
}