---
tags:
  - kotlin
  - funcoes
---

# Funções

← Voltar para [[00 - Kotlin MOC]] | Relacionado: [[Lambda e Higher-Order]] · [[Extension Functions]]

## Declaração básica

```kotlin
fun somar(a: Int, b: Int): Int {
    return a + b
}
```

## Single-expression

```kotlin
fun somar(a: Int, b: Int) = a + b
```

## Parâmetros padrão e nomeados

```kotlin
fun saudacao(nome: String, saudacao: String = "Olá") {
    println("$saudacao, $nome")
}

saudacao("Ana")
saudacao("Ana", "Oi")
saudacao(nome = "Ana", saudacao = "Eaí")
```

## Unit (sem retorno)

```kotlin
fun log(msg: String): Unit {
    println(msg)
}

// Unit pode ser omitido
fun log2(msg: String) {
    println(msg)
}
```

## Vararg

```kotlin
fun media(vararg notas: Double): Double {
    return notas.average()
}

media(7.0, 8.5, 9.0)
```

## Função local

```kotlin
fun processar(lista: List<Int>): Int {
    fun dobro(n: Int) = n * 2
    return lista.sumOf { dobro(it) }
}
```

## Infix / prefix / postfix (operadores)

```kotlin
infix fun Int.ate(fim: Int) = this..fim

1 ate 5  // equivalente a 1.ate(5)
```

## Overload

```kotlin
fun mostrar(x: Int) = println("Int: $x")
fun mostrar(x: String) = println("String: $x")
```

## Visibilidade (resumo)

| Modificador | Escopo |
|-------------|--------|
| `public` (padrão) | Visível em todo lugar |
| `internal` | No mesmo módulo |
| `private` | No arquivo / classe |
| `protected` | Classe + subclasses |

## Próximo nível

- [[Lambda e Higher-Order]]
- [[Extension Functions]]
