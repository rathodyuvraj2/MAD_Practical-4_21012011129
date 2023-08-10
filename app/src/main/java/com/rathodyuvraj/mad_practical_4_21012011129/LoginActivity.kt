package com.rathodyuvraj.mad_practical_4_21012011129

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val Register: Button = findViewById(R.id.Signup)

        Register.setOnClickListener{
            Intent(this@LoginActivity,RegisterActivity::class.java).also { startActivity(it) }
        }
    }
}