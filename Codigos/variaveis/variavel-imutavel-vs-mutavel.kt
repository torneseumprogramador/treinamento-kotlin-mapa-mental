fun main() {
    val nome = "João" // Imutável
    var idade = 20 // Mutável

    // nome = "Maria" // Erro de compilação
    idade = 21 // Ok

    println("Nome: $nome")
    println("Idade: $idade")
}