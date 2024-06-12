package com.example.hello

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.hello.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class BirdTwo : AppCompatActivity() {


lateinit var binding: ActivityMainBinding

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding= ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)


    binding.btnNext.setOnClickListener{
        val intent = Intent(this, BirdThree::class.java)
        startActivity(intent)




        }
    Picasso.get().load("https://images.unsplash.com/photo-1574068468668-a05a11f871da?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8Y3V0ZSUyMGJpcmRzfGVufDB8fDB8fHww").into(binding.imageView2)
}
}


