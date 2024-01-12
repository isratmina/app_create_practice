package com.example.firebase_authentication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.firebase_authentication.databinding.ActivityMainBinding
import com.google.firebase.Firebase
import com.google.firebase.auth.auth

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.regAcTv.setOnClickListener {
            startActivity(Intent(this,Login::class.java))
        }
        binding.regBtn.setOnClickListener {
            if (binding.emailEt.text.toString().isEmpty()|| binding.passEt.text.toString().isEmpty() || binding.conPassEt.text.toString().isEmpty()){
                Toast.makeText( this,"Please Fill all filed", Toast.LENGTH_SHORT).show()
        }
            else if (binding.passEt.text.toString() != binding.conPassEt.text.toString()){
                Toast.makeText(this, "Password and confirm Password should be same", Toast.LENGTH_SHORT).show()
            }
            else if (binding.passEt.text.toString().length < 8){
                Toast.makeText(this, "password should be 8 character long", Toast.LENGTH_SHORT).show()
            }
            else{
                Firebase.auth.createUserWithEmailAndPassword(binding.emailEt.text.toString(), binding.passEt.text.toString())
                    .addOnCompleteListener{
                        if (it.isSuccessful){
                            startActivity(Intent(this, Login::class.java))
                            finish()
                        }
                        else{
                            Toast.makeText(this, it.exception?.localizedMessage, Toast.LENGTH_SHORT).show()
                        }
                    }
                Toast.makeText(this, "Registration Successful", Toast.LENGTH_SHORT).show()
            }
        }
    }

}