package androidpro.capitulo1

import java.sql.Date

fun main() {
    olaMundo()
    println(queHorasSao())

    var total = soma(10, 12)
    println("Total $total")
}

fun soma(a: Int, b: Int): Int {
    return a + b
}
fun queHorasSao(): java.util.Date {
    return java.util.Date()
    println()

}
fun olaMundo() {
    println("Olá Mundo!")
}