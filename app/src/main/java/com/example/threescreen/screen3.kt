package com.example.threescreen

import android.media.Image
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class screen3 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen3)

        val btnBack2: ImageButton = findViewById(R.id.kembaliButton)
        btnBack2.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.kembaliButton -> {
                finish()
            }
        }
    }
}