package com.linkdev.playerdemo


import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class NativeVideoViewActivity : AppCompatActivity() {

    companion object {
        const val STREAM_URL = "https://www.learningcontainer.com/bfd_download/sample-mp4-file/"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_native_video_view)
        val videoView = findViewById<View>(R.id.vdVw) as VideoView
        //Set MediaController  to enable play, pause, forward, etc options.
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        //Location of Media File
        val uri = Uri.parse(STREAM_URL)
        //Starting VideView By Setting MediaController and URI
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()
    }
}