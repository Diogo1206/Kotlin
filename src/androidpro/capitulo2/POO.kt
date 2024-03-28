package androidpro.capitulo2

class  Carro(var cor: String, var ano: Int, var modelo:String) {

        init {
            println("Contruindo um Carro")
        }

       fun acelerar(){
        println("Acelerando o $modelo")
    }
}
fun main (args: Array<String>){
    val uno = Carro ("Amarelo", 2018, "Uno")
    println("Uno: Cor ${uno.cor}, Ano ${uno.ano}, Modelo ${uno.modelo}")

    val mercedes = Carro ("Preta", 2010, "C13")
    println("Mercedes: Cor ${mercedes.cor}, Ano ${mercedes.ano}, Modelo ${mercedes.modelo}")
    mercedes.acelerar()
}