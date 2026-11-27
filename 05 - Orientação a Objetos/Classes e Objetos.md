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
fun main() {

	class Usuario(val nome: String = "") {
		var email: String = ""
		var senha: String = ""
		
		constructor(nome: String, email: String) : this(nome) {
			this.email = email
			println("Construtor secundário chamado")
		}
		
		constructor(nome: String, email: String, senha: String) : this(nome) {
			this.email = email
			this.senha = senha
			println("Construtor terciário chamado")
		}

	}
	
	// val u = Usuario()
	// val u = Usuario("João")
	// val u = Usuario("João", "joao@gmail.com")
	val u = Usuario("João", "joao@gmail.com", "123456")
	println("Nome: ${u.nome}")
	println("Email: ${u.email}")
}
```

## init

```kotlin
fun main() {
	class Produto(val preco: Double) {
		init {
			require(preco >= 0) { "Preço inválido" } // serve como um validador de entrada
		}
	}

	val p = Produto(100.0)
	println("Preço: ${p.preco}")
	
	val p2 = Produto(-100.0) // erro de compilação
	println("Preço: ${p2.preco}")
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
	get() = largura * altura // propriedade que já devolve calculada
}
  
val r = Retangulo(10, 20)
println("Área: ${r.area}")
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

## Exercícios

Enunciados em `Codigos/orientacao_objetos/exercicios/`:

1. Conta bancária — `private set` + métodos  
2. Cadastro de usuário — construtor secundário + `init`  
3. Pedido da loja — `enum` + `object` + `get`  
4. Factory de retângulo — `companion object`

## Próximos

- [[Herança]]
- [[Interfaces]]
- [[Data Classes]]
