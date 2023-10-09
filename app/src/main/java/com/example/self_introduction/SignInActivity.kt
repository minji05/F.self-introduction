package com.example.self_introduction

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.self_introduction.databinding.ActivitySignInBinding


private lateinit var binding: ActivitySignInBinding
class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener(){

            val strData = binding.tvId.text.toString()
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("activity",strData)
            startActivity(intent)

        }

        binding.btnSign.setOnClickListener(){

            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)

        }
    }
}