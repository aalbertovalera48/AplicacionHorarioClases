package com.example.aplicacion1

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class VerHorarioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_schedule)

        val spinnerDay = findViewById<Spinner>(R.id.spinner_day)
        val btnSearch = findViewById<Button>(R.id.btn_search)
        val lvSchedule = findViewById<ListView>(R.id.lv_schedule)

        btnSearch.setOnClickListener {
            val day = spinnerDay.selectedItem.toString()
            val schedule = HorarioRepository.obtenerHorarioPorDia(day)

            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                schedule.map { "${it.hora} - ${it.asignatura}" }
            )
            lvSchedule.adapter = adapter
        }
    }
}