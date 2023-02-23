package com.example.parcial_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edt1, edt2;
    TextView txv1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        txv1 = findViewById(R.id.txv1);
    }
        public void login (View v){
            String usuario = edt1.getText().toString();
            String clave = edt2.getText().toString();

            if (usuario.equals("parcialETps1") && clave.equals("p4rC14l#tp$"))
            {
                startActivity(new Intent(MainActivity.this, Calculo.class));
            }
            else
            {
                txv1.setText("Las credenciales son incorrectas, intentelo nuevamente");
            }
    }
}