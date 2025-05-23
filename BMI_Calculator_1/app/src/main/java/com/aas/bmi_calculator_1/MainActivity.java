package com.aas.bmi_calculator_1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.aas.bmi_calculator_1.R;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    //Class Variables are also called 'fields'
    private TextView resultText;
    private Button calculateButton;
    private RadioButton radioButtonMale;
    private RadioButton radioButtonFemale;
    private EditText editTextHeightFeet;
    private EditText editTextHeightInches;
    private EditText editTextWeight;
    private EditText editTextAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        findViews();
        setupButtonListener();
    }

    private void findViews(){
        resultText = findViewById(R.id.text_view_result);
        radioButtonMale = findViewById(R.id.radio_button_male);
        radioButtonFemale = findViewById(R.id.radio_button_female);
        editTextHeightFeet = findViewById(R.id.edit_text_height_feet);
        editTextHeightInches = findViewById(R.id.edit_text_height_inches);
        editTextWeight = findViewById(R.id.edit_text_weight);
        editTextAge = findViewById(R.id.edit_text_age);
        calculateButton = findViewById(R.id.button_calculate);

    }
    private void setupButtonListener() {
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bmiResult = calculateBmi();

                String TextAge = editTextAge.getText().toString();
                int age = Integer.parseInt(TextAge);
                if (age < 18) {
                    displayGuidance(bmiResult);
                }
                else {
                    displayResult(bmiResult);
                }

            }
        });
    }



    private double calculateBmi() {
        String TextHeightFeet = editTextHeightFeet.getText().toString();
        String TextHeightInches = editTextHeightInches.getText().toString();
        String TextWeight = editTextWeight.getText().toString();


        //Convertung String to int variables

        int feet = Integer.parseInt(TextHeightFeet);
        int inches = Integer.parseInt(TextHeightInches);
        int weight = Integer.parseInt(TextWeight);


        int totalInches = (feet * 12) + inches;
        double heightInMeters = totalInches * 0.0254;
        return weight / (heightInMeters * heightInMeters);

    }
    private void displayResult(double bmi) {
        //We must convert the double to a string
        DecimalFormat myDecimalFormatter = new DecimalFormat("0.00");
        String bmiTextResult = myDecimalFormatter.format(bmi);


        String fullResultString;
        if(bmi < 18.5){
            //Display underweight
            fullResultString = bmiTextResult + " - You are underweight";
        }
        else if(bmi > 25){
            //Display overweight
            fullResultString = bmiTextResult + " - You are overweight";
        }
        else{
            fullResultString = bmiTextResult + " - You are healthy weight";
        }
        resultText.setText(fullResultString);
    }

    private void displayGuidance(double bmi) {
        DecimalFormat myDecimalFormatter = new DecimalFormat("0.00");
        String bmiTextResult = myDecimalFormatter.format(bmi);

        String fullResultString;
        if(radioButtonMale.isChecked()){
            //Display male guidance
            fullResultString = bmiTextResult + " -As you are under 18, consult your doctor for healthy range for boys";
        }
        else if(radioButtonFemale.isChecked()){
            //Display female guidance
            fullResultString = bmiTextResult + " -As you are under 18, consult your doctor for healthy range for girls";

        }
        else{
            //Display genera; guidance
            fullResultString = bmiTextResult + " -As you are under 18, consult your doctor for healthy range";

        }

        resultText.setText(fullResultString);

    }

}