---
tags:
  - kotlin
  - collections
---

# Collections

← Voltar para [[00 - Kotlin MOC]] | Relacionado: [[Lambda e Higher-Order]] · [[Loops]]

## Tipos principais

| Tipo | Ordenada? | Duplicatas? | Acesso |
|------|-----------|-------------|--------|
| `List` | Sim | Sim | Por índice |
| `Set` | Não (exceto Linked) | Não | Por valor |
| `Map` | Não (exceto Linked) | Chaves únicas | Por chave |

## Mutável vs imutável

```kotlin
val imutavel = listOf(1, 2, 3)           // List (read-only)
val mutavel = mutableListOf(1, 2, 3)     // MutableList

mutavel.add(4)
// imutavel.add(4) // erro
```

| Imutável (read-only) | Mutável |
|----------------------|---------|
| `listOf` | `mutableListOf` |
| `setOf` | `mutableSetOf` |
| `mapOf` | `mutableMapOf` |

## List

```kotlin
val frutas = listOf("maçã", "banana", "uva")
frutas[0]
frutas.first()
frutas.last()
frutas.size
```

## Set

```kotlin
val ids = setOf(1, 2, 2, 3) // {1, 2, 3}
```

## Map

```kotlin
val idades = mapOf(
    "Ana" to 30,
    "Bia" to 25
)

idades["Ana"]
idades["Carlos"] // null
```

## Operações funcionais (essenciais)

```kotlin
val nums = listOf(1, 2, 3, 4, 5, 6)

nums.filter { it % 2 == 0 }     // [2, 4, 6]
nums.map { it * 10 }           // [10, 20, 30, 40, 50, 60]
nums.find { it > 3 }           // 4
nums.any { it > 5 }            // true
nums.all { it > 0 }            // true
nums.count { it % 2 == 0 }     // 3
nums.sum()                     // 21
nums.sortedDescending()
nums.groupBy { it % 2 }        // 0 -> pares, 1 -> ímpares
nums.take(3)                   // [1, 2, 3]
nums.drop(3)                   // [4, 5, 6]
```

## flatMap e associate

```kotlin
val palavras = listOf("oi", "kotlin")
palavras.flatMap { it.toList() }  // chars

val mapa = listOf("a", "bb").associateWith { it.length }
// {a=1, bb=2}
```

## Sequences (lazy)

Para pipelines grandes, `asSequence()` evita listas intermediárias:

```kotlin
nums.asSequence()
    .filter { it % 2 == 0 }
    .map { it * it }
    .toList()
```

## Mutação segura

Prefira transformar em nova coleção a mutar compartilhada — combina bem com `val` e [[Coroutines]].

## Mapa mental

```
Collections
├── List / Set / Map
├── Imutável vs Mutable
├── filter / map / find / any / all
├── groupBy / flatMap / associate
└── Sequence (lazy)
```

## Próximos

- [[Lambda e Higher-Order]]
- [[Extension Functions]]
