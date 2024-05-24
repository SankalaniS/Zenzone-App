package com.example.zenzone

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_4)



        val imageView3=findViewById<ImageView>(R.id.imageView3)
        imageView3.setOnClickListener{
            val Intent= Intent( this,Activity5::class.java)
            startActivity(Intent)
        }
        val button5=findViewById<Button>(R.id.button5)
        button5.setOnClickListener {
            val Intent = Intent(this, Activity8::class.java)
            startActivity(Intent)
        }
        val imageView5=findViewById<ImageView>(R.id.imageView5)
        imageView5.setOnClickListener{
            val Intent= Intent( this,Activity14::class.java)
            startActivity(Intent)
        }


        val name = findViewById<TextView>(R.id.textView25)
        val phone = findViewById<TextView>(R.id.textView26)
        val num1 = findViewById<TextView>(R.id.textView27)
        val num2 = findViewById<TextView>(R.id.textView30)

        name.text = intent.getStringExtra("Name")!!
        phone.text = intent.getStringExtra("phone")!!
        num1.text = intent.getStringExtra("num1")!!
        num2.text = intent.getStringExtra("num2")!!


    }
}