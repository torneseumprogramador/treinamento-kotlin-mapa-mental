---
tags:
  - kotlin
  - controle-de-fluxo
---

# Loops

← Voltar para [[00 - Kotlin MOC]] | Relacionado: [[When]] · [[Collections]]

## for

```kotlin
for (i in 1..5) {
    println(i) // 1 2 3 4 5
}
```

### Ranges úteis

```kotlin
1..5          // 1,2,3,4,5
1 until 5     // 1,2,3,4
5 downTo 1    // 5,4,3,2,1
1..10 step 2  // 1,3,5,7,9
```

### Percorrer coleções

```kotlin
val frutas = listOf("maçã", "banana", "uva")

for (fruta in frutas) {
    println(fruta)
}

for ((indice, fruta) in frutas.withIndex()) {
    println("$indice: $fruta")
}
```

## while / do-while

```kotlin
var n = 3
while (n > 0) {
    println(n)
    n--
}

var x = 0
do {
    println(x)
    x++
} while (x < 3)
```

## break e continue

```kotlin
for (i in 1..10) {
    if (i == 3) continue  // pula o 3
    if (i == 8) break     // para no 8
    println(i)
}
```

## Labels (loops aninhados)

```kotlin
outer@ for (i in 1..3) {
    for (j in 1..3) {
        if (i == 2 && j == 2) break@outer
        println("$i,$j")
    }
}
```

## Alternativas idiomáticas

Em Kotlin, muitas vezes você **não** escreve loop manual:

```kotlin
(1..5).forEach { println(it) }

listOf(1, 2, 3)
    .map { it * 2 }
    .filter { it > 2 }
```

→ Ver [[Collections]] e [[Lambda e Higher-Order]].

## Mapa mental

```
Loops
├── for + ranges
├── for em coleções
├── while / do-while
├── break / continue / labels
└── forEach / map / filter (estilo funcional)
```
