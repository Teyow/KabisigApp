package com.example.kabisig

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class LoginpageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginpage)

        val reg: TextView = findViewById(R.id.textRegister)
        val log:  Button= findViewById(R.id.btn2Login)
        reg.setOnClickListener {
            val intent = Intent(this, RegistrationActivity::class.java)
            startActivity(intent)
        }

        log.setOnClickListener {
            val intent = Intent(this, Protocols_guidelines::class.java)
            startActivity(intent)
        }
    }
}