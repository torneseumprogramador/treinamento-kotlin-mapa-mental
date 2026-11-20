fun main() {
    val letra: Char = 'A'
    val texto: String = "Kotlin"

    // String template
    val nome = "Danilo"
    println("Olá, $nome!")
    println("Tamanho: ${nome.length}")

    // String multilinha
    val sql = """
        SELECT *
        FROM usuarios
    """.trimIndent()

    println(sql)
}