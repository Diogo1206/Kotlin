package androidpro.capitulo1
fun main() {
    var opcao: Int = 2

    when (opcao){
        1 -> println("Conta Corrente")
        2 -> println("Cartão de Crédito")
        3 -> println("Internet Banking")
        else -> {
            println("Nenhuma opção encontrada")
            println("Fale com um de nossos atendentes!")
        }
    }

    println()
    var opcaoSel =  when (opcao){
        1 -> ("Conta Corrente")
        2 -> ("Cartão de Crédito")
        3 -> ("Internet Banking")
        else -> {
            println("Nenhuma opção encontrada")
            println("Fale com um de nossos atendentes!")
            "Nenhuma opção encontrada"
        }

    }
    println("Opção Selecionada: $opcao - $opcaoSel" )
}