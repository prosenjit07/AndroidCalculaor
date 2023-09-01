package com.android.prosenjit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText fNumEditText, sNumEditText;
    TextView outputTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fNumEditText = findViewById(R.id.firstNumber);
        sNumEditText = findViewById(R.id.secondNumber);
        outputTextView = findViewById(R.id.output);
    }
    public void myButton(View view) {
        double fNum = Double.parseDouble(fNumEditText.getText().toString());
        double sNum = Double.parseDouble(sNumEditText.getText().toString());
        double result=0;
        if(view.getId()==(R.id.sumButtonID)){
            result= fNum+sNum;
        }
        else if(view.getId()==(R.id.subButtonID)){
            result= fNum-sNum;
        }
        else if(view.getId()==(R.id.mulButtonID)){
            result= fNum*sNum;
        }
        else if(view.getId()==(R.id.divButtonID)){
            result= fNum/sNum;
        }
        String mal =String.format("%.2f",result);
        outputTextView.setText("Result is: "+mal);
        //Toast.makeText(this, "Output is: "+result, Toast.LENGTH_SHORT).show();
    }
}