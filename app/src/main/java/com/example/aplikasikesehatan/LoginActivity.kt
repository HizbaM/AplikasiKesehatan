package com.example.aplikasikesehatan

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {

    private lateinit var etNamaPengguna0: TextInputEditText
    private lateinit var etKataSandi0: TextInputEditText
    private lateinit var btnBuatAkun0: MaterialButton
    private lateinit var tvBuatAkun0: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val sharedPreferences = getSharedPreferences("loginPrefs", Context.MODE_PRIVATE)
        val sudahlogin = sharedPreferences.getBoolean("sudahLogin", false)

        etNamaPengguna0 = findViewById(R.id.etNamaPengguna)
        etKataSandi0 = findViewById(R.id.etKataSandi)
        btnBuatAkun0 = findViewById(R.id.btnBuatAkun)
        tvBuatAkun0 = findViewById(R.id.tvBuatAkun)

        if (sudahlogin) {
            val intent = Intent(this, SplashScreenActivity::class.java)
            startActivity(intent)
            finish()
        } else {
            btnBuatAkun0.setOnClickListener {
                val inputUsername = etNamaPengguna0.text.toString()
                val inputPassword = etKataSandi0.text.toString()

                if (inputUsername=="admin" && inputPassword=="123") {
                    val editor = sharedPreferences.edit()
                    editor.putBoolean("sudahLogin", true)
                    editor.apply()

                    val intent = Intent(this, SplashScreenActivity::class.java)
                    startActivity(intent)
                    finish()
                } else {
                    Toast.makeText(this, "Username atau password salah", Toast.LENGTH_SHORT).show()
                }
            }

        }
    }
}