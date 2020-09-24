package com.example.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView op1;
    TextView op2;
     TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button miboton=findViewById(R.id.buttonCambiar);
        op1=findViewById(R.id.editTextNumbe1);
        op2=findViewById(R.id.editTextNumber2);
        textViewResultado=findViewById(R.id.textViewResultado);

        //texto=findViewById(R.id.textViewCartel);

        miboton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double res=Double.parseDouble(op1.getText().toString()+op2.getText().toString());

                textViewResultado.setText(String.valueOf(res));

            }
        });

       /* miboton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(texto.getText()=="Adios Mundo"){
                    texto.setText("Hola Mundo");
                }
                else{
                    texto.setText("Adios Mundo");
                }
            }
        });
        */


       
    }
}