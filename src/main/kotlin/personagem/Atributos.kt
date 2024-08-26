package personagem

data class Atributos(
    var forca: Int = 0,
    var destreza: Int = 0,
    var constituicao: Int = 0,
    var inteligencia: Int = 0,
    var sabedoria: Int = 0,
    var carisma: Int = 0
) {
    fun calcularPontosVida(): Int {
        return 10 + (constituicao - 10) / 2
    }
}
