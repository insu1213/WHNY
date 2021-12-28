package com.example.whny

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.ViewModelProvider

class ContentWriteActivity : AppCompatActivity() {
    private lateinit var viewModel: ContentWriteActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content_write)

        viewModel = ViewModelProvider(this).get(ContentWriteActivityViewModel::class.java)

        findViewById<Button>(R.id.submitBtn).setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))

        }
    }
}