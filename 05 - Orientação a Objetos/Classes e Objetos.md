---
tags:
  - kotlin
  - oop
---

# Classes e Objetos

← Voltar para [[00 - Kotlin MOC]] | Relacionado: [[Herança]] · [[Data Classes]]

## Classe simples

```kotlin
class Pessoa(
    val nome: String,   // propriedade imutável (gera getter)
    var idade: Int      // propriedade mutável (getter + setter)
)

val p = Pessoa("Ana", 30)
println(p.nome)
p.idade = 31
```

O construtor primário fica no cabeçalho da classe.

## Corpo da classe

```kotlin
class Conta(val titular: String, saldoInicial: Double) {
    var saldo = saldoInicial
        private set

    fun depositar(valor: Double) {
        saldo += valor
    }
}
```

## Construtor secundário

```kotlin
class Usuario(val nome: String) {
    var email: String = ""

    constructor(nome: String, email: String) : this(nome) {
        this.email = email
    }
}
```

## init

```kotlin
class Produto(val preco: Double) {
    init {
        require(preco >= 0) { "Preço inválido" }
    }
}
```

## object (Singleton)

```kotlin
object Config {
    const val APP_NAME = "MeuApp"
    fun versao() = "1.0"
}

Config.APP_NAME
```

## companion object

Equivalente a membros `static` do Java:

```kotlin
class Usuario private constructor(val id: String) {
    companion object {
        fun criar(id: String) = Usuario(id)
    }
}

val u = Usuario.criar("42")
```

## Enum

```kotlin
enum class Status {
    ATIVO, INATIVO, PENDENTE
}
```

## Propriedades customizadas

```kotlin
class Retangulo(val largura: Int, val altura: Int) {
    val area: Int
        get() = largura * altura
}
```

## Mapa mental OOP Kotlin

```
Classes
├── Construtor primário
├── init / construtores secundários
├── Propriedades (val/var)
├── Métodos
├── object / companion object
└── enum / data / sealed (ver outras notas)
```

## Próximos

- [[Herança]]
- [[Interfaces]]
- [[Data Classes]]
