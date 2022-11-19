package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Add(View v){
        EditText et1 =(EditText)findViewById(R.id.editTextNumber);
        EditText et2 =(EditText)findViewById(R.id.editTextNumber2);
        EditText et3 =(EditText)findViewById(R.id.editTextNumber3);
        EditText et4 =(EditText)findViewById(R.id.editTextNumber4);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int n3 = Integer.parseInt(et3.getText().toString());
        int result = n1+n2+n3;

        et4.setText("Sum Value : "+ result);
    }

    public void Subtract(View v){
        EditText et1 =(EditText)findViewById(R.id.editTextNumber);
        EditText et2 =(EditText)findViewById(R.id.editTextNumber2);
        EditText et3 =(EditText)findViewById(R.id.editTextNumber3);
        EditText et4 =(EditText)findViewById(R.id.editTextNumber4);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int n3 = Integer.parseInt(et3.getText().toString());
        int result = n1-n2-n3;

        et4.setText("Difference Value : "+ result);
    }

    public void Multiply(View v){
        EditText et1 =(EditText)findViewById(R.id.editTextNumber);
        EditText et2 =(EditText)findViewById(R.id.editTextNumber2);
        EditText et3 =(EditText)findViewById(R.id.editTextNumber3);
        EditText et4 =(EditText)findViewById(R.id.editTextNumber4);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int n3 = Integer.parseInt(et3.getText().toString());
        int result = n1*n2*n3;

        et4.setText("Product Value : "+ result);
    }

    public void Division(View v){
        EditText et1 =(EditText)findViewById(R.id.editTextNumber);
        EditText et2 =(EditText)findViewById(R.id.editTextNumber2);
        EditText et3 =(EditText)findViewById(R.id.editTextNumber3);
        EditText et4 =(EditText)findViewById(R.id.editTextNumber4);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int n3 = Integer.parseInt(et3.getText().toString());
        int result = n1/n2/n3;

        et4.setText("Quotient Value : "+ result);
    }

}