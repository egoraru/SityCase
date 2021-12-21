package com.example.sitycase

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class UsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webPage = "https://vk.link/egoraru"
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(webPage)
        startActivity(intent)
    }
}


