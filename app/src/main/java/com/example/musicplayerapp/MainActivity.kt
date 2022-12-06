package com.example.musicplayerapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.musicplayerapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.shuffleBtn.setOnClickListener {
            startActivity(Intent(this@MainActivity, PlayerActivity::class.java))
        }

        binding.favouritesBtn.setOnClickListener {
            startActivity(Intent(this@MainActivity, FavouritesActivity::class.java))
        }

        binding.playlistBtn.setOnClickListener {
            startActivity(Intent(this@MainActivity, PlaylistActivity::class.java))
        }

    }
}