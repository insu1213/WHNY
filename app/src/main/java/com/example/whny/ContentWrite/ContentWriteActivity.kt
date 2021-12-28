package com.example.whny.ContentWrite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.whny.MainActivity
import com.example.whny.R

class ContentWriteActivity : AppCompatActivity() {
    //private val viewModel: ContentWriteActivityViewModel by lazy {ViewModelProvider(this, ContentWriteActivityViewModelFactory(this)).get(ContentWriteActivityViewModel::class.java)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content_write)


        findViewById<Button>(R.id.submitBtn).setOnClickListener {
            Toast.makeText(this, "저장이 완료되었습니다", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, MainActivity::class.java))
            //viewModel.insert(findViewById<EditText>(R.id.submitText).toString())
        }
    }
}