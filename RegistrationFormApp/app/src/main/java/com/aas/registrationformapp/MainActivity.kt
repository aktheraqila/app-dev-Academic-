package com.aas.registrationformapp

import android.app.Activity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.aas.registrationformapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupSpinner()
        setupButton()

    }


    private fun setupSpinner() {

        val titles = arrayOf("Miss", "Mrs", "Ms", "Mr", "Dr", "Prof")
        val titleAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, titles)
        binding.spinnerTitle.adapter = titleAdapter
    }

    private fun setupButton() {
        binding.buttonCreateAccount.setOnClickListener {
            createAccount()
        }
    }

    private fun createAccount(){
        val user = User(
        binding.spinnerTitle.selectedItem as String,
            binding.editTextFirstName.text.toString(),
            binding.editTextLastName.text.toString(),
            binding.editTextEmail.text.toString(),
            binding.editTextPhone.text.toString(),
            binding.editTextPassword.text.toString()
        )

    }
}