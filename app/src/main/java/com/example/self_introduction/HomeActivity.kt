package com.example.self_introduction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.core.content.res.ResourcesCompat
import com.example.self_introduction.databinding.ActivityHomeBinding

private lateinit var binding: ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvIdOutput.text = "아이디 : ${intent.getStringExtra("activity")}"


        binding.btnFinish.setOnClickListener {
            finish()
        }



        val img = when ((1..6).random()) {
            1 -> R.drawable.ic_people1
            2 -> R.drawable.ic_people2
            3 -> R.drawable.ic_people3
            4 -> R.drawable.ic_people4
            5 -> R.drawable.ic_people5
            else -> R.drawable.ic_people1
        }

        binding.imgHome.setImageDrawable(ResourcesCompat.getDrawable(resources, img, null))
    }
}