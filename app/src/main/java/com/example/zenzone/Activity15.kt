package com.example.zenzone

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Activity15 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_15)

        val button17 = findViewById<Button>(R.id.button17)
        button17.setOnClickListener {
            val Intent = Intent(this, Activity5::class.java)

            startActivity(Intent)
        }

        val edName = findViewById<EditText>(R.id.name)
        val edphone=findViewById<EditText>(R.id.phone)
        val ednum1=findViewById<EditText>(R.id.num1)
        val ednum2=findViewById<EditText>(R.id.num1)

        val sendDataBtn = findViewById<Button>(R.id.button17)
        sendDataBtn.setOnClickListener {

            val sendDataIntent = Intent(this@Activity15, Activity4::class.java).apply {
                putExtra("Name", edName.text.toString())
                putExtra("phone", edphone.text.toString())
                putExtra("num1", ednum1.text.toString())
                putExtra("num2", ednum1.text.toString())

            }
            startActivity(sendDataIntent)

        }


    }
}