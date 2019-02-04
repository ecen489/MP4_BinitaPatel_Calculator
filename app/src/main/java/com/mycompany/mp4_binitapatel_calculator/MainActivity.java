package com.mycompany.mp4_binitapatel_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    boolean Add, Sub, Mul;
    Float value1, value2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize buttons
        Button buttonDeci = (Button) findViewById(R.id.buttonDeci);
        Button button0 = (Button) findViewById(R.id.button0);
        Button button = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5) ;
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);
        Button buttonAdd = (Button) findViewById(R.id.buttonAdd);
        Button buttonSub = (Button) findViewById(R.id.buttonSub);
        Button buttonMul = (Button) findViewById(R.id.buttonMul);
        Button buttonEqual = (Button) findViewById(R.id.buttonEqual);
        Button buttonClear = (Button) findViewById(R.id.buttonClear);
        final EditText txt = (EditText) findViewById(R.id.editText);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Button0
                txt.setText(txt.getText() + "0");
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Button1
                txt.setText(txt.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Button2
                txt.setText(txt.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Button3
                txt.setText(txt.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Button4
                txt.setText(txt.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Button5
                txt.setText(txt.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Button6
                txt.setText(txt.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Button7
                txt.setText(txt.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Button8
                txt.setText(txt.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Button9
                txt.setText(txt.getText() + "9");
            }
        });
        buttonDeci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ButtonDeci
                txt.setText(txt.getText() + ".");
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ButtonAdd
                if(txt == null){
                    txt.setText(" ");
                }
                else{
                    value1 = Float.parseFloat(txt.getText() + "");
                    Add = true;
                    txt.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ButtonSub
                if(txt == null){
                    txt.setText(" ");
                }
                else{
                    value1 = Float.parseFloat(txt.getText() + "");
                    Sub = true;
                    txt.setText(null);
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ButtonMul
                if(txt == null){
                    txt.setText(" ");
                }
                else{
                    value1 = Float.parseFloat(txt.getText() + "");
                    Mul = true;
                    txt.setText(null);
                }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ButtonEqual
                value2 = Float.parseFloat(txt.getText() + "");
                if(Add == true){
                    txt.setText(value1 + value2 + "");
                    Add = false;
                }
                if(Sub == true){
                    txt.setText(value1 - value2 + "");
                    Sub = false;
                }
                if(Mul == true){
                    txt.setText(value1 * value2 + "");
                    Mul = false;
                }
            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ButtonClear
                txt.setText(null);
            }
        });
    }
}
