import Menu.*
import CoresPeixes.*
import TamanhoPeixes.*

val listaDePeixes: MutableList<Peixe> = mutableListOf()
var i = 0

class AdicionarPeixes() {


    init {
        adicionandoALista()
        i += 1
    }

    private fun adicionandoALista(){
        val idRetornoFuncao = i+1
        val nomeRetornoFuncao = escolherNome()
        val corRetornoFuncao = escolherCor()
        val tamanhoRetornoFuncao = escolherTamanho()

        //Salva a String de saída das caract dos peixes em um val, para adicionar o kit na lista  */
        val linhaDeCaracteristicasPeixe: Peixe = Peixe(id = idRetornoFuncao, nome = nomeRetornoFuncao, cor = corRetornoFuncao, tamanho = tamanhoRetornoFuncao)
        listaDePeixes.add(i,linhaDeCaracteristicasPeixe)
    }


    /*Seleção Nome*/
    private fun escolherNome(): String {

        println("Qual o nome do peixe? ")
        return readln()

    }

    /*Seleção Cor*/
    private fun escolherCor(): String {

        println(MENU_COR_PEIXE.Opcoes)
        var cor = ""

        when (readln().toInt()) {
            1 -> cor = AZUL.nomeEscritoCor
            2 -> cor = VERMELHO.nomeEscritoCor
            3 -> cor = AMARELO.nomeEscritoCor
        }

        return cor

    }

    /*Seleção Tamanho*/
    private fun escolherTamanho(): String {

        println(MENU_TAMANHO_PEIXE.Opcoes)
        var tamanho = ""

        when (readln().toInt()) {
            1 -> tamanho = PEQUENO.tamanhoEscrito
            2 -> tamanho = MEDIO.tamanhoEscrito
            3 -> tamanho = GRANDE.tamanhoEscrito
        }

        return tamanho

    }

//    private fun linhaPeixe(): String = "#$id $nome -> Peixe $cor $tamanho"

}