package com.android.prosenjit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.Math;

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
        try {
            double fNum = Integer.parseInt(fNumEditText.getText().toString());
            double sNum = Integer.parseInt(sNumEditText.getText().toString());
            double result = 0;

            if (view.getId() == (R.id.sumButtonID)) {
                result = fNum + sNum;
            } else if (view.getId() == (R.id.subButtonID)) {
                result = fNum - sNum;
            } else if (view.getId() == (R.id.mulButtonID)) {
                result = fNum * sNum;
            } else if (view.getId() == (R.id.divButtonID)) {
                if (sNum != 0) {
                    result = fNum / sNum;
                } else {
                    Toast.makeText(this, "Division by zero is not allowed.", Toast.LENGTH_SHORT).show();
                    return; // Exit the method
                }
            } else if (view.getId() == (R.id.modButtonID)) {
                    result = fNum % sNum;
            } else if (view.getId() == (R.id.xorButtonID))  {
              //result = (int) Math.round(fNum) ^ (int) Math.round(sNum);
                result = (int)(fNum) ^ (int)sNum;
            } else if (view.getId() == (R.id.andButtonID)) {
                result = (int)(fNum) & (int)sNum;
            } else if (view.getId() == (R.id.orButtonID)) {
                result = (int)(fNum) | (int)sNum;
            }
            String mal = String.format("%d", (int) result);
            outputTextView.setText("Result is: " + mal);
        } catch (Exception e) {
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }
    }
}