package com.example.valentineday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val crdv = findViewById<CardView>(R.id.cardview_message)
        crdv.setOnClickListener{
            val intent = Intent(this,MessageActivity::class.java)
            startActivity(intent)
        }
    }
}

