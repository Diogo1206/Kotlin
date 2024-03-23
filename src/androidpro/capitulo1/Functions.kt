package androidpro.capitulo1


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


}
fun olaMundo() {
    println("Olá Mundo!")
}