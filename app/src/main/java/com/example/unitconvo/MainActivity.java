package com.example.unitconvo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button button;
private TextView textView;
private EditText editText;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button =findViewById(R.id.button);
        textView =findViewById(R.id.textView);
        editText=findViewById(R.id.editText);
//        button.setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("SetTextI18n")
//            @Override
//            public void onClick(View v) {
////                Toast.makeText(MainActivity.this, "Hi CLick is Generated", Toast.LENGTH_SHORT).show();
//                String s = editText.getText().toString();
//                int kg =Integer.parseInt(s);
//                double pound = 2.205*kg;
//                textView.setText("The Corresponding Value In Pound is :"+pound);
//            }
//        });

    }
    @SuppressLint("SetTextI18n")
    public void calculate(View view){
        String s = editText.getText().toString();
        int kg =Integer.parseInt(s);
        double pound = 2.205*kg;
        textView.setText("The Corresponding Value In Pound is :"+pound);
        Toast.makeText(this, "Thanks For Using This App", Toast.LENGTH_SHORT).show();
    }
}