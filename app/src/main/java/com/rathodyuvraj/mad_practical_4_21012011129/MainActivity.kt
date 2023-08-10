package com.rathodyuvraj.mad_practical_4_21012011129

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Login: Button = findViewById(R.id.Login)

        Login.setOnClickListener {
            Intent(this@MainActivity, LoginActivity::class.java).also { startActivity(it) }
        }

        val Register: Button = findViewById(R.id.Signup)

        Register.setOnClickListener{
            Intent(this@MainActivity,RegisterActivity::class.java).also { startActivity(it) }
        }
    }
}