package com.example.pmdm_pablo_beltran

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val mensaje = intent.getStringExtra("mensaje")
        findViewById<TextView>(R.id.textMensaje).text = mensaje
    }
}