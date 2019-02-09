package com.example.user.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    //変数の定義
    double num[] = new double[3];   //入力した数字
    char mode[] = new char[3];   //今の四則演算記号
    int ans;    //答え
    int state;  //入れてる変数の番号
    String numtext = "";

    //部品の定義
    TextView text;
    Button button_1;
    Button button_plus;
    Button button_enter;
    Button button_AC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.textView);
        button_1 = findViewById(R.id.button_1);
        button_plus = findViewById(R.id.button_puls);
        button_enter = findViewById(R.id.button_enter);
        button_AC = findViewById(R.id.button_AC);

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = text.getText().toString();
                temp = temp + "1";
                numtext = numtext + "1";
                text.setText(temp);
            }
        });

        button_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mode[state] = '+';   //加算

                num[state] = Integer.parseInt(numtext);
                numtext = "";

                String temp = text.getText().toString();
                temp = temp + "+";
                text.setText(temp);

                state++;
            }
        });

        button_enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //最後の数字を変換
                num[state] = Integer.parseInt(numtext);
                numtext = "";

                if (state == 0){
                    return;
                }

                //計算
                switch (mode[0]) {
                    case '+':
                        ans = (int)num[0] + (int)num[1];
                        break;
                }

                //表示
                state = 0;
                text.setText(String.valueOf(ans));

                num[state] = ans;
                numtext = String.valueOf(ans);
            }
        });

        button_AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                state = 0;
                num[0] = 0;
                numtext = "";
                text.setText("");
            }
        });
    }
}
