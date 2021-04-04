package com.example.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    // Inicializando Variables
    private EditText et1;
    private EditText et2;
    private TextView button_suma;
    private TextView button_resta;
    private TextView button_multiplicacion;
    private TextView button_division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Son los ID del activity_main.xml
        // Utilizaremos un casting Para hacer una convercion (EditText)
        // findViewById = Encuentra La vista por su ID con la clase R
        // R = Puente de comunicacion entre la parte logica y grafica
        // Se pone (TextView) = por que en la parte grafica se puso un boton de text view

        et1 = (EditText)findViewById(R.id.txt_numero1);
        et2 = (EditText)findViewById(R.id.txt_numero2);
        button_suma = (TextView)findViewById(R.id.txt_resultado);
        button_resta = (TextView)findViewById(R.id.txt_resultado);
        button_multiplicacion = (TextView)findViewById(R.id.txt_resultado);
        button_division = (TextView)findViewById(R.id.txt_resultado);
    }

        // El Void Devuelve Un Valor
        // Para recibir texto crearemos las variables con String
        // Parcear un componente a un String con un toString()
        // De Texto a String = toString()

    // Este Metodo Realiza La Suma
    public void Sumar(View view) {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        // Convirtiendo los valores en Enteros
        // Parcear un componente int con un Integer.paseInt(valor)
        // Pasar de String a Int = Integer.parseInt(valor)

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        // Declarando Variables De La Suma

        int suma = num1 + num2;

        // Mostrar Resultado

        // Parcear de entero a String EJ: String resultado = suma + "";
        // o como se hizo aqui abajo (Forma Porfesional)
        String resultado = String.valueOf(suma);
        button_suma.setText(resultado);
    }

    public void Restar(View view) {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        // Declarando Variables De La Resta

        int resta = num1 - num2;

        // Mostrar Resultado

        String resultado = String.valueOf(resta);
        button_resta.setText(resultado);

    }

    public void Multiplicar(View view) {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int multiplicar = num1 * num2;

        String resultado = String.valueOf(multiplicar);
        button_multiplicacion.setText(resultado);
    }

    public void Dividir(View view) {
        String valor1 = et1.getText().toString();
        String valor2 = et1.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int dividir = num1 / num2;

        String resultado = String.valueOf(dividir);
        button_division.setText(resultado);
    }
}