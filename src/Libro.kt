data class Libro(
    val titulo: String,
    val autor: String,
    val anioPublicacion: Int
) {
    override fun toString(): String {
        return "Libro(Titulo: $titulo, Autor: $autor, Año publicacion: $anioPublicacion)"
    }
}