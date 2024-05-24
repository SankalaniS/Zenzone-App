package com.example.zenzone

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_2)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val Intent = Intent(this, Activity3::class.java)
            startActivity(Intent)
        }
        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            val Intent = Intent(this, Activity15::class.java)
            startActivity(Intent)
        }
    }
}