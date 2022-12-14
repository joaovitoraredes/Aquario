data class PeixeDC(private var id: Int, private var nome: String, private var cor: String, private var tamanho: String){

    override fun toString(): String {
        return """
            #$id $nome -> Peixe $cor $tamanho
        """.trimIndent()
    }

}