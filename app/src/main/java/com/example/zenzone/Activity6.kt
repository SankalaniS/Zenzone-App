package com.example.zenzone

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_6)

        val imageView4=findViewById<ImageView>(R.id.imageView4)
        imageView4.setOnClickListener{
            val Intent= Intent( this,Activity5::class.java)
            startActivity(Intent)
        }
        val imageView10=findViewById<ImageView>(R.id.imageView10)
        imageView10.setOnClickListener{
            val Intent= Intent( this,Activity14::class.java)
            startActivity(Intent)
        }
    }
}