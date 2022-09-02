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







    public void plus(View v){


        String Num1 = lblNum1bar.getText().toString();
        double x = Double.parseDouble(Num1);


        String Num2 = lblNum2bar.getText().toString();
        double y = Double.parseDouble(Num2);

        double Answer = x+y;


        txtAnswer.setText(""+ Answer);
    }



    public void minus(View v){

        EditText lblNum1bar = findViewById(R.id.lblNum1bar);
        String Num1 = lblNum1bar.getText().toString();
        double x = Double.parseDouble(Num1);

        EditText lblNum2bar = findViewById(R.id.lblNum2bar);
        String Num2 = lblNum2bar.getText().toString();
        double y = Double.parseDouble(Num2);

        double Answer = x-y;

        TextView txtAnswer = findViewById(R.id.txtAnswer);
        txtAnswer.setText(""+ Answer);


    }


    public void multiple(View v){

        EditText lblNum1bar = findViewById(R.id.lblNum1bar);
        String Num1 = lblNum1bar.getText().toString();
        double x = Double.parseDouble(Num1);

        EditText lblNum2bar = findViewById(R.id.lblNum2bar);
        String Num2 = lblNum2bar.getText().toString();
        double y = Double.parseDouble(Num2);

        double Answer = x*y;

        TextView txtAnswer = findViewById(R.id.txtAnswer);
        txtAnswer.setText(""+ Answer);


    }



    public void devide(View v){

        EditText lblNum1bar = findViewById(R.id.lblNum1bar);
        String Num1 = lblNum1bar.getText().toString();
        double x = Double.parseDouble(Num1);

        EditText lblNum2bar = findViewById(R.id.lblNum2bar);
        String Num2 = lblNum2bar.getText().toString();
        double y = Double.parseDouble(Num2);

        double Answer = x/y;

        TextView txtAnswer = findViewById(R.id.txtAnswer);
        txtAnswer.setText(""+ Answer);


    }



    public void reset(View v){

        double Num1 = 0;
        double Num2 = 0;
        double Answer = 0;

        EditText lblNum1bar = findViewById(R.id.lblNum1bar);
        lblNum1bar.setText(""+ Num1);

        EditText lblNum2bar = findViewById(R.id.lblNum2bar);
        lblNum2bar.setText(""+ Num2);

        TextView txtAnswer = findViewById(R.id.txtAnswer);
        txtAnswer.setText(""+ Answer);


    }
}