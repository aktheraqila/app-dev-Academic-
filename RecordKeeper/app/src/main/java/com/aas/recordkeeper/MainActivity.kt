package com.aas.recordkeeper

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import com.aas.recordkeeper.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() , View.OnClickListener{
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCycling.setOnClickListener()

    }

    override fun onClick(v: View?) {
        if(v?.id ==R.id.button_cycling){
            Toast.makeText(this, "I have clicked on the Cycling button", Toast.LENGTH_LONG).show()

        }
        else if(v?.id ==R.id.button_running){
            Toast.makeText(this, "I have clicked on the Running button", Toast.LENGTH_LONG).show()

        }

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
    