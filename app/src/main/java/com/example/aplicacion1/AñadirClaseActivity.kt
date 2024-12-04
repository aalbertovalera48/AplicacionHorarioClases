package com.example.aplicacion1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TimePicker
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AñadirClaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_class)

        val etSubject = findViewById<EditText>(R.id.et_subject)
        val spinnerDay = findViewById<Spinner>(R.id.spinner_day)
        val timePicker = findViewById<TimePicker>(R.id.time_picker)
        val btnAdd = findViewById<Button>(R.id.btn_add)
        val btnCancel = findViewById<Button>(R.id.btn_cancel)

        btnAdd.setOnClickListener {
            val day = spinnerDay.selectedItem.toString()
            val hour = "${timePicker.hour}:${timePicker.minute}"
            val subject = etSubject.text.toString()

            if (subject.isNotEmpty()) {
                HorarioRepository.agregarClase(Clase(day, hour, subject))
                Toast.makeText(this, "Clase añadida", Toast.LENGTH_SHORT).show()
                finish()
            } else {
                Toast.makeText(this, "Por favor, llena todos los campos", Toast.LENGTH_SHORT).show()
            }
        }

        btnCancel.setOnClickListener {
            finish()
        }
    }
}