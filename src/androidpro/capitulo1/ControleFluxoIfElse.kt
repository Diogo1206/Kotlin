package androidpro.capitulo1

fun main() {
    var idade: Int = 19

    if (idade < 18) {
        println("Não pode beber e nem tirar carta")
    } else if (idade< 21) {
        println("Não pode beber mas pode tirar carta")
    } else if (idade < 25) {
        println("Pode beber e pode tirar carta")
    } else {
        println("Está Liberado")
    }

    var str: String = if (idade < 18) {
        println("Idade Verificada")
        "Menor de idade"
    } else {
        "Maior de idade"
    }
    println(str)
}
