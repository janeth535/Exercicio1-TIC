package com.example.myconversordetemperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText txt_tempC;
    Button txt_converter;
    TextView txt_tempF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_tempC = findViewById(R.id.txt_tempC);
        txt_converter = findViewById(R.id.txt_converter);
        txt_tempF = findViewById(R.id.txt_resultado);

        txt_converter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
               double tempC = Double.parseDouble(txt_tempC.getText().toString());
               double tempF = tempC *1.8 + 32;

               txt_tempF.setText(String.valueOf(tempF));
            }
        });
    }
}