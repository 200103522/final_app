package com.example.musicplayerapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.musicplayerapp.databinding.ActivityPlaylistBinding

class PlaylistActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPlaylistBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.decorView.systemUiVisibility = View.ACCESSIBILITY_LIVE_REGION_NONE
        supportActionBar?.hide()

        setTheme(R.style.Theme_MusicPlayerApp)
        binding = ActivityPlaylistBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}