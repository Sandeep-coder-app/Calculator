package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button buttonAc, button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonback,
     buttonadd, buttonsub, buttonmul, buttondiv, buttonperm, buttonequal,buttonDot;

TextView viewtext;

float mValueOne, mValueTwo;

boolean operationAdd, operationSub, operationMul, operationDiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.zero);
        button1 = (Button) findViewById(R.id.one);
        button2 = (Button) findViewById(R.id.two);
        button3 = (Button) findViewById(R.id.three);
        button4 = (Button) findViewById(R.id.four);
        button5 = (Button) findViewById(R.id.five);
        button6 = (Button) findViewById(R.id.six);
        button7 = (Button) findViewById(R.id.sev);
        button8 = (Button) findViewById(R.id.eig);
        button9 = (Button) findViewById(R.id.nine);
        buttonAc = (Button) findViewById(R.id.AC);
        buttonback = (Button) findViewById(R.id.btnback);

        buttonadd = (Button) findViewById(R.id.add);
        buttonsub = (Button) findViewById(R.id.sub);
        buttonmul = (Button) findViewById(R.id.mul);
        buttondiv = (Button) findViewById(R.id.div);
        buttonperm = (Button) findViewById(R.id.per);
        buttonequal = (Button) findViewById(R.id.equal);
        buttonDot = (Button) findViewById(R.id.dot);

        viewtext = (TextView) findViewById(R.id.textView1);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewtext.setText(viewtext.getText() + "0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewtext.setText(viewtext.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewtext.setText(viewtext.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewtext.setText(viewtext.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewtext.setText(viewtext.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewtext.setText(viewtext.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewtext.setText(viewtext.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewtext.setText(viewtext.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewtext.setText(viewtext.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewtext.setText(viewtext.getText() + "9");
            }
        });

        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(viewtext == null){
                    viewtext.setText(" ");
                }else{
                    mValueOne = Float.parseFloat(viewtext.getText() + "");
                    operationAdd = true;
                    viewtext.setText(null);
                }
            }
        });

        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueOne = Float.parseFloat(viewtext.getText() + "");
                operationSub = true;
                viewtext.setText(null);
            }
        });

        buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueOne = Float.parseFloat(viewtext.getText() + "");
                operationMul = true;
                viewtext.setText(null);
            }
        });

        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueOne = Float.parseFloat(viewtext.getText() + "");
                operationDiv = true;
                viewtext.setText(null);
            }
        });

        buttonequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueTwo = Float.parseFloat(viewtext.getText() + "");

                if (operationAdd == true){
                    viewtext.setText(mValueOne + mValueTwo + "");
                    operationAdd = false;
                }

                if(operationSub == true){
                    viewtext.setText(mValueOne - mValueTwo + "");
                    operationSub = false;
                }

                if(operationMul == true){
                    viewtext.setText(mValueOne * mValueTwo + "");
                    operationMul = false;
                }

                if(operationDiv == true){
                    viewtext.setText(mValueOne / mValueTwo + "");
                    operationDiv = false;
                }
            }
        });

        buttonAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewtext.setText("");
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewtext.setText(viewtext.getText() +".");
            }
        });
    }
}