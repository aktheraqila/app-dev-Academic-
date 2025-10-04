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
        displayFunction()
    }

    private fun displayFunction() {
        val message: Message = intent.getStringExtra("Message") as Message
        val messagePreviewText = """
                Hi ${message.contactName},
                
                My name is ${message.displayName} and I am ${message.getFullJobDescription()}.
                
                I have a portfolio of apps to demonstrate my technical skills that I can show on request.
                
                I am able to start a new position ${message.getAvailabitity()}.
                
                Thanks and best regards.
            """.trimIndent()


        binding.textViewMessage.text = messagePreviewText
    }
}
