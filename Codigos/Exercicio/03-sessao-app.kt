// Exercício 3 — Sessão do app
// Tema: lateinit, isInitialized, String?, string template
// Enunciado: 02 - Sintaxe Básica/Exercicios - Variaveis e Tipos.md

class Sessao {
    // TODO: lateinit var nomeUsuario: String
    // TODO: lateinit var email: String
    // TODO: var telefone: String? = null

    fun status() {
        // TODO: if (::nomeUsuario.isInitialized) { ... } else { ... }
    }

    fun login(nome: String, email: String) {
        // TODO: atribuir os lateinit
    }

    fun informarTelefone(tel: String) {
        // TODO: telefone = tel
    }
}

fun main() {
    val sessao = Sessao()

    // TODO: status() antes do login
    // TODO: ler nome e e-mail e chamar login(...)
    // TODO: ler telefone; se vazio, deixe null; senão informarTelefone(...)
    // TODO: status() de novo
}
