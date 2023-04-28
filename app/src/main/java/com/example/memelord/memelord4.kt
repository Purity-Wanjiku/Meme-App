package com.example.memelord

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class memelord4 : AppCompatActivity() {
    lateinit var buttonprvvvv:Button
    lateinit var buttonnxtttt:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memelord4)
        buttonprvvvv=findViewById(R.id.buttonprvvvv)
        buttonprvvvv.setOnClickListener {
            val intent = Intent(this,memelord3::class.java)
            startActivity(intent)
        }
        buttonnxtttt=findViewById(R.id.buttonnxtttt)
        buttonnxtttt.setOnClickListener {
            val intent = Intent(this,memelord5::class.java)
            startActivity(intent)
        }
    }
}