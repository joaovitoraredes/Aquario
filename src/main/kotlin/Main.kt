import Menu.*

fun main() {

    println(MENU_INICIAL.Opcoes)

    do {
        val selecaoMenuPrincipal = readln().toInt()

        when(selecaoMenuPrincipal){
            1 -> AdicionarPeixes()
//            2 -> AlimentarPeixes()
            3 -> {
                println("Seus peixes: ")
                listaDePeixes.forEach { println(it) }
                println("Voltar........0")
                if(readln().toInt() == 0) println(MENU_INICIAL.Opcoes)
            }

        }

    }while(selecaoMenuPrincipal != 0)
    println("Fechando aquário...")


}