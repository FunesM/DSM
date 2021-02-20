package com.example.ejerciciodesafio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Mostrar();
    }

    public void Mostrar(){
        Bundle extras = getIntent().getExtras();
        Double SalarioF = extras.getDouble("NewSalario");
        textView = findViewById(R.id.tv);
        String resultado = "El nuevo sueldo a pagar sera de " + SalarioF;
        textView.setText(resultado);
    }

    public void Atras(View in){
        Intent antes = new Intent(this, MainActivity.class);
        startActivity(antes);
    }
}