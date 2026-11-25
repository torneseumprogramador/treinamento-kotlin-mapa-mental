// Parâmetros padrão e nomeados

fun saudacao(nome: String, saudacao: String = "Olá") {
    println("$saudacao, $nome!")
}

fun pedido(produto: String, qtd: Int = 1, urgente: Boolean = false) {
    println("Produto: $produto | Qtd: $qtd | Urgente: $urgente")
}

fun main() {
    saudacao("Ana")
    saudacao("Ana", "Oi")
    saudacao(nome = "Ana", saudacao = "Eaí")

    println("---")
    pedido("Café")
    pedido("Café", 3)
    pedido(produto = "Pão", urgente = true) // qtd fica no padrão = 1
}
