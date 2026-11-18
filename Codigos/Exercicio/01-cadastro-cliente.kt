// Exercício 1 — Cadastro de cliente
// Tema: val/var, const val, String, Int, Boolean, conversão, string template
// Enunciado: 02 - Sintaxe Básica/Exercicios - Variaveis e Tipos.md

const val NOME_SISTEMA = "Sistema CRM"

fun main() {
    // TODO: pedir nome (String)
    print("Digite seu nome: ")
    val nome = readlnOrNull() ?: ""

    // TODO: pedir idade (String do teclado → Int com .toInt())
    print("Digite sua idade: ")
    var idade = readlnOrNull()?.toIntOrNull() ?: 0
    
    // TODO: pedir e-mail (String)
    print("Digite seu e-mail: ")
    val email = readlnOrNull() ?: ""

    // TODO: pedir VIP (true/false → .toBoolean())
    print("Você é VIP? (s/n): ")
    val vip = readlnOrNull()?.lowercase() == "s"

    // TODO: se quiser, use var na idade e corrija o valor uma vez
    idade += 1
    println("crescentei 1 ano e agora você tem $idade anos")

    // TODO: imprimir a ficha com string template
    println("=== $NOME_SISTEMA ===")
    println("Nome: $nome")
    println("Idade: $idade")
    println("E-mail: $email")
    println("VIP: $vip")
}
