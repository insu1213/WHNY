package com.example.whny

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

            //splash activity is showed for 3s
            Handler(Looper.getMainLooper()).postDelayed({
                val intent = Intent(this, ContentWriteActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                startActivity(intent)
                finish()
            },3000)

        }

        //when back key is pressed
        override fun onBackPressed() {
            super.onBackPressed()
        }
}