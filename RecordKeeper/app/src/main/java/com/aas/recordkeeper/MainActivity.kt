package com.aas.recordkeeper

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.aas.recordkeeper.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.commit {
            replace(binding.frameContent.id, RunningFragment())
        }

        binding.buttonCycling.setOnClickListener { onlyCyclingClicked() }
        binding.buttonRunning.setOnClickListener { onlyRunningClicked() }

    }

    private fun onlyCyclingClicked() {
        supportFragmentManager.commit {
            replace(binding.frameContent.id, CyclingFragment())
        }

    }

    private fun onlyRunningClicked() {
        supportFragmentManager.commit {
            replace(binding.frameContent.id, RunningFragment())
        }
    }
}
    