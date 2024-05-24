package com.example.zenzone

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity13 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_13)

        val imageView44=findViewById<ImageView>(R.id.imageView44)
        imageView44.setOnClickListener {
            val Intent = Intent(this, Activity5::class.java)
            startActivity(Intent)
        }
        val imageView45=findViewById<ImageView>(R.id.imageView45)
        imageView45.setOnClickListener {
            val Intent = Intent(this, Activity14::class.java)
            startActivity(Intent)
        }
    }
}