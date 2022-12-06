package com.example.musicplayerapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class PlayerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.decorView.systemUiVisibility = View.ACCESSIBILITY_LIVE_REGION_NONE
        supportActionBar?.hide()

        setContentView(R.layout.activity_player)
    }
}