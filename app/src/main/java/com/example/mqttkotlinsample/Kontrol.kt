package com.example.mqttkotlinsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mqttkotlinsample.databinding.ActivityMainBinding

private lateinit var binding : Kontrol
private lateinit var database : DatabaseReference

class Kontrol : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kontrol)
    }
}