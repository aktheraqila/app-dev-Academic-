package com.aas.recordkeeper

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import com.aas.recordkeeper.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


private fun BottomNavigationView.setOnItemSelectedListener(listener: MainActivity) {}

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNav.setOnItemSelectedListener(this)

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

    override fun onContextItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.nav_cycling) {

        } else if (item.itemId == R.id.nav_running){

        } else {

        }
    }
}

