import Menu.*
import CoresPeixes.*
import TamanhoPeixes.*

val listaDePeixes: MutableList<String> = mutableListOf()
var i = 0

class Peixes{

    private var id: Int = 0
    private var nome: String
    private var cor: String
    private var tamanho: String

/*Rodar antes de tudo*/
    init {
        println("Qual o nome do peixe? ")
        id = i+1
        nome = readln()
        cor = escolherCor()
        tamanho = escolherTamanho()

        //Salva a String de saída das caract dos peixes em um val, para adicionar o kit na lista  */
        val linhaDeCarcteDoPeixe = linhaPeixe()

        listaDePeixes.add(i,linhaDeCarcteDoPeixe)
        i++
    }

/*Seleção Cor*/
    private fun escolherCor(): String {
        println(MENU_COR_PEIXE.Opcoes)

        when(readln().toInt()){
            1 -> cor = AZUL.nomeEscritoCor
            2 -> cor = VERMELHO.nomeEscritoCor
            3 -> cor = AMARELO.nomeEscritoCor
        }
         return cor
    }

/*Seleção Tamanho*/
    private fun escolherTamanho(): String {
        println(MENU_TAMANHO_PEIXE.Opcoes)

        when(readln().toInt()){
            1 -> tamanho = PEQUENO.tamanhoEscrito
            2 -> tamanho = MEDIO.tamanhoEscrito
            3 -> tamanho = GRANDE.tamanhoEscrito
        }
        return tamanho
    }

/*  Função para formartar a saída de caracteristicas do peixe */
    private fun linhaPeixe(): String = "#$id $nome -> Peixe $cor $tamanho"

//    override fun toString(): String {
//        return """
//            $nome -> peixe $tamanho $cor
//        """.trimIndent()
//    }

}

