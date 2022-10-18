package com.example.listaspinners

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listaspinners.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnListview.setOnClickListener(){
            var intentListasSencillas=Intent(this,Listas::class.java)
            startActivity(intentListasSencillas)
        }

        binding.btnSpinners.setOnClickListener(){
            var intentSpin=Intent(this,Spinners::class.java)
            startActivity(intentSpin)
        }
    }
}