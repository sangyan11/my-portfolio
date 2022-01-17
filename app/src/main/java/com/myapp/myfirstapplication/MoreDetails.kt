package com.myapp.myfirstapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MoreDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_more_details)
    }

    fun MyResume(view: View) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(""))
        startActivity(intent)
    }
}