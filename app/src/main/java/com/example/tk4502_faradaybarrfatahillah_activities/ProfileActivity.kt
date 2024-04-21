package com.example.tk4502_faradaybarrfatahillah_activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)

        val btnBack = findViewById<Button>(R.id.btn_back)
        val tvNama = findViewById<TextView>(R.id.tv_nama)
        val tvNim = findViewById<TextView>(R.id.tv_nim)

        val nama = intent.getStringExtra("EXTRA_NAMA_MAHASISWA")
        val nim = intent.getStringExtra("EXTRA_NIM_MAHASISWA")

        tvNama.text = nama
        tvNim.text = nim

        btnBack.setOnClickListener {
            finish()
        }
    }
}