---
tags:
  - kotlin
  - controle-de-fluxo
---

# When

← Voltar para [[00 - Kotlin MOC]] | Relacionado: [[Condicionais]] · [[Loops]]

## O que é

`when` é o substituto poderoso do `switch`. Pode ser **statement** ou **expressão**.

## Forma básica

```kotlin
val dia = 3

when (dia) {
    1 -> println("Segunda")
    2 -> println("Terça")
    3 -> println("Quarta")
    else -> println("Outro")
}
```

## Como expressão

```kotlin
val nome = when (dia) {
    1 -> "Segunda"
    2 -> "Terça"
    3 -> "Quarta"
    else -> "Outro"
}
```

## Vários valores no mesmo ramo

```kotlin
when (dia) {
    1, 2, 3, 4, 5 -> "Dia útil"
    6, 7 -> "Fim de semana"
    else -> "Inválido"
}
```

## Ranges e `in`

```kotlin
when (nota) {
    in 90..100 -> "A"
    in 70..89 -> "B"
    in 50..69 -> "C"
    else -> "D"
}
```

## Checagem de tipo (`is`)

```kotlin
fun descrever(x: Any): String = when (x) {
    is Int -> "Inteiro: $x"
    is String -> "Texto com ${x.length} chars"
    is Boolean -> "Boolean: $x"
    else -> "Desconhecido"
}
```

Dentro do ramo, o smart cast já aplica o tipo.

## Sem argumento (como if-else encadeado)

```kotlin
when {
    idade < 12 -> "Criança"
    idade < 18 -> "Adolescente"
    else -> "Adulto"
}
```

## Boas práticas

1. Prefira `when` a longas cadeias de `if/else if`
2. Sempre cubra o `else` se for expressão (exceto sealed classes)
3. Combine com [[Null Safety]] e sealed classes em código avançado

## Próximo

- [[Loops]]
