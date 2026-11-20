fun main() {
    val x: Any = "Meus alunos são fodasssssss !!!"

    fun descrever(x: Any): String = when (x) {
        is Int -> "Inteiro: $x"
        is String -> "Texto com ${x.length} chars"
        is Boolean -> "Boolean: $x"
        else -> "Desconhecido"
    }
    
    println(descrever(x))
}
