package com.example.firebase_authentication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.firebase_authentication.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityLoginBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}