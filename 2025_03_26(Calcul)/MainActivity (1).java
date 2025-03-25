package com.example.pictures;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView textview;
    String resultValue;
    boolean on = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // textview에 id값 넣어주기
        textview = findViewById(R.id.textView);
    }
    // 숫자 트리거
    public void zeroB(View view) {
        if (on) {
            textview.setText("0");
            on = false;
        }
        else textview.setText(textview.getText()+"0");
    }
    public void oneB(View view) {
        if (on) { textview.setText("1");
            on = false;
        }
        else textview.setText(textview.getText()+"1");
    }
    public void twoB(View view) {
        if (on) { textview.setText("2");
            on = false;
        }
        else textview.setText(textview.getText()+"2");
    }
    public void threeB(View view) {
        if (on) { textview.setText("3");
            on = false;
        }
        else textview.setText(textview.getText()+"3");
    }
    public void fourB(View view) {
        if (on) { textview.setText("4");
            on = false;
        }
        else textview.setText(textview.getText()+"4");
    }
    public void fiveB(View view) {
        if (on) { textview.setText("5");
            on = false;
        }
        else textview.setText(textview.getText()+"5");
    }
    public void sixB(View view) {
        if (on) { textview.setText("6");
            on = false;
        }
        else textview.setText(textview.getText()+"6");
    }
    public void sevenB(View view) {
        if (on) { textview.setText("7");
            on = false;
        }
        else textview.setText(textview.getText()+"7");
    }
    public void eightB(View view) {
        if (on) { textview.setText("8");
            on = false;
        }
        else textview.setText(textview.getText()+"8");
    }
    public void nineB(View view) {
        if (on) { textview.setText("9");
            on = false;
        }
        else textview.setText(textview.getText()+"9");
    }

    //연산자 트리거
    public void DivideB(View view) {
        textview.setText(textview.getText()+"/");
    }
    public void subtractionB(View view) {
        textview.setText(textview.getText()+"-");
    }
    public void plusB(View view) {
        textview.setText(textview.getText()+"+");
    }
    public void dotB(View view) {
        textview.setText(textview.getText()+".");
    }
    public void multiplicationB(View view) {
        textview.setText(textview.getText()+"*");
    }
    public void sameB(View view) {
        on = true;

        int i = 0;
        double num = 0;
        char last = '+';
        double result = 0;
        double temp = 0;
        resultValue = textview.getText().toString();

        while (i <= resultValue.length()) {
            char ch = (i < resultValue.length()) ? resultValue.charAt(i) : '=';
            // 끝에서 강제로 '='(연산 끝) 넣어서 마지막 숫자 처리

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
                // 숫자 1의 자리 이상인거 옆에 붙여주기
            } else {
                // 숫자가 끝나고 연산자가 등장했을 때, 이전 연산 수행
                if (last == '+') {
                    result += temp;
                    temp = num;
                } else if (last == '-') {
                    result += temp;
                    temp = -num;
                } else if (last == '*') {
                    temp *= num;
                } else if (last == '/') {
                    temp /= num;
                }

                last = ch;
                num = 0;
            }

            i++;
        }

        result += temp; // 마지막 값 반영

        textview.setText(String.valueOf(result));
    }
    public void cancleB(View view) {
        textview.setText("");
    }

}
