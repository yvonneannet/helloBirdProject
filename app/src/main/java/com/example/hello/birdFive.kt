package com.example.hello

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class birdFive : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bird_five)


        val btnback4 =findViewById<ImageView>(R.id.btnback4)


        btnback4.setOnClickListener{
            finish()
        }


    }
}