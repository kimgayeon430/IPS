package com.example.sookcycle0522ver

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sookcycle0522ver.databinding.ActivityMainBinding

var name: String = ""

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initBottomNavigation()


    }
    private fun initBottomNavigation() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.main_frm, HomeFragment())
            .commitAllowingStateLoss()

        binding.mainBnv.setOnItemSelectedListener { item ->
            when (item.itemId) {

                R.id.homeFragment -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, HomeFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }

                R.id.lookFragment -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, LookFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }


                R.id.searchFragment -> {
                    startActivity(Intent(this, CameraTF_Activity::class.java))
                    return@setOnItemSelectedListener true


                }


                R.id.lockerFragment -> {
                    startActivity(Intent(this, ChatbotActivity::class.java))
                    return@setOnItemSelectedListener true
                }
            }
            false
        }
    }
}