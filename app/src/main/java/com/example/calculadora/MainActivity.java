package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private TextView caja;
    float numero1 = 0.0f;
    float numero2 = 0.0f;
    String operacion = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        caja = findViewById(R.id.caja);
    }

    public void EscribeCero(View view) {
        float valor = Float.parseFloat(caja.getText().toString());
        if (valor == 0.0f){
            caja.setText("0");
        }else {
            caja.setText(caja.getText() + "0");
        }
    }


    public void EscribeUno(View view) {
        float valor = Float.parseFloat(caja.getText().toString());
        if (valor == 0.0f){
            caja.setText("1");
        }else {
            caja.setText(caja.getText() + "1");
        }
    }

    public void EscribeDos(View view) {
        float valor = Float.parseFloat(caja.getText().toString());
        if (valor == 0.0f){
            caja.setText("2");
        }else {
            caja.setText(caja.getText() + "2");
        }
    }

    public void EscribeTres(View view) {
        float valor = Float.parseFloat(caja.getText().toString());
        if (valor == 0.0f){
            caja.setText("3");
        }else {
            caja.setText(caja.getText() + "3");
        }
    }

    public void EscribeCuatro(View view) {
        float valor = Float.parseFloat(caja.getText().toString());
        if (valor == 0.0f){
            caja.setText("4");
        }else {
            caja.setText(caja.getText() + "4");
        }
    }

    public void EscribeCinco(View view) {
        float valor = Float.parseFloat(caja.getText().toString());
        if (valor == 0.0f){
            caja.setText("5");
        }else {
            caja.setText(caja.getText() + "5");
        }
    }

    public void EscribeSeis(View view) {
        float valor = Float.parseFloat(caja.getText().toString());
        if (valor == 0.0f){
            caja.setText("6");
        }else {
            caja.setText(caja.getText() + "6");
        }
    }

    public void EscribeSiete(View view) {
        float valor = Float.parseFloat(caja.getText().toString());
        if (valor == 0.0f){
            caja.setText("7");
        }else {
            caja.setText(caja.getText() + "7");
        }
    }

    public void EscribeOcho(View view) {
        float valor = Float.parseFloat(caja.getText().toString());
        if (valor == 0.0f){
            caja.setText("8");
        }else {
            caja.setText(caja.getText() + "8");
        }
    }

    public void EscribeNueve(View view) {
        float valor = Float.parseFloat(caja.getText().toString());
        if (valor == 0.0f){
            caja.setText("9");
        }else {
            caja.setText(caja.getText() + "9");
        }
    }

    public void LimpiaResul(View view) {
        caja.setText("0");
        numero1 = 0.0f;
        numero2 = 0.0f;
        operacion = "";
    }

    public void opdividir(View view) {
        numero1 = Float.parseFloat(caja.getText().toString());
        operacion = "/";
        caja.setText("0");
    }

    public void mostraresultado(View view) {
        numero2 = Float.parseFloat(caja.getText().toString());
        if(operacion.equals("/")){
            if(numero2 == 0.0f){
                caja.setText("0");
                Toast.makeText(this, "operacion no valida", Toast.LENGTH_LONG).show();
            }else {
                Float result = numero1 / numero2;
                caja.setText(result + "");
            }
        }
        else if(operacion.equals("x")){
                Float result = numero1 * numero2;
                caja.setText(result + "");
        } else if (operacion.equals("-")) {
            Float result = numero1 - numero2;
            caja.setText(result + "");
        } else if (operacion.equals("+")) {
            Float result = numero1 + numero2;
            caja.setText(result + "");
        }
    }


    public void OpMulti(View view) {
        numero1 = Float.parseFloat(caja.getText().toString());
        operacion = "x";
        caja.setText("0");
    }

    public void OpResta(View view) {
        numero1 = Float.parseFloat(caja.getText().toString());
        operacion = "-";
        caja.setText("0");
    }

    public void OpSuma(View view) {
        numero1 = Float.parseFloat(caja.getText().toString());
        operacion = "+";
        caja.setText("0");
    }
}