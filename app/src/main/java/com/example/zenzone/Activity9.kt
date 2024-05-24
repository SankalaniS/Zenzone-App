package com.example.zenzone

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity9 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_9)

        val imageView24=findViewById<ImageView>(R.id.imageView24)
        imageView24.setOnClickListener {
            val Intent = Intent(this, Activity5::class.java)
            startActivity(Intent)
        }
        val imageView26=findViewById<ImageView>(R.id.imageView26)
        imageView26.setOnClickListener {
            val Intent = Intent(this, Activity14::class.java)
            startActivity(Intent)
        }
        val imageView28=findViewById<ImageView>(R.id.imageView28)
        imageView28.setOnClickListener {
            val Intent = Intent(this, Activity10::class.java)
            startActivity(Intent)
        }
        val imageView29=findViewById<ImageView>(R.id.imageView29)
        imageView29.setOnClickListener {
            val Intent = Intent(this, Activity8::class.java)
            startActivity(Intent)
        }
    }
}