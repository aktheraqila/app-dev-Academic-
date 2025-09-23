package com.aas.selfpromoapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aas.selfpromoapp.databinding.ActivityPreviewBinding


class PreviewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPreviewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPreviewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val message: Message = intent.getStringExtra("Message") as Message

        binding.textViewMessage.text = "We are manually setting some text in our Textview just so we can see something!"


    }
    }
