package com.example.zenzone

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Activity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_7)

        val button10=findViewById<Button>(R.id.button10)
        button10.setOnClickListener{
            val Intent= Intent( this,Activity8::class.java)
            startActivity(Intent)
        }
        val button11=findViewById<Button>(R.id.button11)
        button11.setOnClickListener{
            val Intent= Intent( this,Activity11::class.java)
            startActivity(Intent)
        }
        val imageView7=findViewById<ImageView>(R.id.imageView7)
        imageView7.setOnClickListener {
            val Intent = Intent(this, Activity5::class.java)
            startActivity(Intent)
        }
        val imageView18=findViewById<ImageView>(R.id.imageView18)
        imageView18.setOnClickListener {
            val Intent = Intent(this, Activity14::class.java)
            startActivity(Intent)
        }
    }
}