package com.example.dell.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        number = findViewById(R.id.number);
        result = findViewById(R.id.displayId);
    }

    public void inputNumber(View view) {
        int n;
        n = Integer.parseInt(number.getText().toString());
        if ( n % 2 == 0){
            result.setText("Even");
        }
        else {
            result.setText("Odd");
        }
    }
}
