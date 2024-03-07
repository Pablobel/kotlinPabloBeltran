package com.example.pmdm_pablo_beltran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Color
import android.widget.Button
import android.widget.EditText
import android.widget.FrameLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCambiarColor = findViewById<Button>(R.id.btnCambiarColor)
        btnCambiarColor.setOnClickListener {
            cambiarColorCuerpo("#00FF00") // Ejemplo con verde
        }

        val btnCambiarActivity = findViewById<Button>(R.id.btnCambiarActivity)
        btnCambiarActivity.setOnClickListener {
            val editTextMensaje = findViewById<EditText>(R.id.editTextMensaje)
            val mensaje = editTextMensaje.text.toString()
            val intent = Intent(this, Activity2::class.java).apply {
                putExtra("mensaje", mensaje)
            }
            startActivity(intent)
        }
    }

    fun cambiarColorCuerpo(color: String) {
        val cuerpo = findViewById<FrameLayout>(R.id.cuerpo)
        cuerpo.setBackgroundColor(Color.parseColor(color))
    }


}