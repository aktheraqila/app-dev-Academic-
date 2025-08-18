package com.aas.selfpromoapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.aas.selfpromoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonPreview.setOnClickListener {
            onPreviewClicked()
        }
    }

    // This function is called when the "Preview" button is clicked.
    // It collects the input data from the UI elements and displays it in a Toast message.
    // In a real application, you might want to pass this data to another activity or fragment
    // for further processing or display.
    private fun onPreviewClicked() {

            val contactName = binding.editTextContactName.text.toString()
            val contactNumber = binding.editTextContactNumber.text.toString()
            val displayName = binding.editTextMyDisplayName.text.toString()
            val includeJunior = binding.checkBoxJunior.isChecked
            val jobTitle = binding.spinnerJobTitle.selectedItem?.toString()
            val immediateStart = binding.checkBoxImmediateStart.isChecked
            val startDate = binding.editTextStartDate.text.toString()

            val testString = "Contact Name: $contactName, Contact Number: $contactNumber, My Display Name: $displayName, Include Junior: $includeJunior, Job Title: $jobTitle, Immediate Start: $immediateStart, Start Date: $startDate"
            Toast.makeText(this, testString, Toast.LENGTH_LONG).show()
        }

    }
