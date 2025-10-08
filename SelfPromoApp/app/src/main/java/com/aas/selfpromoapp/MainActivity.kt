package com.aas.selfpromoapp

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
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

        val spinnerValues:Array<String> = arrayOf("Android Developer", "Android engineer")
        val spinnerAdapter = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item, spinnerValues )
        binding.spinnerJobTitle.adapter = spinnerAdapter
    }


    private fun onPreviewClicked() {

            val message = Message(
                contactName = binding.editTextContactName.text.toString(),
                binding.editTextContactNumber.text.toString(),
                binding.editTextMyDisplayName.text.toString(),
                binding.checkBoxJunior.isChecked,
                binding.spinnerJobTitle.selectedItem?.toString(),
                binding.checkBoxImmediateStart.isChecked,
                binding.editTextStartDate.text.toString()

            )

            val previewActivityIntent = Intent(this, PreviewActivity::class.java)
            previewActivityIntent.putExtra("Message", message)
            startActivity(previewActivityIntent)


        }

    }
