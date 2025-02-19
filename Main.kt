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

//
// Funcionesde alcance y lambda receivers
//

/*class Persona(var nombre: String, var edad: Int)

fun main() {
    val personas: List<Persona?> = listOf(Persona("yo", 34), null, Persona("tu", 23), Persona("el", 98))
    personas.forEach {
        it?.let { println(it.nombre + " " + it.edad) }
    }
}*/

/*data class Persona(var nombre: String, var edad: Int)

fun main() {
    val personas: List<Persona?> = listOf(
        Persona("yo", 34),
        null,
        Persona("tu", 23),
        Persona("el", 98)
    )

    personas.forEach {
        it?.apply {
            it.nombre = it.nombre.uppercase()
            it.edad += 1
        }
    }

    println(personas)
}*/

/*class Persona(var nombre: String, var edad: Int)

fun main() {
    val personas: List<Persona?> = listOf(
        Persona("yo", 34),
        null,
        Persona("tu", 23),
        Persona("el", 98)
    )

    val descripciones = mutableListOf<String?>()

    personas.forEach {
        it?.run {
            descripciones.add("La persona ${this.nombre} tiene ${this.edad - 5} años")
        }
            ?: descripciones.add(null)
    }
    println(descripciones)
}*/

