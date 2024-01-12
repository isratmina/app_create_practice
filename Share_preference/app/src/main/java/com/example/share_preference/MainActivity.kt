package com.example.share_preference

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.share_preference.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var sp: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.saveBtn.setOnClickListener {
            sp = getSharedPreferences("my_sp", MODE_PRIVATE)
            startActivity(Intent(this,MainActivity2::class.java))
            sp = getSharedPreferences("my_sp", MODE_PRIVATE)
            val name = binding.name.toString()
            val age = binding.age.toString().toInt()

            val editor= sp.edit()

            editor.apply{

                putString("sp_name", name).toString()
                putInt("sp_age", age).toString()

                commit()
            }
        }

    }

}