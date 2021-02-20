package com.example.ejerciciodesafio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText Salario, Años;
    Button but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Salario = findViewById(R.id.salario);
        Años = findViewById(R.id.años);
        but=findViewById(R.id.button);
    }

    public void CalcularSig(View in) {
        Intent calculo = new Intent(this, MainActivity2.class);
        double Sal = Double.valueOf(Salario.getText().toString());
        double Añ = Double.valueOf(Años.getText().toString());

        if (Salario.getText().toString().trim().isEmpty() || Años.getText().toString().trim().isEmpty()) {
            Toast.makeText(this, "Ingrese datos", Toast.LENGTH_SHORT).show();
        }
        if (Sal < 100) {
            Toast.makeText(this, "Ingrese un valor de sueldo igual o mayor a $100", Toast.LENGTH_SHORT).show();
        }
        if (Añ < 0) {
            Toast.makeText(this, "Ingrese un valor positivo de años de servicio", Toast.LENGTH_SHORT).show();
        }
        if (Sal< 500 && Añ >= 10) {
            Sal = Sal*1.2;
        }
        if (Sal< 500 && Añ < 10) {
            Sal = Sal*1.05;
        } else {
            Sal = Sal;
        }

        calculo.putExtra("NewSalario", Sal);
        startActivity(calculo);
    }
}