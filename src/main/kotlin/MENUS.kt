enum class MENUS(val Opcoes: String) {
    MENUS_TAMANHO_AQUARIOS(
        Opcoes = """
        ========| LOJA AQUÁRIOS |=========
        1 -------- Pequeno | Até 05 peixes
        2 ---------- Médio | Até 10 peixes
        3 --------- Grande | Até 15 peixes
        4 -------- Gigante | Até 30 peixes
        ==================================
        """.trimIndent()
    ),

    MENUS_INICIAL(
        Opcoes = """
        ======| SEU AQUÁRIO |======
        1 --------- Adicionar Peixe
        2 -------- Alimentar Peixes
        3 ----- Ver todos os peixes
        4 ---------- Limpar Aquário
        5 --------- Upgrade Aquário
        ======= 0 - FECHAR ========
    """.trimIndent()
    ),

    MENUS_COR_PEIXE(
        Opcoes = """
        ====| COR DO PEIXE |====
        1 ----------------- Azul 
        2 ------------- Vermelho 
        3 -------------- Amarelo 
        4 ---------------- Verde 
        5 --------------- Branco 
        6 ---------------- Preto 
        ========================
    """.trimIndent()
    ),

    MENUS_TAMANHO_PEIXE(
        Opcoes = """
        ===| TAMANHO DO PEIXE | ===
        1 ----------------- Pequeno 
        2 ------------------- Médio 
        3 ------------------ Grande 
        4 ----------------- Gigante 
        ===========================
    """.trimIndent()
    ),

    MENUS_TAMANHO_AQUARIOS_UPGRADE(
        Opcoes = """
        =======| UPGRADE AQUÁRIOS |=======
        1 -------- Pequeno | Até 05 peixes
        2 ---------- Médio | Até 10 peixes
        3 --------- Grande | Até 15 peixes
        4 -------- Gigante | Até 30 peixes
        ==================================
    """.trimIndent()
    )
}

//Talvez ver todos os peixes e a sua situação, como alimentado, ou não, idade tlvz