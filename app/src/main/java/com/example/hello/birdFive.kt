package com.example.hello

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.hello.databinding.ActivityBirdFiveBinding
import com.example.hello.databinding.ActivityBirdTwoBinding
import com.squareup.picasso.Picasso


class birdFive : AppCompatActivity() {
    lateinit var binding: ActivityBirdFiveBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



        binding.btnback4.setOnClickListener{
            finish()
        }

        Picasso.get().load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTnRGThSt8eU-kUDtaUEZIWtc8KACH5OdmZ_w&s").into(binding.imageView5)
    }
}