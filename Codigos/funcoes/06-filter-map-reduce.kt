// Lambdas em collections: filter, map, any, reduce
// Relacionado: [[Lambda e Higher-Order]] · [[Collections]]

fun main() {
    val nums = listOf(1, 2, 3, 4, 5)
    println("Lista: $nums")

    // só os pares
    val pares = nums.filter { it % 2 == 0 }
    println("filter (pares): $pares")          // [2, 4]

    // cada número ao quadrado
    val quadrados = nums.map { it * it }
    println("map (ao quadrado): $quadrados")   // [1, 4, 9, 16, 25]

    // existe algum > 3?
    val temMaiorQue3 = nums.any { it > 3 }
    println("any (> 3): $temMaiorQue3")        // true

    // soma acumulando: acc começa no 1º elemento
    val soma = nums.reduce { acc, n -> acc + n }
    println("reduce (soma): $soma")            // 15

    // encadeando (pipeline)
    val somaDosParesAoQuadrado = nums
        .filter { it % 2 == 0 }
        .map { it * it }
        .reduce { acc, n -> acc + n }
    println("pares² somados: $somaDosParesAoQuadrado") // 4 + 16 = 20
}
