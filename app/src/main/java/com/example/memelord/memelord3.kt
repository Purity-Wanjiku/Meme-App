package com.example.memelord

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class memelord3 : AppCompatActivity() {
    lateinit var buttonprvvv: Button
    lateinit var buttonnxttt: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memelord3)
        buttonprvvv=findViewById(R.id.buttonprvvv)
        buttonprvvv.setOnClickListener {
            val intent = Intent(this,memelord2::class.java)
            startActivity(intent)
        }
        buttonnxttt=findViewById(R.id.buttonnxttt)
        buttonnxttt.setOnClickListener {
            val intent = Intent(this,memelord4::class.java)
            startActivity(intent)
        }
    }
}