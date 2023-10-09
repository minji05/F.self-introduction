package com.example.self_introduction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.self_introduction.databinding.ActivityHomeBinding

private lateinit var binding: ActivityHomeBinding
class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvIdOutput.text = "아이디 : ${intent.getStringExtra("activity")}"


        binding.btnFinish.setOnClickListener{
            finish()
        }
    }
}