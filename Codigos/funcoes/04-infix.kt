// Funções infix — chamada no meio: a palavra b

infix fun Int.ate(fim: Int) = this..fim

infix fun String.noTime(time: String) = "$this joga no $time"

infix fun Int.elevado(exp: Int): Int {
    var r = 1
    repeat(exp) { r *= this }
    return r
}

infix fun Int.estaEntre(range: IntRange) = this in range

class Carrinho {
    private val itens = mutableListOf<String>()

    infix fun adiciona(produto: String) {
        itens += produto
        println("Adicionado: $produto")
    }

    fun listar() = println("Carrinho: $itens")
}


fun mostrar(x: Int) = println("Int: $x")
fun mostrar(x: String) = println("String: $x")

fun main() {
    print("1 ate 5 → ")
    for (i in 1 ate 5) print("$i ")
    println()

    println("Ana" noTime "Verde")
    println("2 elevado 10 = ${2 elevado 10}")
    println("7 estaEntre 1..10 → ${7 estaEntre 1..10}")
    println("15 estaEntre 1..10 → ${15 estaEntre 1..10}")

    val par = "cidade" to "São Paulo" // infix da stdlib
    println("Pair: $par")

    val c = Carrinho()
    c adiciona "Café"
    c adiciona "Pão"
    c.listar()
}
