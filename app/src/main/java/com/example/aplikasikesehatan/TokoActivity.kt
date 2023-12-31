package com.example.aplikasikesehatan

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.aplikasikesehatan.fragments.ChatDokterFragment
import com.example.aplikasikesehatan.fragments.ObatFragment

class TokoActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_toko)

        val ibkembalil = findViewById<ImageButton>(R.id.ibkembali)
        val ibobat2 = findViewById<ImageButton>(R.id.ibobat2)


        ibobat2.setOnClickListener {
            val fragment = ObatFragment()
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fltoko, fragment)
                addToBackStack(null)
                commit()
            }
        }

        ibkembalil.setOnClickListener{
            // Kode untuk kembali ke MainActivity setelah menampilkan fragment
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
            finish()

        }

    }
    }
