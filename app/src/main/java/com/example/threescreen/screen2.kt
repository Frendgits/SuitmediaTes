package com.example.threescreen

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class screen2 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)

        val btnBack: ImageButton = findViewById(R.id.backButton)
        btnBack.setOnClickListener(this)
        val btnChoose: Button = findViewById(R.id.chooseButton)
        btnChoose.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.backButton -> {
                finish()
            }
        }
        when (v.id) {
            R.id.chooseButton -> {
                val intent = Intent(this@screen2, screen3::class.java)
                startActivity(intent)
            }
        }
    }
}