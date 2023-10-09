package com.example.self_introduction

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.self_introduction.databinding.ActivitySignUpBinding


private lateinit var binding: ActivitySignUpBinding
class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnSignIn.setOnClickListener(){

            if(binding.tvName.text.toString().trim().isEmpty() || binding.tvId.text.trim().isEmpty() || binding.tvPw.text.trim().isEmpty()) {
                Toast.makeText(this, "입력되지 않은 정보가 있습니다.",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
                }

            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
    }
}