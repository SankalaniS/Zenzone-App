package com.example.zenzone

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Activity11 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_11)

        val imageView51=findViewById<ImageView>(R.id.imageView51)
        imageView51.setOnClickListener {
            val Intent = Intent(this, Activity5::class.java)
            startActivity(Intent)
        }
        val imageView52=findViewById<ImageView>(R.id.imageView52)
        imageView52.setOnClickListener {
            val Intent = Intent(this, Activity14::class.java)
            startActivity(Intent)
        }
        val imageView67=findViewById<ImageView>(R.id.imageView67)
        imageView67.setOnClickListener {
            val Intent = Intent(this, Activity7::class.java)
            startActivity(Intent)
        }
    }
}