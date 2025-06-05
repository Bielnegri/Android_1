package com.example.ex3;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import controller.Ops;

public class MainActivity extends AppCompatActivity {
    private EditText etNum1;
    private EditText etNum2;
    private Button btnMaiorNum;
    private Button btnSomaImpar;
    private TextView tvResultadoValor;
    private Ops ops = new Ops();
    private int n1;
    private int n2;

    private String resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        etNum1 = findViewById(R.id.etNum1);
        etNum2 = findViewById(R.id.etNum2);
        btnMaiorNum = findViewById(R.id.btnMaiorNum);
        btnSomaImpar = findViewById(R.id.btnSomaImpar);
        tvResultadoValor = findViewById(R.id.tvResultadoValor);

        btnMaiorNum.setOnClickListener(op -> verificaMaior());
        btnSomaImpar.setOnClickListener(op -> calculaSomaImpar());
    }

    private void verificaMaior(){
        n1 = Integer.parseInt(etNum1.getText().toString());
        n2 = Integer.parseInt(etNum2.getText().toString());
        resultado = ops.verificaMaiorNum(n1, n2);
        tvResultadoValor.setText(resultado);
    }

    private void calculaSomaImpar(){
        n1 = Integer.parseInt(etNum1.getText().toString());
        n2 = Integer.parseInt(etNum2.getText().toString());
        resultado = ops.calculaSomaImpar(n1, n2);
        tvResultadoValor.setText(resultado);
    }
}