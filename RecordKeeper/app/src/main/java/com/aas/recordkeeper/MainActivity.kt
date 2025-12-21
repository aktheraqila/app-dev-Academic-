package com.aas.recordkeeper

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import com.aas.recordkeeper.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


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
    