// Vararg + função local

fun media(vararg notas: Double): Double {
    return notas.average()
}

fun processar(lista: List<Int>): Int {
    fun dobro(n: Int) = n * 2   // só existe dentro de processar
    return lista.sumOf { dobro(it) }
}

fun main() {
    println("Média: ${media(7.0, 8.5, 9.0)}")
    println("Média (1 nota): ${media(10.0)}")

    val numeros = listOf(1, 2, 3, 4)
    println("Soma dos dobros: ${processar(numeros)}") // (2+4+6+8) = 20
}
