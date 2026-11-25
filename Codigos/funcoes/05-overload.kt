// Overload — mesmo nome, parâmetros diferentes

fun mostrar(x: Int) = println("Int: $x")
fun mostrar(x: String) = println("String: $x")
fun mostrar(x: Double) = println("Double: $x")
fun mostrar(x: Boolean) = println("Boolean: $x")

fun main() {
    mostrar(42)
    mostrar("Kotlin")
    mostrar(3.14)
    mostrar(true)
}
