package com.example.kabisig

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val login: TextView = findViewById(R.id.textLog)
        val btnNext: Button = findViewById(R.id.btnNext)

        login.setOnClickListener{
            val intent = Intent(this, LoginpageActivity::class.java)
            startActivity(intent)
        }

        btnNext.setOnClickListener {
            val intent = Intent(this, AccountVerify::class.java)
            startActivity(intent)

        }
    }
}