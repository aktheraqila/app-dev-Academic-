package com.aas.simply_calculate;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText inchesEditText;
    Button calculateButton;
    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        findViews();
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inchesString = inchesEditText.getText().toString();
                if (inchesString.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please input a value", Toast.LENGTH_LONG).show();
                }else{
                    double result = calculateHeight(inchesString);
                    displayResult(result);

                }
            }
        });

    }
    private void findViews() {
        inchesEditText = findViewById(R.id.textEditInches);
        calculateButton = findViewById(R.id.buttonCalculate);
        resultTextView = findViewById(R.id.viewTextResult);
    }
    private void displayResult(double result) {
        DecimalFormat myFormatter = new DecimalFormat("0.00");
        String resultString = myFormatter.format(result);
        resultTextView.setText(resultString + " meters");
    }

    private double calculateHeight(String inchesString) {
        int inches = Integer.parseInt(inchesString);
        return inches * 0.0254;

    }

}