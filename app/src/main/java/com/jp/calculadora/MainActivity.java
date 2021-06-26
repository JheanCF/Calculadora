
package com.jp.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button btnIgual;
    Button btnMas;
    Button btnMenos;
    Button btnPor;
    Button btnDivision;
    TextView tvResult;
    int numero1 =0;
    int numero2=0;
    String operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = findViewById(R.id.tvResult);
        tvResult.setText("0");
        btnMas = findViewById(R.id.btnMas);
        btnMenos = findViewById(R.id.btnMenos);
        btnPor = findViewById(R.id.btnPor);
        btnDivision = findViewById(R.id.btnDivision);
        btnIgual = findViewById(R.id.btnIgual);
        btnMas.setOnClickListener(this);
        btnMenos.setOnClickListener(this);
        btnPor.setOnClickListener(this);
        btnDivision.setOnClickListener(this);
        btnIgual.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.btnMas){
            numero1= Integer.parseInt(tvResult.getText().toString());
            operacion="+";
            tvResult.setText("0");

        }
        if (v.getId()==R.id.btnMenos){
            numero1= Integer.parseInt(tvResult.getText().toString());
            operacion="-";
            tvResult.setText("0");

        }
        if (v.getId()==R.id.btnPor){
            numero1= Integer.parseInt(tvResult.getText().toString());
            operacion="*";
            tvResult.setText("0");

        }
        if (v.getId()==R.id.btnDivision){
            numero1= Integer.parseInt(tvResult.getText().toString());
            operacion="/";
            tvResult.setText("0");

        }

        if (v.getId()==R.id.btnIgual){
            numero2=Integer.parseInt(tvResult.getText().toString());
            if (operacion.equals("+")){
                int resultado=numero1+numero2;
                tvResult.setText(resultado+"");
            }
            if (operacion.equals("-")){
                int resultado=numero1-numero2;
                tvResult.setText(resultado+"");
            }
            if (operacion.equals("*")){
                int resultado=numero1*numero2;
                tvResult.setText(resultado+"");
            }
            if (operacion.equals("/")){
                if (numero2 > 0) {
                    int resultado = numero1 / numero2;
                    tvResult.setText(resultado + "");
                }else {
                    Toast.makeText(this,"Operacion no valida",Toast.LENGTH_SHORT).show();
                   numero2=0;
                   tvResult.setText("0");

                }
            }
            numero1=0;
            numero2=0;
            operacion="";
        }
    }

        public void numeroUno (View view){
        int valor = Integer.parseInt(tvResult.getText().toString());
        if (valor == 0 ) {
            tvResult.setText("1");
        } else {
            tvResult.setText(tvResult.getText() + "1");
        }
    }

        public void numeroDos (View view){
        int valor = Integer.parseInt(tvResult.getText().toString());
        if (valor == 0) {
            tvResult.setText("2");
        } else {
            tvResult.setText(tvResult.getText() + "2");
        }
    }
        public void numeroTres (View view){
        int valor = Integer.parseInt(tvResult.getText().toString());
        if (valor == 0) {
            tvResult.setText("3");
        } else {
            tvResult.setText(tvResult.getText() + "3");
        }
    }
        public void numeroCuatro (View view){
        int valor = Integer.parseInt(tvResult.getText().toString());
        if (valor == 0) {
            tvResult.setText("4");
        } else {
            tvResult.setText(tvResult.getText() + "4");
        }
    }
        public void numeroCinco (View view){
        int valor = Integer.parseInt(tvResult.getText().toString());
        if (valor == 0) {
            tvResult.setText("5");
        } else {
            tvResult.setText(tvResult.getText() + "5");
        }
    }
        public void numeroSeis (View view){
        int valor = Integer.parseInt(tvResult.getText().toString());
        if (valor == 0) {
            tvResult.setText("6");
        } else {
            tvResult.setText(tvResult.getText() + "6");
        }
    }
        public void numeroSiete (View view){
        int valor = Integer.parseInt(tvResult.getText().toString());
        if (valor == 0) {
            tvResult.setText("7");
        } else {
            tvResult.setText(tvResult.getText() + "7");
        }
    }
        public void numeroOcho (View view){
        int valor = Integer.parseInt(tvResult.getText().toString());
        if (valor == 0) {
            tvResult.setText("8");
        } else {
            tvResult.setText(tvResult.getText() + "8");
        }
    }
        public void numeroNueve (View view){
        int valor = Integer.parseInt(tvResult.getText().toString());
        if (valor == 0) {
            tvResult.setText("9");
        } else {
            tvResult.setText(tvResult.getText() + "9");
        }
    }
        public void numeroCero (View view){
        int valor = Integer.parseInt(tvResult.getText().toString());
        if (valor == 0) {
            tvResult.setText("0");
        } else {
            tvResult.setText(tvResult.getText() + "0");
        }

    }


    public void clearAll(View view) {
        numero1=0;
        numero2=0;
        operacion="";
        tvResult.setText("0");
    }
}