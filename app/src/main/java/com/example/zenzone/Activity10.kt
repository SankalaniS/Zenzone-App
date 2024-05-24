package com.example.zenzone

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Activity10 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_10)

        val imageView30 = findViewById<ImageView>(R.id.imageView30)
        imageView30.setOnClickListener {
            val Intent = Intent(this, Activity5::class.java)
            startActivity(Intent)
        }
        val imageView31 = findViewById<ImageView>(R.id.imageView31)
        imageView31.setOnClickListener {
            val Intent = Intent(this, Activity14::class.java)
            startActivity(Intent)
        }
        val imageView33 = findViewById<ImageView>(R.id.imageView33)
        imageView33.setOnClickListener {
            val Intent = Intent(this, Activity9::class.java)
            startActivity(Intent)
        }
    }
}