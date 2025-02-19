/*fun main(){
    val secuenciaDeLineas = generateSequence {
        var lineaImpar = readln()
        if (lineaImpar != "0") readln() else null
    }

    val secuenciaDeListas = secuenciaDeLineas.map { it.split(" ").map { it.toInt() } }
    secuenciaDeListas.forEach {
        val mapa = it.groupBy { it }
        val entradaModa = mapa.maxByOrNull { it.value.size }
        println(entradaModa?.key)
    }
}*/

/*fun main() {
    generateSequence {
        readln()
            .replace(" ", "")
            .lowercase()
            .takeIf { it != "xxx" }
    }.forEach { entrada ->
        if (entrada == entrada.reversed()) println("SI") else println("NO")
    }
}*/

fun main(){
    generateSequence {
        readln()
            .lowercase()
            .split(" ")
    }.forEach { palabra -> if (palabra[0] == palabra[2]) println("TAUTOLOGIA") else println("NO TAUTOLOGIA") }
}


