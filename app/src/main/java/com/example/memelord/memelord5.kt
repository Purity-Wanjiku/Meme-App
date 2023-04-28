package com.example.memelord

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class memelord5 : AppCompatActivity() {
    lateinit var buttonprvvvvv: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memelord5)
        buttonprvvvvv=findViewById(R.id.buttonprvvvvv)
        buttonprvvvvv.setOnClickListener {
            val intent = Intent(this,memelord4::class.java)
            startActivity(intent)
        }
    }
}