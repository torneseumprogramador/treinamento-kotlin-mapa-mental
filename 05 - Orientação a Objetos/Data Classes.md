---
tags:
  - kotlin
  - oop
---

# Data Classes

← Voltar para [[00 - Kotlin MOC]] | Relacionado: [[Classes e Objetos]]

## O que é

Classe feita para **guardar dados**. O compilador gera automaticamente:

- `equals()` / `hashCode()`
- `toString()`
- `copy()`
- `componentN()` (destructuring)

```kotlin
data class Usuario(val id: Int, val nome: String)

val u1 = Usuario(1, "Ana")
val u2 = Usuario(1, "Ana")

println(u1)          // Usuario(id=1, nome=Ana)
println(u1 == u2)    // true
```

## copy

```kotlin
val u3 = u1.copy(nome = "Bia")
```

Útil para imutabilidade: em vez de mutar, cria uma cópia alterada.

## Destructuring

```kotlin
val (id, nome) = u1
println("$id - $nome")
```

## Regras

1. Precisa de pelo menos 1 parâmetro no construtor primário
2. Parâmetros do primário: `val` ou `var`
3. Não pode ser `abstract`, `open`, `sealed` *ou* `inner` (nas versões clássicas; sealed data subclasses existem em hierarquias sealed)
4. Pode implementar interfaces

## Quando usar

| Use `data class` | Use classe normal |
|------------------|-------------------|
| DTOs, modelos, estados | Comportamento complexo / regras ricas |
| Chaves de Map / sets | Herança aberta frequente |
| Imutabilidade + copy | Ciclo de vida / side-effects |

## Exemplo com sealed

```kotlin
sealed class UiState
data class Loading(val progresso: Int) : UiState()
data class Success(val dados: List<String>) : UiState()
object Empty : UiState()
```

## Próximos

- [[Null Safety]]
- [[Collections]]
