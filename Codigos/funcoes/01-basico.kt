// Declaração básica + single-expression + Unit

fun somar(a: Int, b: Int): Int {
    return a + b
}

fun somarCurto(a: Int, b: Int) = a + b

fun log(msg: String) {
    println(msg)
}

fun main() {
    println("somar(2, 3) = ${somar(2, 3)}")
    println("somarCurto(10, 5) = ${somarCurto(10, 5)}")
    log("Função Unit: só executa, não devolve valor útil")
}
