package com.example.calculadora2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0, btn_sum, btn_igual, btn_multi,
    btn_div, btn_clear, btn_rest, btn_punt;
    TextView pantalla;
    String res, n1, n2, op;
    Double d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_1 = findViewById(R.id.btn1);
        btn_1.setOnClickListener(numeros);
        btn_2 = findViewById(R.id.btn2);
        btn_2.setOnClickListener(numeros);
        btn_3 = findViewById(R.id.btn3);
        btn_3.setOnClickListener(numeros);
        btn_4 = findViewById(R.id.btn4);
        btn_4.setOnClickListener(numeros);
        btn_5 = findViewById(R.id.btn5);
        btn_5.setOnClickListener(numeros);
        btn_6 = findViewById(R.id.btn6);
        btn_6.setOnClickListener(numeros);
        btn_7 = findViewById(R.id.btn7);
        btn_7.setOnClickListener(numeros);
        btn_8 = findViewById(R.id.btn8);
        btn_8.setOnClickListener(numeros);
        btn_9 = findViewById(R.id.btn9);
        btn_9.setOnClickListener(numeros);
        btn_0 = findViewById(R.id.btn0);
        btn_0.setOnClickListener(numeros);
        btn_punt = findViewById(R.id.btnpunto);
        btn_punt.setOnClickListener(numeros);

        btn_rest = findViewById(R.id.btnrest);
        btn_rest.setOnClickListener(funciones);
        btn_sum = findViewById(R.id.btnmas);
        btn_sum.setOnClickListener(funciones);
        btn_div = findViewById(R.id.btndiv);
        btn_div.setOnClickListener(funciones);
        btn_multi= findViewById(R.id.btnmulti);
        btn_multi.setOnClickListener(funciones);
        btn_clear= findViewById(R.id.btnclear);
        btn_clear.setOnClickListener(funciones);
        btn_igual = findViewById(R.id.btnigual);
        btn_igual.setOnClickListener(Operaciones);
        pantalla = (TextView) findViewById(R.id.lblres);

    }

    View.OnClickListener funciones = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Button operacion = (Button) v;
            op = operacion.getText().toString();
            res = pantalla.getText().toString();
            n1 = res;
            String texto = operacion.getText().toString();
            switch (v.getId()){
                case R.id.btnmas:
                    pantalla.setText("");
                    break;
                case R.id.btnrest:
                    pantalla.setText("");
                    break;
                case R.id.btnmulti:
                    pantalla.setText("");
                    break;
                case R.id.btndiv:
                    pantalla.setText("");
                    break;
                case R.id.btnclear:
                    pantalla.setText("");
                    break;

            }


        }



    };
    View.OnClickListener Operaciones = new View.OnClickListener() {
        @Override
        public void onClick(View vh) {
        Button ope = (Button) vh;
        String texto = ope.getText().toString();
        n2 = pantalla.getText().toString();
        d = Double.parseDouble(n1) + Double.parseDouble(n2);

        switch (op) {
            case "/":
                d = Double.parseDouble(n1) / Double.parseDouble(n2);
                pantalla.setText(d.toString());
                break;
            case "*":
                d = Double.parseDouble(n1) * Double.parseDouble(n2);
                pantalla.setText(d.toString());
                break;
            case "-":
                d = Double.parseDouble(n1) - Double.parseDouble(n2);
                pantalla.setText(d.toString());
                break;
            case "+":
                d = Double.parseDouble(n1) + Double.parseDouble(n2);
                pantalla.setText(d.toString());
                break;


        }




        }
    };
    View.OnClickListener numeros = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        Button nums = (Button) v;
        String texto = nums.getText().toString();
        res = pantalla.getText().toString();
        if(pantalla.getText().toString() == "0" && texto == "0"){
            pantalla.setText("0");
        }
        else{
            res = res + texto;
            pantalla.setText(res);
        }
        }
    };
}
