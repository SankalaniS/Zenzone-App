package com.example.zenzone

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity14 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_14)

        val imageView47=findViewById<ImageView>(R.id.imageView47)
        imageView47.setOnClickListener {
            val Intent = Intent(this, Activity5::class.java)
            startActivity(Intent)
        }
    }
}