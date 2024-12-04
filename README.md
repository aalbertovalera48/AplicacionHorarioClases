# Aplicacion-Horiario-Clases
Hecho por: Alberto Valera

Aplicacion-Horiario-Clases es una aplicación de Android para gestionar horarios de clases. Permite a los usuarios agregar clases, ver horarios y verificar la clase actual según la hora y el día.

## Clases y Métodos

### `MainActivity`
- **Descripción**: La actividad principal que sirve como punto de entrada de la aplicación.
- **Métodos**:
  - `onCreate(Bundle?)`: Inicializa la actividad y configura los listeners de los botones para navegar a otras actividades.

### `AñadirClaseActivity`
- **Descripción**: Actividad para agregar una nueva clase al horario.
- **Métodos**:
  - `onCreate(Bundle?)`: Inicializa la actividad, configura los elementos de la interfaz de usuario y maneja los clics de los botones de agregar y cancelar.

### `VerHorarioActivity`
- **Descripción**: Actividad para ver el horario de clases de un día seleccionado.
- **Métodos**:
  - `onCreate(Bundle?)`: Inicializa la actividad, configura los elementos de la interfaz de usuario y maneja el clic del botón de búsqueda para mostrar el horario.

### `ActividadPrincipal`
- **Descripción**: Actividad para mostrar la clase actual según la hora y el día actuales.
- **Métodos**:
  - `onCreate(Bundle?)`: Inicializa la actividad, obtiene la fecha y hora actuales, y muestra la clase actual.
  - `obtenerDiaSemana(int)`: Traduce el día de la semana de entero a cadena en español.

### `HorarioRepository`
- **Descripción**: Objeto singleton que gestiona el horario de clases.
- **Métodos**:
  - `agregarClase(Clase)`: Agrega una nueva clase al horario.
  - `obtenerHorarioPorDia(String)`: Devuelve el horario para un día específico.
  - `obtenerClasePorHora(String, String)`: Devuelve la clase para un día y hora específicos.

### `Clase`
- **Descripción**: Clase de datos que representa una clase.
- **Propiedades**:
  - `dia`: El día de la clase.
  - `hora`: La hora de la clase.
  - `asignatura`: La asignatura de la clase.

## Archivos de Layout

### `activity_main.xml`
- **Descripción**: Layout para la actividad principal con botones para navegar a otras actividades.

### `activity_add_class.xml`
- **Descripción**: Layout para agregar una nueva clase con campos de entrada para asignatura, día y hora.

### `activity_view_schedule.xml`
- **Descripción**: Layout para ver el horario con un spinner para seleccionar el día y una lista para mostrar el horario.

### `activity_current_subject.xml`
- **Descripción**: Layout para mostrar la clase actual con text views para la fecha, hora y clase actual.

## Archivos de Valores

### `strings.xml`
- **Descripción**: Contiene recursos de cadenas utilizados en la aplicación.

### `arrays.xml`
- **Descripción**: Contiene recursos de arrays, como los días de la semana.

### `colors.xml`
- **Descripción**: Contiene recursos de colores utilizados en la aplicación.

### `themes.xml`
- **Descripción**: Define el tema de la aplicación.

