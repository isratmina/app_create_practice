package com.example.intent

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class home_page : AppCompatActivity() {
    private lateinit var homeBack: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        homeBack = findViewById(R.id.homeBack)

        homeBack.setOnClickListener{

            startActivity( Intent(this, MainActivity::class.java))
        }
    }
}