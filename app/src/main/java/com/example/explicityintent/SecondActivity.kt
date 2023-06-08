package com.example.explicityintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btnIntent= findViewById<Button>(R.id.activity2)

        btnIntent.setOnClickListener{
            // going back to main activity from second activity


            intent= Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }
    }
}