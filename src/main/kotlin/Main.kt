import MENUS.*
import AquarioEnum.*

var capacidadeMaxDePeixes = 0

//TRATAR ENTRADAS INVÁLIDAS

fun main() {

    /* Escolha tamanho do aquario, para sabermos a capacidade maxima*/
    /* Isso irá ser util tanto para saber se pode adicionar mais, e sobre qual o range para o random de alimetação */
    escolherTamanhoAquario()

    /* Agora selecinar oque quer fazer com o aquário comprado */
    /* Assim "chamando" class aquário */
//    println("Agora que você tem seu aquário, oque deseja fazer?") // TALVEZ TIRAR ESSA FRASE
    println(MENUS_INICIAL.Opcoes) // monstar a quantidade de peixes restante pela capacidade do aquário

    do {
        val selecaoMenuPrincipal = readln().toInt()

        when(selecaoMenuPrincipal){
            1 -> Aquario(capacidadeMaxDePeixes).adicionarPeixe()
            2 -> Aquario(capacidadeMaxDePeixes).alimentarPeixe()
            3 -> Aquario(capacidadeMaxDePeixes).mostrarPeixesDoAquario()
            4 -> Aquario(capacidadeMaxDePeixes).limparAquario()
            5 -> upgradeAquario()
        }

    } while(selecaoMenuPrincipal != 0)
      println("Fechando aquário...")
}

fun escolherTamanhoAquario(){

    println(MENUS_TAMANHO_AQUARIOS.Opcoes)
    capacidadeMaxDePeixes = when (readln().toInt()) {
        P.idAquario -> P.capacidadeAquario
        M.idAquario -> M.capacidadeAquario
        G.idAquario -> G.capacidadeAquario
        X.idAquario -> X.capacidadeAquario
        else -> return
    }

}

fun upgradeAquario(){
    println(MENUS_TAMANHO_AQUARIOS_UPGRADE.Opcoes)
    capacidadeMaxDePeixes = when (readln().toInt()) {
        P.idAquario -> P.capacidadeAquario
        M.idAquario -> M.capacidadeAquario
        G.idAquario -> G.capacidadeAquario
        X.idAquario -> X.capacidadeAquario
        else -> return
    }
}
