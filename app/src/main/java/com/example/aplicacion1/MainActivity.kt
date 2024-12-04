package com.example.aplicacion1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_add_class).setOnClickListener {
            startActivity(Intent(this, AñadirClaseActivity::class.java))
        }
        findViewById<Button>(R.id.btn_view_schedule).setOnClickListener {
            startActivity(Intent(this, VerHorarioActivity::class.java))
        }
        findViewById<Button>(R.id.btn_current_subject).setOnClickListener {
            startActivity(Intent(this, ActividadPrincipal::class.java))
        }
    }
}