package com.example.responsi_315

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ActivityRegistrasi : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrasi)
        var intent = intent

        val nim = intent.getStringExtra("NIM" )
        val nama = intent.getStringExtra("Nama" )
        val nilai = intent.getStringExtra("Nilai" )

    }
}
