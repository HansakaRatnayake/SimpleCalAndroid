package com.example.simplecalandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText lblNum1bar;
    EditText lblNum2bar;
    TextView txtAnswer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblNum1bar = findViewById(R.id.lblNum1bar);
        lblNum2bar = findViewById(R.id.lblNum2bar);
        txtAnswer = findViewById(R.id.txtAnswer);
    }


    public void calculate(View v) {

        String tag = v.getTag().toString();
        txtAnswer.setText(tag);

        String Num1 = lblNum1bar.getText().toString();
        double x = Double.parseDouble(Num1);

        String Num2 = lblNum2bar.getText().toString();
        double y = Double.parseDouble(Num2);

        double Answer = 0;

        switch (tag){

            case "add": Answer = x + y; break;
            case "minus": Answer = x - y; break;
            case "multi": Answer = x * y; break;
            case "devide": Answer = x / y; break;

        }
        txtAnswer.setText("" + Answer);
    }
}



