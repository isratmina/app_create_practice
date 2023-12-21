package com.example.signuppage

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Profile_Page : AppCompatActivity() {
    private lateinit var usernameTV: TextView
    private lateinit var nameTV: TextView
    private lateinit var emailTV: TextView
    private lateinit var ageTV: TextView
    private lateinit var addressTV: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_page)
        usernameTV = findViewById(R.id.usernameTV)
        nameTV = findViewById(R.id.nameTV)
        emailTV = findViewById(R.id.emailTV)
        ageTV = findViewById(R.id.ageTV)
        addressTV = findViewById(R.id.addressTV)

        var usernameText = intent.getStringExtra("username")
        usernameTV.text = usernameText.toString()
        var nameText = intent.getStringExtra("name")
        nameTV.text = nameText.toString()
        var emailText = intent.getStringExtra("email")
       emailTV.text =emailText.toString()
        var ageText = intent.getStringExtra("age")
        ageTV.text = ageText.toString()
        var addressText = intent.getStringExtra("address")
        addressTV.text = addressText.toString()

    }
}