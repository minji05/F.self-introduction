package com.example.self_introduction

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.example.self_introduction.databinding.ActivitySignInBinding


private lateinit var binding: ActivitySignInBinding
class SignInActivity : AppCompatActivity() {
    lateinit var activityResultLauncher: ActivityResultLauncher<Intent>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)


        activityResultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            if (it.resultCode == RESULT_OK) {
                val user_id = it.data?.getStringExtra("id") ?: ""
                val user_pw = it.data?.getStringExtra("pw") ?: ""
                binding.tvId.setText(user_id)
                binding.tvPw.setText(user_pw)
            }
        }

        binding.btnLogin.setOnClickListener() {

            if (binding.tvId.text.toString().trim().isEmpty() || binding.tvPw.text.toString().trim().isEmpty()) {
                Toast.makeText(this, "아이디/비밀번호를 확인해주세요", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }


                Log.d("로그인 로그", "로그인 성공")
                val strData = binding.tvId.text.toString()
                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("activity", strData)
                startActivity(intent)

            }

            binding.btnSign.setOnClickListener() {
//            val intent = Intent(this, SignUpActivity::class.java)
//            startActivity(intent)

                val intent = Intent(this, SignUpActivity::class.java)
                activityResultLauncher.launch(intent)
            }
        }
    }
