package com.ondev.gloriasalon

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_GloriaSalon)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}