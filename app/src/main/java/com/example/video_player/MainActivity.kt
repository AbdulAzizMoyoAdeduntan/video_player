package com.example.video_player

import com.example.video_player.R
import android.net.Uri
import android.net.Uri.*
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
           setContentView(R.layout.activity_main)
        val videoView:VideoView = findViewById (R.id.testView)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        val uri:Uri = parse(
            "android.resource://" + packageName
                           + "/raw/test"
        )
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()
    }

}