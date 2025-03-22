package com.example.loginnn2

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val tombolLogin = findViewById<Button>(R.id.btn_login)
        tombolLogin.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }


        val textDaftar = findViewById<TextView>(R.id.text_daftar)
        textDaftar.setOnClickListener {
            val intent = Intent(this, register::class.java)
            startActivity(intent)
        }


        val textLupaPassword = findViewById<TextView>(R.id.text_lupa_password)
        textLupaPassword.setOnClickListener {
            val intent = Intent(this, Reset_Password::class.java)
            startActivity(intent)
        }
    }
}
