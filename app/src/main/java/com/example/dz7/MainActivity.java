package com.example.dz7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Integer first, second;
    private TextView tvResult;
    boolean isClickOperation = true;
    private String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = findViewById(R.id.tv_result);
    }

    public void onClickNumber(View view) {
        switch (view.getId()) {
            case R.id.btn_clean:
                //нажал на чистка
                tvResult.setText("0");
                isClickOperation = false;
                first=0;
                second=0;
                break;
            case R.id.btn_zero:
                //нажал на ноль
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("0");
                } else {
                    tvResult.append("0");
                }
                if (isClickOperation) {
                    tvResult.setText("0");
                }
                break;
            case R.id.btn_one:
                //нажал на еденицу
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("1");
                } else {
                    tvResult.append("1");
                }
                if (isClickOperation) {
                    tvResult.setText("1");
                }
                break;
            case R.id.btn_two:
                //нажал на двойку
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("2");
                } else {
                    tvResult.append("2");
                }
                if (isClickOperation) {
                    tvResult.setText("2");
                }
                break;
            case R.id.btn_three:
                //нажал на тройку
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("3");
                } else {
                    tvResult.append("3");
                }
                if (isClickOperation) {
                    tvResult.setText("3");
                }
                break;
            case R.id.btn_four:
                //нажал на четверку
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("4");
                } else {
                    tvResult.append("4");
                }
                if (isClickOperation) {
                    tvResult.setText("4");
                }
                break;
            case R.id.btn_fife:
                //нажал на пятерку
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("5");
                } else {
                    tvResult.append("5");
                }
                if (isClickOperation) {
                    tvResult.setText("5");
                }
                break;
            case R.id.btn_six:
                //нажал на шестерку
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("6");
                } else {
                    tvResult.append("6");
                }
                if (isClickOperation) {
                    tvResult.setText("6");
                }
                break;
            case R.id.btn_seven:
                //нажал на семерку
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("7");
                } else {
                    tvResult.append("7");
                }
                if (isClickOperation) {
                    tvResult.setText("7");
                }
                break;
            case R.id.btn_eight:
                //нажал на восемь
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("8");
                } else {
                    tvResult.append("8");
                }
                if (isClickOperation) {
                    tvResult.setText("8");
                }
                break;
            case R.id.btn_nine:
                //нажал на девять
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("9");
                } else {
                    tvResult.append("9");
                }
                if (isClickOperation) {
                    tvResult.setText("9");
                }
                break;

        }
        isClickOperation = false;
    }

    public void onClickOperation(View view) {
        switch (view.getId()) {
            case R.id.btn_equals:
                //нажал на равно
                second = Integer.parseInt(tvResult.getText().toString());
                Integer result = 0;
                switch (operation) {
                    case "+":
                        result = first + second;
                        break;
                    case "*":
                        result = first * second;
                        break;
                    case "-":
                        result = first - second;
                        break;
                    case "/":
                        result = first / second;
                        break;

                }
                tvResult.setText(result.toString());
                isClickOperation = true;
                break;
            case R.id.btn_plus:
                //нажал на плюс
                first = Integer.parseInt(tvResult.getText().toString());
                isClickOperation = true;
                operation = "+";
                break;
            case R.id.btn_minus:
                //нажал на минус
                first  = Integer.parseInt(tvResult.getText().toString());
                isClickOperation=true;
                operation = "-";
                break;
            case R.id.btn_multiplication:
                //нажал на умножение
                first  = Integer.parseInt(tvResult.getText().toString());
                isClickOperation=true;
                operation = "*";
                break;
            case R.id.btn_division:
                //нажал на деление
                first  = Integer.parseInt(tvResult.getText().toString());
                isClickOperation=true;
                operation = "/";
                break;
            case R.id.btn_percent:
                //нажал на процент
                break;
            case R.id.btn_plusMinus:
                //нажал на плюс и минус
                break;
            case R.id.btn_clean:
                //нажал на чистка
                break;

        }
    }
}