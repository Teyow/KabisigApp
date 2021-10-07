package com.example.kabisig

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AccountVerify : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account_verify)

        val bttnBack: Button = findViewById(R.id.bttnBack)
        val bttnNext2: Button = findViewById(R.id.bttnNext2)

        bttnBack.setOnClickListener {
            val intent = Intent(this, RegistrationActivity::class.java)
            startActivity(intent)
        }
        bttnNext2.setOnClickListener {
            val intent = Intent(this, account_verification2::class.java)
            startActivity(intent)

        }
    }
}