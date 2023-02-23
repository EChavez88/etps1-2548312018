package com.example.parcial_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculo extends AppCompatActivity {
    EditText edt3, edt4;
    TextView txv2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);

        edt3 = findViewById(R.id.edt3);
        edt4 = findViewById(R.id.edt4);
        txv2 = findViewById(R.id.txv2);
    }
    public void calculo (View v) {


        double valor1 = Double.parseDouble(edt3.getText().toString());
        double valor2 = Double.parseDouble(edt4.getText().toString());

        double imc = (valor1) / (valor2 * valor2);

        if (imc > 2.5) {
            txv2.setText("Ingrese una estatura real");
        } else {
            if (imc < 10.5) {
                txv2.setText("Críticamente Bajo de Peso");
            } else if (imc < 15.9) {
                txv2.setText("Severamente Bajo de Peso");
            } else if (imc < 18.5) {
                txv2.setText("Bajo de Peso");
            } else if (imc < 25) {
                txv2.setText("Normal (peso saludable)");
            } else if (imc < 30) {
                txv2.setText("Sobrepeso");
            } else if (imc < 35) {
                txv2.setText("Obesidad Clase 1 - Moderadamente Obeso");
            } else if (imc < 40) {
                txv2.setText("Obesidad Clase 2 - Severamente Obeso");
            } else if (imc > 50) {
                txv2.setText("Obesidad Clase 3 - Críticamente Obeso");
            }
            edt3.setText("");
            edt4.setText("");
        }
    }
}