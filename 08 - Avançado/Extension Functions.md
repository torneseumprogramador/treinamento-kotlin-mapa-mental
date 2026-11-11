---
tags:
  - kotlin
  - avancado
---

# Extension Functions

← Voltar para [[00 - Kotlin MOC]] | Relacionado: [[Funções]] · [[Collections]]

## O que é

Adicionar funções a tipos **existentes** sem herdar nem modificar a classe original.

```kotlin
fun String.primeiraMaiuscula(): String {
    return replaceFirstChar { it.uppercase() }
}

println("kotlin".primeiraMaiuscula()) // Kotlin
```

## Extension property

```kotlin
val String.quantidadePalavras: Int
    get() = trim().split(Regex("\\s+")).size

"olá mundo kotlin".quantidadePalavras // 3
```

## Casos de uso

- Utilitários de domínio (`User.isAdult()`)
- Melhorar APIs de bibliotecas
- DSLs legíveis
- Helpers de UI no Android (`View.hide()`)

## Limitações importantes

1. Resolvidas **estaticamente** (não são polimórficas de verdade)
2. Não acessam membros `private` / `protected` do tipo receptor
3. Se a classe já tem um membro com a mesma assinatura, o membro ganha

## Exemplo prático

```kotlin
fun List<Int>.mediaOuZero(): Double =
    if (isEmpty()) 0.0 else average()

listOf(8, 9, 10).mediaOuZero()
```

## Ligação com o ecossistema

Muitas APIs Kotlin (Android KTX, stdlib) são extensions — por isso a linguagem “parece mágica”.

## Próximos

- [[Coroutines]]
- [[Interoperabilidade Java]]
