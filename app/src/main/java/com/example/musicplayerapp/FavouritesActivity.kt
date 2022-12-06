package com.example.musicplayerapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.musicplayerapp.databinding.ActivityFavouritesBinding

class FavouritesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFavouritesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.decorView.systemUiVisibility = View.ACCESSIBILITY_LIVE_REGION_NONE
        supportActionBar?.hide()

        setTheme(R.style.Theme_MusicPlayerApp)
        binding = ActivityFavouritesBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}