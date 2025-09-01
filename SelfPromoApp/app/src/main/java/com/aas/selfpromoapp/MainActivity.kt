package com.aas.selfpromoapp

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
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
        val spinnerValues:Array<String> = arrayOf("our", "array", "values")
        val spinnerAdapter = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item, spinnerValues )
        binding.spinnerJobTitle.adapter = spinnerAdapter
    }


    private fun onPreviewClicked() {

            val contactName = binding.editTextContactName.text.toString()
            val contactNumber = binding.editTextContactNumber.text.toString()
            val displayName = binding.editTextMyDisplayName.text.toString()
            val includeJunior = binding.checkBoxJunior.isChecked
            val jobTitle = binding.spinnerJobTitle.selectedItem?.toString()
            val immediateStart = binding.checkBoxImmediateStart.isChecked
            val startDate = binding.editTextStartDate.text.toString()

            val previewActivityIntent = Intent(this, PreviewActivity::class.java)
            previewActivityIntent.putExtra("Contact Name", contactName)
            previewActivityIntent.putExtra("Contact Number", contactNumber)
            previewActivityIntent.putExtra("My Display Name", displayName)
            previewActivityIntent.putExtra("Include Junior", includeJunior)
            previewActivityIntent.putExtra("Job Title", jobTitle)
            previewActivityIntent.putExtra("Immediate Start", immediateStart)
            previewActivityIntent.putExtra("Start Date", startDate)
            startActivity(previewActivityIntent)


//            val testString = "Contact Name: $contactName, Contact Number: $contactNumber, My Display Name: $displayName, Include Junior: $includeJunior, Job Title: $jobTitle, Immediate Start: $immediateStart, Start Date: $startDate"
//            Toast.makeText(this, testString, Toast.LENGTH_LONG).show()
        }

    }
