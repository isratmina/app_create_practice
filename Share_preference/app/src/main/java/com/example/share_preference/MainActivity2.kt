package com.example.share_preference

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.share_preference.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var sp: SharedPreferences
    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)

        sp=getSharedPreferences("my_sp", MODE_PRIVATE)

        setContentView(binding.root)

        var name = sp.getString("sp_name", null)
        var age = sp.getInt("sp_age", 0)


        binding.name.setText(name)

        if (age!=0){
            binding.age.setText(age.toString())
        }
         }
}