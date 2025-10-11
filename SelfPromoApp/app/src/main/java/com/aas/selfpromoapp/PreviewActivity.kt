package com.aas.selfpromoapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aas.selfpromoapp.databinding.ActivityPreviewBinding


class PreviewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPreviewBinding

    lateinit var message: Message
    lateinit var messagePreviewText: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPreviewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayFunction()
        setupButton()
    }

    private fun displayFunction() {
         message = intent.getStringExtra("Message") as Message
         messagePreviewText = """
                Hi ${message.contactName},
                
                My name is ${message?.displayName} and I am ${message.getFullJobDescription()}.
                
                I have a portfolio of apps to demonstrate my technical skills that I can show on request.
                
                I am able to start a new position ${message.getAvailabitity()}.
                
                Thanks and best regards.
            """.trimIndent()


        binding.textViewMessage.text = messagePreviewText
    }
    private fun setupButton(){

        binding.buttonSendMessage.setOnClickListener {

            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("smsto:") // This ensures only SMS apps respond
                putExtra("sms body", message)
            }
        }


    }
}
