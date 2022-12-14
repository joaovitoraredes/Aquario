import MENUS.*
import CoresPeixes.*
import TamanhoPeixes.*
import kotlin.random.Random

val listaDePeixes: MutableList<PeixeDC> = mutableListOf()
var idContando = 0
var i = 0

private var totalDePeixes = idContando
private var sujo = false


class Aquario(private val capacidadeMaxDePeixes: Int) {


    fun adicionarPeixe() {

        /* Caso tenha chegado numa quantidade múltipla de 3, o aquário estará sujo */
        if (totalDePeixes % 3 == 0 && totalDePeixes != 0) {
            sujo = true
        }

        /* Com o aquário sujo, não é possível adicionar mais peixes, somente após limpa-lo */
        if (sujo) {
            println("O aquário está sujo, impossivel adicionar mais peixes!! Limpe primeiro!!")
        } else {
            /* Aquário limpo, podemos prosseguir */

            /*Id peixe*/
            idContando = i + 1
            totalDePeixes = idContando

            /* Apesar de o aquário estár limpo, precisamos ver se a capacidade não foi excedida */
            if (totalDePeixes > capacidadeMaxDePeixes) {
                println("Seu aquário não possui capacidade para mais peixes!! Realize um upgrade!!")
                totalDePeixes = idContando - 1

            } else {
                /*Com tudo ok, podemos adicionar mais um novo peixe*/

                /*Seleção Nome*/
                println("Qual o nome do peixe? ")
                val nomeEscolhido: String = readln()

                /*Seleção Cor*/
                println(MENUS_COR_PEIXE.Opcoes)
                var corEscolhida = ""

                corEscolhida = when (readln().toInt()) {
                    1 -> AZUL.nomeEscritoCor
                    2 -> VERMELHO.nomeEscritoCor
                    3 -> AMARELO.nomeEscritoCor
                    4 -> VERDE.nomeEscritoCor
                    5 -> BRANCO.nomeEscritoCor
                    6 -> PRETO.nomeEscritoCor
                    else -> return
                }

                /*Seleção Tamanho*/
                println(MENUS_TAMANHO_PEIXE.Opcoes)
                var tamanhoEscolhido = ""

                tamanhoEscolhido = when (readln().toInt()) {
                    1 -> PEQUENO.tamanhoEscrito
                    2 -> MEDIO.tamanhoEscrito
                    3 -> GRANDE.tamanhoEscrito
                    4 -> GIGANTE.tamanhoEscrito
                    else -> return
                }

                /*Adicionando o peixe a lista de peixes*/
                val linhaDeCaracteristicasPeixe =
                    PeixeDC(id = idContando, nome = nomeEscolhido, cor = corEscolhida, tamanho = tamanhoEscolhido)
                listaDePeixes.add(i, linhaDeCaracteristicasPeixe)
                i += 1

                println("Peixe adicionado com Sucesso!! \n0 - Voltar")
                if (readln().toInt() == 0) println(MENUS_INICIAL.Opcoes) else{ println(MENUS_INICIAL.Opcoes) }

            }
        }
    }

    fun alimentarPeixe() {
        /*Aqui por um random, teremos quantos peixes vão ser alimentados*/
        val randomNumeroDePeixesAlimentados =
            Random.nextInt(0, totalDePeixes + 1) //Neste caso, o range vai se de 0 até a capacidade do aquario
        println(randomNumeroDePeixesAlimentados)

        when {
            randomNumeroDePeixesAlimentados == totalDePeixes -> println("SUCESSO!! Todos os peixes foram alimentados")
            randomNumeroDePeixesAlimentados < totalDePeixes && randomNumeroDePeixesAlimentados != 0 -> println("Os peixes foram parcialmente alimentar / $randomNumeroDePeixesAlimentados alimentados")
            randomNumeroDePeixesAlimentados == 0 -> println("FALHA!! Nenhum peixe foi alimentado")
        }
        println("0 - Voltar")
        if (readln().toInt() == 0) println(MENUS_INICIAL.Opcoes) else{ println(MENUS_INICIAL.Opcoes) }
    }

    fun mostrarPeixesDoAquario() {
        println("== Peixes no seu aquário ==")
        listaDePeixes.forEach { println(it) }
        println("0 - Voltar")
        if (readln().toInt() == 0) println(MENUS_INICIAL.Opcoes) else{ println("Entrada Inválida")  }
    }

    fun limparAquario() {
        sujo = false
        totalDePeixes += 1
        println("O aquário agora está limpo!!")
        println(MENUS_INICIAL.Opcoes)
    }


}
