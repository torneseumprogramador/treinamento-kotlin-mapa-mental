---
tags:
  - kotlin
  - oop
---

# Herança

← Voltar para [[00 - Kotlin MOC]] | Relacionado: [[Classes e Objetos]] · [[Interfaces]]

## open (importante!)

Em Kotlin, classes e métodos são **final por padrão**. Para herdar, use `open`:

```kotlin
open class Animal(val nome: String) {
    open fun falar() = println("...")
}

class Cachorro(nome: String) : Animal(nome) {
    override fun falar() = println("Au au")
}
```

## Construtor da superclasse

```kotlin
class Cachorro(nome: String, val raca: String) : Animal(nome)
```

## abstract

```kotlin
abstract class Forma {
    abstract fun area(): Double

    fun descrever() = "Área = ${area()}"
}

class Circulo(val r: Double) : Forma() {
    override fun area() = Math.PI * r * r
}
```

## sealed class

Hierarquia fechada — ótima com [[When]]:

```kotlin
sealed class Resultado
data class Sucesso(val dado: String) : Resultado()
data class Erro(val motivo: String) : Resultado()

fun tratar(r: Resultado) = when (r) {
    is Sucesso -> r.dado
    is Erro -> r.motivo
    // else desnecessário se todos os casos estão cobertos
}
```

## super

```kotlin
override fun falar() {
    super.falar()
    println("Au au")
}
```

## Diferença mental: herança vs interface

| | Classe (`open`/`abstract`) | [[Interfaces]] |
|--|----------------------------|----------------|
| Estado | Pode ter propriedades com estado | Por padrão sem estado (com exceções) |
| Construtor | Sim | Não |
| Múltipla | Uma só superclasse | Várias interfaces |

## Boas práticas

1. Prefira composição a herança profunda
2. Use `sealed` para modelar estados/resultados
3. Só abra (`open`) o que realmente precisa ser estendido
