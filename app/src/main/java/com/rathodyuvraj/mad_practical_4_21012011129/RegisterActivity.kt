package com.rathodyuvraj.mad_practical_4_21012011129

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val Login: Button = findViewById(R.id.button)

        Login.setOnClickListener {
            Intent(this@RegisterActivity, LoginActivity::class.java).also { startActivity(it) }
        }

    }
}