package com.example.zenzone

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity8 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_8)

        val imageView23=findViewById<ImageView>(R.id.imageView23)
        imageView23.setOnClickListener {
            val Intent = Intent(this, Activity7::class.java)
            startActivity(Intent)
        }
        val imageView20=findViewById<ImageView>(R.id.imageView20)
        imageView20.setOnClickListener {
            val Intent = Intent(this, Activity5::class.java)
            startActivity(Intent)
        }
        val imageView21=findViewById<ImageView>(R.id.imageView21)
        imageView21.setOnClickListener {
            val Intent = Intent(this, Activity14::class.java)
            startActivity(Intent)
        }
        val imageView25=findViewById<ImageView>(R.id.imageView25)
        imageView25.setOnClickListener {
            val Intent = Intent(this, Activity9::class.java)
            startActivity(Intent)
        }
    }
}