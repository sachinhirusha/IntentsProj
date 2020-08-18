package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView result;
    int res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String num1 =
                intent.getStringExtra(FirstActivity.EXTRA_MESSAGE1);
        String num2 =
                intent.getStringExtra(FirstActivity.EXTRA_MESSAGE2);

        EditText editText = findViewById(R.id.tv1);
        EditText editText1 = findViewById(R.id.tv2);
        editText.setText(num1);
        editText1.setText(num2);


    }



    public void Add(View v){
        EditText editText5 = findViewById(R.id.tv1);
        EditText editText6 = findViewById(R.id.tv2);
        result = findViewById(R.id.txt1);
        String number1 = editText5.getText().toString();
        int finalnumber1 = Integer.parseInt(number1);
        String number2 = editText6.getText().toString();
        int finalnumber2 = Integer.parseInt(number2);
        res = finalnumber1 + finalnumber2;
        result.setText(Integer.toString(res));



    }
    public void sub(View v1){
        EditText editText7 = findViewById(R.id.tv1);
        EditText editText8 = findViewById(R.id.tv2);
        result = findViewById(R.id.txt1);
        String number1 = editText7.getText().toString();
        int finalnumber1 = Integer.parseInt(number1);
        String number2 = editText8.getText().toString();

        int finalnumber2 = Integer.parseInt(number2);
        if(finalnumber1 > finalnumber2) {
            res = finalnumber1 - finalnumber2;
        }
        else if(finalnumber2 > finalnumber1){
            res = finalnumber2 - finalnumber1;
        }

        result.setText(Integer.toString(res));

    }
    public void multi(View v3){
        EditText editText2 = findViewById(R.id.tv1);
        EditText editText3 = findViewById(R.id.tv2);
        result = findViewById(R.id.txt1);
        String number1 = editText2.getText().toString();
        int finalnumber1 = Integer.parseInt(number1);
        String number2 = editText3.getText().toString();
        int finalnumber2 = Integer.parseInt(number2);
        res = finalnumber1 * finalnumber2;
        result.setText(Integer.toString(res));


    }
    public void div(View v4) {
        EditText editText10 = findViewById(R.id.tv1);
        EditText editText11 = findViewById(R.id.tv2);
        result = findViewById(R.id.txt1);
        String number1 = editText10.getText().toString();
        int finalnumber1 = Integer.parseInt(number1);
        String number2 = editText11.getText().toString();
        int finalnumber2 = Integer.parseInt(number2);
        res = finalnumber1 / finalnumber2;
        result.setText(Integer.toString(res));
    }

}