fun main(){
    val estudiante1 = Estudiante("Josefina","49988566K")
    val estudiante2 = Estudiante("Juan","12345678A")

    val curso1 = Curso("1DAM","1")

    curso1.agregarAlumno(estudiante1)
    estudiante2.inscribirse(curso1)
    curso1.mostrarEstudiantes()
}