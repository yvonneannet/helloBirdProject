package com.example.hello

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.hello.databinding.ActivityBirdThreeBinding
import com.example.hello.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class BirdThree : AppCompatActivity() {
    lateinit var binding: ActivityBirdThreeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBirdThreeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnback2.setOnClickListener{
            finish()
        }

        binding.btnnext3.setOnClickListener{
            val intent = Intent(this, birdFour::class.java)
            startActivity(intent)




        }
        Picasso.get().load("https://media.istockphoto.com/id/1472678552/photo/parrot.webp?b=1&s=170667a&w=0&k=20&c=SFy61kgi1M-aBOeMmRyH15vhsf3M3oHSquVW2NM3qz0=").into(binding.imageView6)
    }
}