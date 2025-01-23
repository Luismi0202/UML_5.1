class Curso(
    var Nombre: String,
    val Codigo: String,
) {
    var Estudiantes: MutableList<String>
    init{
        Estudiantes = mutableListOf()
    }
    fun agregarAlumno(estudiante:Estudiante){
        val datos = "Nombre: ${estudiante.nombre} DNI: ${estudiante.dni} CURSO: $Nombre"
        Estudiantes.add(datos)
    }
    fun mostrarEstudiantes(){
        for(estudiante in Estudiantes){
            println(estudiante)
        }
    }
}

