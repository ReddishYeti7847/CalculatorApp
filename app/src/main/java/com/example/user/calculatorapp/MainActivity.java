package com.example.user.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    //変数の定義
    double num[] = new double[3];   //入力した数字
    int mode;   //今の四則演算記号
    int state;  //入れてる変数の番号や答え

    //部品の定義
    TextView text;
    Button button_1;
    Button button_plus;
    Button button_enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.textView);
        button_1 = findViewById(R.id.button_1);
        button_plus = findViewById(R.id.button_puls);
        button_enter = findViewById(R.id.button_enter);


    }
}
