---
tags:
  - kotlin
  - controle-de-fluxo
---

# Condicionais

← Voltar para [[00 - Kotlin MOC]] | Relacionado: [[When]] · [[Operadores]]

## if / else

```kotlin
val idade = 18

if (idade >= 18) {
    println("Maior de idade")
} else {
    println("Menor de idade")
}
```

## if como expressão

Em Kotlin, `if` **retorna valor**:

```kotlin
val status = if (idade >= 18) "adulto" else "jovem"
```

```kotlin
val max = if (a > b) {
    println("a é maior")
    a
} else {
    b
}
```

A última expressão do bloco é o resultado.

## else if

```kotlin
val nota = 7

val conceito = if (nota >= 9) {
    "A"
} else if (nota >= 7) {
    "B"
} else if (nota >= 5) {
    "C"
} else {
    "D"
}
```

Para vários casos, prefira [[When]].

## Operador ternário?

**Não existe** em Kotlin. Use `if` expressão:

```kotlin
// Java:  x > 0 ? "pos" : "neg"
val sinal = if (x > 0) "pos" else "neg"
```

## Checklist mental

- Precisa de valor? → `if` expressão
- Muitos ramos? → [[When]]
- Checagem de null? → [[Null Safety]] (`?.`, `?:`, `if (x != null)`)
