package com.example.mqttkotlinsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.inflate
import androidx.core.content.res.ColorStateListInflaterCompat.inflate
import androidx.core.content.res.ComplexColorCompat.inflate
import androidx.core.graphics.drawable.DrawableCompat.inflate
import androidx.databinding.DataBindingUtil.inflate
import com.example.mqttkotlinsample.databinding.ActivityKontrolBinding
import com.example.mqttkotlinsample.databinding.ActivityKontrolBinding.inflate
import com.example.mqttkotlinsample.databinding.ActivityMainBinding
import com.example.mqttkotlinsample.databinding.ActivityMainBinding.inflate
import com.example.mqttkotlinsample.databinding.ContentMainBinding.inflate
import com.example.mqttkotlinsample.databinding.FragmentClientBinding.inflate
import com.example.mqttkotlinsample.databinding.FragmentConnectBinding.inflate
import com.google.firebase.database.DatabaseReference
import org.json.JSONObject



class Kontrol : AppCompatActivity() {
    private lateinit var binding : ActivityKontrolBinding
    private lateinit var database : DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityKontrolBinding.inflate(layoutInflater)
        setContentView(binding.root)
        super.onCreate(savedInstanceState)

    }
}