package com.aas.selfpromoapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.aas.selfpromoapp.R.layout.activity_main
import com.google.android.material.textfield.TextInputEditText


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)
        val previewButton: Button = findViewById(R.id.button_preview)
        previewButton.setOnClickListener {

            onPReviewClicked()
        }

    }

    private fun onPReviewClicked() {

        val contactNameEditText: TextInputEditText = findViewById(R.id.edit_text_contact_name);
        val contactNumberEditText: TextInputEditText = findViewById(R.id.edit_text_contact_number);
        val testString = contactNameEditText.text.toString() + ": " + contactNumberEditText.text.toString()
        Toast.makeText(this, testString, Toast.LENGTH_LONG ).show()
    }
}