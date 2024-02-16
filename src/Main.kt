fun prestamoLibro(usuario: Usuario, libro: Libro): String {
    return when (usuario) {
        is Usuario.Estudiante -> "El estudiante ${usuario.nombre} puede tomar prestado el $libro por 1 semana."
        is Usuario.Profesor -> "El profesor ${usuario.nombre} puede tomar prestado el $libro."
        is Usuario.Visitante -> "Los visitantes no pueden tomar prestados libros."
    }
}

fun main() {
    val libro = Libro("Mario", "Eliaser", 1909)
    val estudiante = Usuario.Estudiante("Hola", "Diego", "LOLPLAYER")
    val profesor = Usuario.Profesor("xd", "Juan Alberto", "Informatica")
    val visitante = Usuario.Visitante("4", "Lucas")

    println(prestamoLibro(estudiante, libro))
    println(prestamoLibro(profesor, libro))
    println(prestamoLibro(visitante, libro))
}