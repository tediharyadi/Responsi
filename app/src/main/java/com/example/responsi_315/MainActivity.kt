package com.example.responsi_315

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginbtn.setOnClickListener {
            val email = user.text.toString()
            val password = pass.text.toString()
            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please Insert Email and Password", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (email == "tediharyadi@gmail.com" || password == "5170411315") {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }


        btnregistrasi.setOnClickListener{
            val intent = Intent (this, ActivityRegistrasi::class.java)
            startActivity(intent)
        }
    }
}

