package personagem

class DistribuicaoAtributos(private val pontos: Int = 27) {
    private val custoAtributo: Map<Int, Int> = mapOf(
        8 to 0,
        9 to 1,
        10 to 2,
        11 to 3,
        12 to 4,
        13 to 5,
        14 to 7,
        15 to 9
    )

    fun distribuirAtributos(atributos: Atributos) {
        println("Distribuição de Pontos")
        println("Pontos disponíveis: $pontos")

        var pontosRestantes = pontos

        fun pedirPontos(nomeAtributo: String, atributo: (Int) -> Unit) {
            var pontosAtribuidos: Int
            do {
                println("Quantos pontos deseja atribuir a $nomeAtributo? (Restantes: $pontosRestantes)")
                pontosAtribuidos = readLine()?.toIntOrNull() ?: 0
                val custo = custoAtributo.getOrDefault(8 + pontosAtribuidos, 0)
                if (custo <= pontosRestantes) {
                    atributo(pontosAtribuidos)
                    pontosRestantes -= custo
                } else {
                    println("Pontos insuficientes. Tente novamente.")
                }
            } while (pontosAtribuidos !in 0..pontosRestantes)
        }

        pedirPontos("Força") { atributos.forca = 8 + it }
        pedirPontos("Destreza") { atributos.destreza = 8 + it }
        pedirPontos("Constituição") { atributos.constituicao = 8 + it }
        pedirPontos("Inteligência") { atributos.inteligencia = 8 + it }
        pedirPontos("Sabedoria") { atributos.sabedoria = 8 + it }
        pedirPontos("Carisma") { atributos.carisma = 8 + it }

        println("Distribuição concluída")
        println("Atributos finais: $atributos")
        println("Pontos restantes: $pontosRestantes")
    }
}
