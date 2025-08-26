package com.aas.selfpromoapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aas.selfpromoapp.databinding.ActivityPreviewBinding


class PreviewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPreviewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Inflate the layout for this activity using View Binding
        binding = ActivityPreviewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textViewMessage.text = "We are manually setting some text in our Textview just so we can see something!"

        val contactName: String? = intent.getStringExtra("Contact Name")
        val contactNumber: String? = intent.getStringExtra("Contact Number")
        val mydisplayName: String? = intent.getStringExtra("My Display")
        val includeJunior: Boolean = intent.getBooleanExtra("Include Junior", false)
        val jobTitle: String? = intent.getStringExtra("Job Title")
        val immediateStart: Boolean = intent.getBooleanExtra("Immediate Start", false)
        val startDate: String? = intent.getStringExtra("Start Date")
 }
    }
