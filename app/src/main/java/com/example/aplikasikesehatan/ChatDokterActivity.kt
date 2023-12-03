package com.example.aplikasikesehatan

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.aplikasikesehatan.fragments.BerandaFragment
import com.example.aplikasikesehatan.fragments.ChatDokterFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class ChatDokterActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_chat_dokter)

        val ibdokterdafril = findViewById<ImageButton>(R.id.ibdokterdafri)
        val ibkembalil = findViewById<ImageButton>(R.id.ibkembali)

        ibdokterdafril.setOnClickListener {
            val fragment = ChatDokterFragment()
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fldokter, fragment)
                addToBackStack(null)
                commit()
            }
        }

        ibkembalil.setOnClickListener{
                val fragment = ChatDokterFragment() // Buat instance dari ChatDokterFragment
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.fldokter, fragment)
                    addToBackStack(null)
                    commit()
                }

                // Kode untuk kembali ke MainActivity setelah menampilkan fragment
                val intent = Intent(this, MainActivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
                startActivity(intent)
                finish()

        }
    }
}
