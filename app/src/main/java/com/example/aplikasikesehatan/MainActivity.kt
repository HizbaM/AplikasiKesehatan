package com.example.aplikasikesehatan

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.aplikasikesehatan.databinding.ActivityMainBinding
import com.example.aplikasikesehatan.fragments.BerandaFragment
import com.example.aplikasikesehatan.fragments.CariFragment
import com.example.aplikasikesehatan.fragments.ProfilFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        val berandaFragment=BerandaFragment()
        val cariFragment=CariFragment()
        val profilFragment=ProfilFragment()

         makeCurrentFragment(berandaFragment)

        bottomNavigation.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.icberanda->makeCurrentFragment(berandaFragment)
                R.id.iccari->makeCurrentFragment(cariFragment)
                R.id.icprofil->makeCurrentFragment(profilFragment)
            }
            true
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private  fun makeCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply{
            replace(R.id.flwrapper, fragment)
            commit()
        }
}