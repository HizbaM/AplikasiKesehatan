package com.example.aplikasikesehatan

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SplashScreenActivity0 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash_screen0)

        Handler().postDelayed({
            val mulaiintent= Intent(this,SplashScreenActivity1::class.java)
            startActivity(mulaiintent)
        }, 3200)
        }
    }
