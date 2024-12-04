import com.example.aplicacion1.Clase

object HorarioRepository {
    private val horario: MutableList<Clase> = mutableListOf()

    fun agregarClase(clase: Clase) {
        horario.add(clase)
    }

    fun obtenerHorarioPorDia(dia: String): List<Clase> {
        return horario.filter { it.dia.equals(dia, ignoreCase = true) }
    }

    fun obtenerClasePorHora(dia: String, hora: String): Clase? {
        return horario.find { it.dia.equals(dia, ignoreCase = true) && it.hora == hora }
    }
}