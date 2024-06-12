package com.example.hello

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.hello.databinding.ActivityBirdFourBinding
import com.example.hello.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

lateinit var binding: ActivityBirdFourBinding
class birdFour : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBirdFourBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val btnback3 =findViewById<ImageView>(R.id.btnback3)
        val btnNext4 = findViewById<ImageView>(R.id.btnnext4)


        binding.btnback3.setOnClickListener{
            finish()
        }

        binding.btnnext4.setOnClickListener {
            val intent = Intent(this, birdFive::class.java)
            startActivity(intent)



        }
        Picasso.get().load("https://media.istockphoto.com/id/495292220/photo/colorful-cute-toucan-tropical-bird-in-brazilian-amazon-blurred-background.jpg?s=612x612&w=0&k=20&c=UUgfaSISnRJOGQfmzsUQyWIo_RFWHe3JPBmO3K3E6LA=").into(binding.imageView15)
    }
}

