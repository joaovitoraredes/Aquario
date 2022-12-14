data class AquarioDC(var capacidade: Int, var sujo: Boolean){

    override fun toString(): String {
        return """
            Seu aquário atual possui capacidade para $capacidade peixes, e está sujo $sujo
        """.trimIndent()
    }
}
