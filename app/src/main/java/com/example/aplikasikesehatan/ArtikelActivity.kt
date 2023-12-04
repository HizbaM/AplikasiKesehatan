package com.example.aplikasikesehatan

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.aplikasikesehatan.fragments.ArtikelFragment
import com.example.aplikasikesehatan.fragments.ChatDokterFragment

class ArtikelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_artikel)

        val ibkembalil = findViewById<ImageButton>(R.id.ibkembali)
        val ibartikell = findViewById<ImageButton>(R.id.ibartikel)

        ibkembalil.setOnClickListener{
            // Kode untuk kembali ke MainActivity setelah menampilkan fragment
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
            finish()
        }

        ibartikell.setOnClickListener {
            val fragment = ArtikelFragment()
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flartikel, fragment)
                addToBackStack(null)
                commit()
            }
        }
    }
}