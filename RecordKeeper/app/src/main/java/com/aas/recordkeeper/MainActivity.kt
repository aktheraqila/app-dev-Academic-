package com.aas.recordkeeper

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aas.recordkeeper.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNav = findViewById(R.id.bottom_nav)
        binding.frameContent
    }
}