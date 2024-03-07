package com.example.pmdm_pablo_beltran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val mensaje = intent.getStringExtra("mensaje")
        findViewById<TextView>(R.id.textMensaje).text = mensaje

        val btnVolverMainActivity = findViewById<Button>(R.id.btnVolverMainActivity)

        btnVolverMainActivity.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }
}