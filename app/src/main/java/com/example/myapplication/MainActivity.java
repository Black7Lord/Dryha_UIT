package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3, button4, button5, button6, button7, button8,
            button9, buttonPlus, button0, buttonMinus, buttonMult, buttonDiv, buttonRes, buttonC;
    TextView textView;
    String temp = "";
    float flTemp = 0;
    List<String> pr = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonPlus = findViewById(R.id.buttonPlus);
        button0 = findViewById(R.id.button0);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonMult = findViewById(R.id.buttonMult);
        buttonDiv = findViewById(R.id.buttonDiv);
        buttonRes = findViewById(R.id.buttonRes);
        buttonC = findViewById(R.id.buttonC);

        initBtnsListener();

    }

    public void initBtnsListener() {
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = "";
                flTemp = 0;
                pr.clear();
                textView.setText(temp);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp += "1";
                textView.setText(temp);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp += "2";
                textView.setText(temp);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp += "3";
                textView.setText(temp);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp += "4";
                textView.setText(temp);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp += "5";
                textView.setText(temp);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp += "6";
                textView.setText(temp);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp += "7";
                textView.setText(temp);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp += "8";
                textView.setText(temp);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp += "9";
                textView.setText(temp);
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pr.add(textView.getText().toString());
                pr.add("+");
                textView.setText("");
                temp = "";
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp += "0";
                textView.setText(temp);
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pr.add(textView.getText().toString());
                pr.add("-");
                textView.setText("");
                temp = "";
            }
        });

        buttonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pr.add(textView.getText().toString());
                pr.add("*");
                textView.setText("");
                temp = "";
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pr.add(textView.getText().toString());
                pr.add("/");
                textView.setText("");
                temp = "";
            }
        });

        buttonRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pr.add(textView.getText().toString());
                switch (pr.get(1)) {
                    case ("+"):
                        flTemp = Integer.parseInt(pr.get(0)) +
                                Integer.parseInt(pr.get(2));
                        textView.setText(String.valueOf(flTemp));
                        break;
                    case ("-"):
                        flTemp = Integer.parseInt(pr.get(0)) -
                                Integer.parseInt(pr.get(2));
                        textView.setText(String.valueOf(flTemp));
                        break;
                    case ("*"):
                        flTemp = Integer.parseInt(pr.get(0)) *
                                Integer.parseInt(pr.get(2));
                        textView.setText(String.valueOf(flTemp));
                        break;
                    case ("/"):
                        if (pr.get(2).equals("0")) {
                            textView.setText("Error!"); break;
                        } else {flTemp = (Float.parseFloat(pr.get(0)) /
                                                        Float.parseFloat(pr.get(2)));
                        textView.setText(String.valueOf(flTemp)); break;}
                }
                pr.clear();
                }
            });
    }
}
