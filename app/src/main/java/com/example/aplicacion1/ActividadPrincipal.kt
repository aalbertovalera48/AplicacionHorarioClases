package com.example.aplicacion1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*

class ActividadPrincipal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_current_subject)

        val tvCurrentSubject = findViewById<TextView>(R.id.tv_current_subject)

        val currentDateTime = Calendar.getInstance()
        val day = obtenerDiaSemana(currentDateTime.get(Calendar.DAY_OF_WEEK))
        val time = SimpleDateFormat("HH:mm", Locale.getDefault()).format(currentDateTime.time)

        val currentClass = HorarioRepository.obtenerClasePorHora(day, time)
        tvCurrentSubject.text = if (currentClass != null) {
            "Estás en clase de: ${currentClass.asignatura}"
        } else {
            "No hay clases ahora."
        }
    }

    private fun obtenerDiaSemana(dayOfWeek: Int): String {
        return when (dayOfWeek) {
            Calendar.MONDAY -> "Lunes"
            Calendar.TUESDAY -> "Martes"
            Calendar.WEDNESDAY -> "Miércoles"
            Calendar.THURSDAY -> "Jueves"
            Calendar.FRIDAY -> "Viernes"
            Calendar.SATURDAY -> "Sábado"
            Calendar.SUNDAY -> "Domingo"
            else -> ""
        }
    }
}