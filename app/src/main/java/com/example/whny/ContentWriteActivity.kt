package com.example.whny

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ContentWriteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content_write)

        findViewById<Button>(R.id.submitBtn).setOnClickListener {

        }
    }
}