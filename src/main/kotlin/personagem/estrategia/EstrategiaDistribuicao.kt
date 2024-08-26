package personagem.estrategia

import personagem.Atributos

interface EstrategiaDistribuicao {
    fun distribuir(atributos: Atributos)
}

class DistribuicaoPontosPersonalizada : EstrategiaDistribuicao {
    override fun distribuir(atributos: Atributos) {
        val pontosDisponiveis = 27
        var pontosRestantes = pontosDisponiveis
        val custoAtributo = mapOf(8 to 0, 9 to 1, 10 to 2, 11 to 3, 12 to 4, 13 to 5, 14 to 7, 15 to 9)

        fun adicionarPontos(nomeAtributo: String, valorAtual: Int): Int {
            println("Distribua os pontos para $nomeAtributo (valor atual: $valorAtual, pontos restantes: $pontosRestantes): ")
            val novoValor = readLine()?.toIntOrNull() ?: valorAtual
            val custo = custoAtributo[novoValor] ?: 0
            return if (custo <= pontosRestantes) {
                pontosRestantes -= custo
                novoValor
            } else {
                println("Pontos insuficientes para esse valor. Mantendo valor atual.")
                valorAtual
            }
        }

        atributos.forca = adicionarPontos("Força", atributos.forca)
        atributos.destreza = adicionarPontos("Destreza", atributos.destreza)
        atributos.constituicao = adicionarPontos("Constituição", atributos.constituicao)
        atributos.inteligencia = adicionarPontos("Inteligência", atributos.inteligencia)
        atributos.sabedoria = adicionarPontos("Sabedoria", atributos.sabedoria)
        atributos.carisma = adicionarPontos("Carisma", atributos.carisma)

        println("Distribuição concluída! Pontos restantes: $pontosRestantes")
    }
}
