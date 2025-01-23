class Estudiante(
    var nombre: String,
    var dni: String
){
    init{
        require(dni.length == 9 && !dni[8].isDigit()){"¡Error! Formato de DNI incorrecto"}
    }
    fun inscribirse(curso:Curso){
        curso.agregarAlumno(Estudiante(nombre,dni))
    }
}