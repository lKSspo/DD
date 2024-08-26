package personagem

data class Personagem(
    var nome: String,
    var atributos: Atributos = Atributos(),
    var raca: Raca
) {
    fun aplicarBonusRacial() {
        atributos.forca += raca.bonus.forca
        atributos.destreza += raca.bonus.destreza
        atributos.constituicao += raca.bonus.constituicao
        atributos.inteligencia += raca.bonus.inteligencia
        atributos.sabedoria += raca.bonus.sabedoria
        atributos.carisma += raca.bonus.carisma
    }

    fun mostrarDados() {
        println("Nome: $nome")
        println("Raça: ${raca.name}")
        println("Atributos: Força=${atributos.forca}, Destreza=${atributos.destreza}, Constituição=${atributos.constituicao}, Inteligência=${atributos.inteligencia}, Sabedoria=${atributos.sabedoria}, Carisma=${atributos.carisma}")
        println("Pontos de Vida: ${atributos.calcularPontosVida()}")
    }
}
