sealed class Usuario {
    abstract val id:String
    abstract val nombre:String
    data class Estudiante(override val id: String, override val nombre: String, val carrera: String) : Usuario()
    data class Profesor(override val id: String, override val nombre: String, val departamento: String) : Usuario()
    data class Visitante(override val id: String, override val nombre: String) : Usuario()
}