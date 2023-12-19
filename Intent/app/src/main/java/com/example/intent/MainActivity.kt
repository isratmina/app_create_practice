package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var mainBack: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainBack = findViewById(R.id.mainBack)

        mainBack.setOnClickListener{
           var page1 = Intent(this@MainActivity, home_page::class.java)
            startActivity(page1)
        }
    }
}