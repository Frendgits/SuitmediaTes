package com.example.threescreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class screen1 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen1)

        val btnNext: Button = findViewById(R.id.nextButton)
        btnNext.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.nextButton -> {
                val intent = Intent(this@screen1, screen2::class.java)
                startActivity(intent)
            }
        }
    }
}