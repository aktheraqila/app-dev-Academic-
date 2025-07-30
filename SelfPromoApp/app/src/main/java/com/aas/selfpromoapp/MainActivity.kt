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

    private fun onPreviewClicked() {

        val contactName = binding.editTextContactName.text.toString()
            val contactNumber = binding.editTextContactNumber.text.toString()
            val displayName = binding.editTextMyDisplayName.text.toString()
            val includeJunior = binding.checkBoxJunior.isChecked
            val jobTitle = binding.spinnerJobTitle.selectedItem?.toString()
            val immediateStart = binding.checkBoxImmediateStart.isChecked
            val startDate = binding.editTextStartDate.text.toString()

            // Display the collected data in a Toast for testing purposes
            val testString = "Contact Name: $contactName, Contact Number: $contactNumber, My Display Name: $displayName, Include Junior: $includeJunior, Job Title: $jobTitle, Immediate Start: $immediateStart, Start Date: $startDate"
            Toast.makeText(this, testString, Toast.LENGTH_LONG).show()
        }

    }
