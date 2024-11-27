package com.example.application

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var btn_login: Button

    override fun onCreate (savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_telalogin)

        btn_login = findViewById(R.id.btn_login)

        btn_login.setOnClickListener {

            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)

        }
    }
}