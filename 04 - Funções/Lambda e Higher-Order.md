---
tags:
  - kotlin
  - funcoes
  - lambda
---

# Lambda e Higher-Order

← Voltar para [[00 - Kotlin MOC]] | Relacionado: [[Funções]] · [[Collections]]

## Lambda

Função anônima entre `{ }`:

```kotlin
val dobrar = { n: Int -> n * 2 }
println(dobrar(4)) // 8
```

## Trailing lambda

Se o último parâmetro é uma função, a lambda pode sair dos `()`:

```kotlin
fun repetir(vezes: Int, acao: () -> Unit) {
    repeat(vezes) { acao() }
}

repetir(3) {
    println("Oi")
}
```

## `it`

Lambda de **um** parâmetro pode usar `it`:

```kotlin
listOf(1, 2, 3).map { it * 2 }  // [2, 4, 6]
```

## Higher-Order Function

Função que **recebe** ou **retorna** outra função:

```kotlin
fun operar(a: Int, b: Int, op: (Int, Int) -> Int): Int {
    return op(a, b)
}

operar(2, 3) { x, y -> x + y }  // 5
operar(2, 3) { x, y -> x * y }  // 6
```

Tipo de função: `(Int, Int) -> Int`

## Method references

```kotlin
fun triplo(n: Int) = n * 3

listOf(1, 2, 3).map(::triplo)
```

## `also`, `apply`, `let`, `run`, `with`

Scope functions — úteis no dia a dia:

| Função | Objeto | Retorno | Uso típico |
|--------|--------|---------|------------|
| `let` | `it` | resultado do bloco | null-safety / transformar |
| `run` | `this` | resultado do bloco | configurar + calcular |
| `with` | `this` | resultado do bloco | vários calls no objeto |
| `apply` | `this` | o próprio objeto | configurar objeto |
| `also` | `it` | o próprio objeto | side-effects / log |

```kotlin
val nome = "  kotlin  "
    .trim()
    .replaceFirstChar { it.uppercase() }
    .also { println("Valor: $it") }
```

## Ligação com Collections

```kotlin
val nums = listOf(1, 2, 3, 4, 5)

nums.filter { it % 2 == 0 }
nums.map { it * it }
nums.any { it > 3 }
nums.reduce { acc, n -> acc + n }
```

→ Ver [[Collections]].
