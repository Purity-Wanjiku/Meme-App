package com.example.memelord

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class memelord2 : AppCompatActivity() {
    lateinit var buttonprvv: Button
    lateinit var buttonnxtt: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memelord2)
        buttonprvv=findViewById(R.id.buttonprvv)
        buttonprvv.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        buttonnxtt=findViewById(R.id.buttonnxtt)
        buttonnxtt.setOnClickListener {
            val intent = Intent(this,memelord3::class.java)
            startActivity(intent)
        }
    }
}