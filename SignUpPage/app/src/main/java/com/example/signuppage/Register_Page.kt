package com.example.signuppage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Register_Page : AppCompatActivity() {
    private lateinit var username:EditText
    private lateinit var name:EditText
    private lateinit var email:EditText
    private lateinit var age:EditText
    private lateinit var address:EditText
    private lateinit var register:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        username = findViewById(R.id.username)
        name = findViewById(R.id.name)
        email = findViewById(R.id.email)
        age = findViewById(R.id.age)
        address = findViewById(R.id.address)
        register = findViewById(R.id.register)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.resigterpage)

        register.setOnClickListener {
            var username = username.text.toString()
            var name = name.text.toString()
            var email = email.text.toString()
            var age = age.text.toString()
            var address = address.text.toString()

            startActivity(Intent(this@Register_Page, Profile_Page::class.java))
            intent.putExtra("username", username)
            intent.putExtra("name", name)
            intent.putExtra("email", email)
            intent.putExtra("age", age)
            intent.putExtra("address", address)
        }

    }
}