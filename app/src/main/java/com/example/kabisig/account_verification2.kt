package com.example.kabisig

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class account_verification2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account_verification2)

        val bttnBack2: Button = findViewById(R.id.bttnBack2)


        bttnBack2.setOnClickListener {
            val intent = Intent(this, AccountVerify::class.java)
            startActivity(intent)
        }

    }
}