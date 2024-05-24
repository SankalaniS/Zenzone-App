package com.example.zenzone

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_5)

        val imageView13=findViewById<ImageView>(R.id.imageView13)
        imageView13.setOnClickListener{
            val Intent= Intent( this,Activity4::class.java)
            startActivity(Intent)
        }
        val imageView9=findViewById<ImageView>(R.id.imageView9)
        imageView9.setOnClickListener {
            val Intent = Intent(this, Activity6::class.java)
            startActivity(Intent)
        }
        val imageView11=findViewById<ImageView>(R.id.imageView11)
        imageView11.setOnClickListener {
            val Intent = Intent(this, Activity7::class.java)
            startActivity(Intent)
        }
        val button8=findViewById<Button>(R.id.button8)
        button8.setOnClickListener{
            val Intent= Intent( this,Activity12::class.java)
            startActivity(Intent)
        }
        val button9=findViewById<Button>(R.id.button9)
        button9.setOnClickListener{
            val Intent= Intent( this,Activity13::class.java)
            startActivity(Intent)
        }
        val imageView8=findViewById<ImageView>(R.id.imageView8)
        imageView8.setOnClickListener{
            val Intent= Intent( this,Activity14::class.java)
            startActivity(Intent)
        }
    }
}