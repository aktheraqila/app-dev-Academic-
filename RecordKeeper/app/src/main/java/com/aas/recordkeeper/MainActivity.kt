package com.aas.recordkeeper

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import com.aas.recordkeeper.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.commit {
            add(binding.frameContent.id, RunningFragment())
        }

        binding.buttonCycling.setOnClickListener { onlyCyclcingClicked() }
        binding.buttonRunning.setOnClickListener { onlyRunningClicked() }

    }
}

private fun MainActivity.onlyCyclcingClicked() {
}

private fun MainActivity.onlyRunningClicked() {
}
