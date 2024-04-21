package com.example.tk4502_faradaybarrfatahillah_activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnGoToProfile = findViewById<Button>(R.id.btn_submit)
        val etNama = findViewById<EditText>(R.id.et_nama)
        val etNIM = findViewById<EditText>(R.id.et_nim)

        btnGoToProfile.setOnClickListener {
            val nama = etNama.text.toString()
            val nim = etNIM.text.toString()
            val intent = Intent(this, ProfileActivity::class.java)
            intent.putExtra("EXTRA_NAMA_MAHASISWA", nama)
            intent.putExtra("EXTRA_NIM_MAHASISWA", nim)
            startActivity(intent)
        }
    }
}