package com.unimag.a01optativa_android;

import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class operacionesActivity extends AppCompatActivity {
    protected Button botonsuma, botonResta, botonMultiplicacion, botonDivi, botonMCM, botonMCD, botonMayor;
    protected TextView textResultado;
    protected EditText numero1, numero2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textResultado = findViewById(R.id.textresultado);
        numero1 = findViewById(R.id.numero1);
        numero2 = findViewById(R.id.numero2);
        botonsuma = findViewById(R.id.botonsuma);
        botonResta = findViewById(R.id.botonresta);
        botonMultiplicacion = findViewById(R.id.botonmultiplicacion);
        botonDivi = findViewById(R.id.botondivision);
        botonMCM = findViewById(R.id.botonMCM);
        botonMCD = findViewById(R.id.botonMCD);
        botonMayor = findViewById(R.id.botonmayor);

        botonsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!numero1.getText().toString().isEmpty() && !numero2.getText().toString().isEmpty()){
                    int valor1 = Integer.parseInt(numero1.getText().toString());
                    int valor2 = Integer.parseInt(numero2.getText().toString());
                    int resultado = valor1 + valor2;
                    textResultado.setText(String.valueOf(resultado));
                }
            }
        });

        botonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!numero1.getText().toString().isEmpty() && !numero2.getText().toString().isEmpty()){
                    int valor1 = Integer.parseInt(numero1.getText().toString());
                    int valor2 = Integer.parseInt(numero2.getText().toString());
                    int resultado = valor1 - valor2;
                    textResultado.setText(String.valueOf(resultado));
                }
            }
        });

        botonMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!numero1.getText().toString().isEmpty() && !numero2.getText().toString().isEmpty()){
                    int valor1 = Integer.parseInt(numero1.getText().toString());
                    int valor2 = Integer.parseInt(numero2.getText().toString());
                    int resultado = valor1 * valor2;
                    textResultado.setText(String.valueOf(resultado));
                }
            }
        });

        botonDivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!numero1.getText().toString().isEmpty() && !numero2.getText().toString().isEmpty()){
                    int valor1 = Integer.parseInt(numero1.getText().toString());
                    int valor2 = Integer.parseInt(numero2.getText().toString());
                    int resultado = valor1 / valor2;
                    textResultado.setText(String.valueOf(resultado));
                }
            }
        });

        botonMCM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!numero1.getText().toString().isEmpty() && !numero2.getText().toString().isEmpty()){
                    int valor1 = Integer.parseInt(numero1.getText().toString());
                    int valor2 = Integer.parseInt(numero2.getText().toString());
                    int resultado = 1, i = 2;
                    while(i <= valor1 || i <= valor2) {
                        if(valor1%i==0 || valor2%i==0)
                        {
                            resultado=resultado*i;
                            if(valor1%i==0) valor1=valor1/i;
                            if(valor2%i==0) valor2=valor2/i;
                        }
                        else
                            i=i+1;
                    }
                    textResultado.setText(String.valueOf(resultado));
                }
            }
        });

        botonMCD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!numero1.getText().toString().isEmpty() && !numero2.getText().toString().isEmpty()){
                    int valor1 = Integer.parseInt(numero1.getText().toString());
                    int valor2 = Integer.parseInt(numero2.getText().toString());
                    int resultado = valor1;
                    while(resultado != valor2) {
                        if(resultado>valor2) {
                            resultado = resultado - valor2;
                        }else {
                            valor2 = valor2 - resultado;
                        }
                    }
                    textResultado.setText(String.valueOf(resultado));
                }
            }
        });

        botonMayor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!numero1.getText().toString().isEmpty() && !numero2.getText().toString().isEmpty()){
                    int valor1 = Integer.parseInt(numero1.getText().toString());
                    int valor2 = Integer.parseInt(numero2.getText().toString());

                    if(valor1 > valor2){
                        String resultado = "El mayor es: " + valor1;
                        textResultado.setText(resultado);
                    }else if(valor2 > valor1){
                        String resultado = "El mayor es: " + valor2;
                        textResultado.setText(resultado);
                    }else{
                        String resultado = "Los numeros son iguales";
                        textResultado.setText(resultado);
                    }
                }
            }
        });
    }
}
