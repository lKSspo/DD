package org.example.com

import personagem.*

fun main() {
    println("Criação de Personagem D&D")

    print("Digite o nome do personagem: ")
    val nome = readLine() ?: "Desconhecido"

    println("Escolha a raça do personagem:")
    Raca.values().forEachIndexed { index, raca ->
        println("${index + 1}. ${raca.name} - ${obterDescricaoRaca(raca)}")
    }
    print("Digite o número correspondente à raça desejada: ")
    val escolhaRaca = readLine()?.toIntOrNull() ?: 1 // Valor padrão 1 se a entrada for inválida
    val racaEscolhida = Raca.values().getOrNull(escolhaRaca - 1) ?: Raca.ANAO // Valor padrão se a entrada for inválida

    val atributos = Atributos()

    val distribuidor = DistribuicaoAtributos()
    distribuidor.distribuirAtributos(atributos)

    val personagem = Personagem(nome, atributos, racaEscolhida)
    personagem.aplicarBonusRacial()

    personagem.mostrarDados()
}

fun obterDescricaoRaca(raca: Raca): String {
    return when (raca) {
        Raca.ANAO -> "Resiliente e robusto, excelente para resistir a danos."
        Raca.ELFO -> "Ágil e gracioso, com uma profunda conexão com a magia."
        Raca.HALFLING -> "Pequeno mas corajoso, famoso por sua sorte e discrição."
        Raca.HUMANO -> "Versátil e adaptável, capaz de se destacar em qualquer área."
        Raca.DRACONATO -> "Descendente de dragões, possui grande força e poder inato."
        Raca.GNOMO -> "Inteligente e curioso, com uma afinidade natural para invenções."
        Raca.MEIO_ELFO -> "Mestiço com habilidades sociais e uma combinação de talentos raciais."
        Raca.MEIO_ORC -> "Forte e intimidante, com uma ferocidade natural em combate."
        Raca.TIEFLING -> "Descendente de demônios, com uma conexão natural com magia sombria."
    }
}
