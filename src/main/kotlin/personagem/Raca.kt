package personagem

enum class Raca(val bonus: Atributos, val descricao: String) {
    ANAO(Atributos(constituicao = 2), "Resistente e teimoso, o anão é um mestre das artes da forja e da mineração."),
    ELFO(Atributos(destreza = 2), "Elegante e gracioso, o elfo é um ser mágico com forte ligação com a natureza."),
    HALFLING(Atributos(destreza = 2), "Pequeno e ágil, o halfling é conhecido por sua sorte e habilidade para escapar do perigo."),
    HUMANO(Atributos(forca = 1, destreza = 1, constituicao = 1, inteligencia = 1, sabedoria = 1, carisma = 1), "Versátil e ambicioso, o humano se adapta facilmente a qualquer situação."),
    DRACONATO(Atributos(forca = 2), "Com o sangue de dragões correndo em suas veias, o draconato é uma figura imponente com poderes elementares."),
    GNOMO(Atributos(inteligencia = 2), "Inventivo e curioso, o gnomo possui um espírito inquieto e uma mente brilhante."),
    MEIO_ELFO(Atributos(carisma = 2), "Um elo entre humanos e elfos, o meio-elfo possui o melhor dos dois mundos."),
    MEIO_ORC(Atributos(forca = 2), "Forte e feroz, o meio-orc é um guerreiro destemido que não foge de um combate."),
    TIEFLING(Atributos(inteligencia = 1, carisma = 2), "Marcado por um passado sombrio, o tiefling carrega traços infernais e uma vontade indomável.");

    fun aplicarBonus(atributos: Atributos) {
        atributos.forca += bonus.forca
        atributos.destreza += bonus.destreza
        atributos.constituicao += bonus.constituicao
        atributos.inteligencia += bonus.inteligencia
        atributos.sabedoria += bonus.sabedoria
        atributos.carisma += bonus.carisma
    }
}
