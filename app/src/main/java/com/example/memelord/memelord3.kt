package com.example.memelord

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class memelord3 : AppCompatActivity() {
    lateinit var buttonprv: Button
    lateinit var buttonnxt: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memelord3)
        buttonprv=findViewById(R.id.buttonprv)
        buttonprv.setOnClickListener {
            val intent = Intent(this,memelord2::class.java)
            startActivity(intent)
        }
        buttonnxt=findViewById(R.id.buttonprv)
        buttonnxt.setOnClickListener {
            val intent = Intent(this,memelord4::class.java)
            startActivity(intent)
        }
    }
}