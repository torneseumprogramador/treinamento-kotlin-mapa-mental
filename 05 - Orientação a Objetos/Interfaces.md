---
tags:
  - kotlin
  - oop
---

# Interfaces

← Voltar para [[00 - Kotlin MOC]] | Relacionado: [[Herança]] · [[Classes e Objetos]]

## Declaração

```kotlin
interface Autenticavel {
    fun login(senha: String): Boolean
}
```

## Implementação

```kotlin
class Admin(val nome: String) : Autenticavel {
    override fun login(senha: String) = senha == "123"
}
```

## Métodos com corpo padrão

```kotlin
interface Logger {
    fun log(msg: String) {
        println(msg)
    }
}
```

## Propriedades em interface

```kotlin
interface Nomeado {
    val nome: String  // precisa ser implementada (sem campo por padrão)
}
```

## Múltiplas interfaces

```kotlin
interface Voador {
    fun voar()
}

interface Nadador {
    fun nadar()
}

class Pato : Voador, Nadador {
    override fun voar() = println("Voando")
    override fun nadar() = println("Nadando")
}
```

## Conflito de métodos padrão

Se duas interfaces têm o mesmo método, a classe deve resolver:

```kotlin
interface A {
    fun ok() = println("A")
}
interface B {
    fun ok() = println("B")
}

class C : A, B {
    override fun ok() {
        super<A>.ok()
    }
}
```

## Interface vs abstract class

- Precisa de estado/construtor compartilhado? → `abstract class`
- Só contrato / comportamento? → `interface`
- Várias capacidades? → várias `interface`s

## Relacionados

- [[Herança]]
- [[Data Classes]]
