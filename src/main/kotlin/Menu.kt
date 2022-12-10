enum class Menu(val Opcoes: String) {
    MENU_INICIAL(Opcoes = """
        SEU AQUÁRIO:
        Adicionar Peixe.......1
        Alimentar Peixe.......2
        Ver todos os peixes...3
        Encerrar..............0
    """.trimIndent()),

    MENU_COR_PEIXE(Opcoes = """
        Qual a cor do peixe:
        Azul..........1
        Vermelho......2
        Amarelo.......3
        Voltar........0
    """.trimIndent()),

    MENU_TAMANHO_PEIXE(Opcoes = """
        Qual o tamanho do peixe:
        Pequeno.......1
        Médio.........2
        Grande........3
        Voltar........0
    """.trimIndent())
}

//Talvez ver todos os peixes e sua situação, como alimentado, ou não, idade tlvz