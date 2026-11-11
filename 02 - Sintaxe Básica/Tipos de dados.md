---
tags:
  - kotlin
  - sintaxe
  - tipos
---

# Tipos de dados

← Voltar para [[00 - Kotlin MOC]] | Relacionado: [[Variáveis]] · [[Null Safety]]

## Tipos numéricos

| Tipo | Bits | Exemplo |
|------|------|---------|
| `Byte` | 8 | `1` |
| `Short` | 16 | `100` |
| `Int` | 32 | `42` |
| `Long` | 64 | `42L` |
| `Float` | 32 | `3.14f` |
| `Double` | 64 | `3.14` |

```kotlin
val inteiro: Int = 10
val longo: Long = 10L
val decimal: Double = 10.5
val flutuante: Float = 10.5f
```

## Texto e caracteres

```kotlin
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
```

## Boolean

```kotlin
val ativo: Boolean = true
val bloqueado = false
```

## Any, Unit, Nothing

| Tipo | Significado |
|------|-------------|
| `Any` | Superclasse de todos os tipos não-nulos (como `Object` em Java) |
| `Unit` | “Sem retorno útil” (como `void`) |
| `Nothing` | Função que nunca retorna (ex.: lança exceção) |

```kotlin
fun log(msg: String): Unit {
    println(msg)
}

fun falha(msg: String): Nothing {
    throw IllegalStateException(msg)
}
```

## Arrays

```kotlin
val nums = arrayOf(1, 2, 3)
val zeros = IntArray(5) // [0, 0, 0, 0, 0]
```

Para listas do dia a dia, prefira [[Collections]].

## Conversão de tipos

Kotlin **não** converte números implicitamente:

```kotlin
val i: Int = 10
val l: Long = i.toLong()
val s: String = i.toString()
```

## Tipos anuláveis

```kotlin
val nome: String = "Ana"     // nunca null
val apelido: String? = null  // pode ser null
```

→ Estude a fundo em [[Null Safety]].

## Mapa mental dos tipos

```
Tipos Kotlin
├── Primitivos (na JVM viram primitivos quando possível)
│   ├── Numéricos: Byte, Short, Int, Long, Float, Double
│   ├── Char
│   └── Boolean
├── String
├── Any / Unit / Nothing
└── Anuláveis: Tipo?
```
