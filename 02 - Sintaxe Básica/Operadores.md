---
tags:
  - kotlin
  - sintaxe
---

# Operadores

← Voltar para [[00 - Kotlin MOC]] | Relacionado: [[Tipos de dados]] · [[Condicionais]]

## Aritméticos

```kotlin
val a = 10
val b = 3

a + b  // 13
a - b  // 7
a * b  // 30
a / b  // 3  (divisão inteira)
a % b  // 1
```

## Comparação

```kotlin
a == b   // igualdade estrutural (equals)
a != b
a < b
a <= b
a > b
a >= b
```

## Referência vs igualdade

```kotlin
val x = listOf(1, 2)
val y = listOf(1, 2)

x == y   // true  — conteúdo igual
x === y  // false — não é o mesmo objeto
x !== y  // true
```

## Lógicos

```kotlin
val ok = true
val admin = false

ok && admin  // E
ok || admin  // OU
!ok          // NÃO
```

## Atribuição composta

```kotlin
var n = 5
n += 2  // 7
n -= 1  // 6
n *= 2  // 12
n /= 3  // 4
```

## Elvis e safe calls (null)

```kotlin
val tamanho = texto?.length ?: 0
```

→ Detalhes em [[Null Safety]].

## Range e `in`

```kotlin
val x = 5
x in 1..10        // true
x !in 1..4        // true
'a' in 'a'..'z'   // true
```

Usado muito em [[Loops]] e [[When]].

## Operadores de bit (resumo)

```kotlin
val flags = 0b1010
flags and 0b1100   // AND
flags or 0b0001    // OR
flags xor 0b1111   // XOR
flags.inv()        // NOT
flags shl 1        // shift left
flags shr 1        // shift right
```
