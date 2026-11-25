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

## Infix

`infix` permite chamar uma função **no meio**, sem ponto e sem parênteses — estilo linguagem natural.

**Regras:**

1. Tem que ser **função de membro** ou **extension**
2. Tem que ter **exatamente 1 parâmetro**
3. Esse parâmetro **não** pode ser `vararg` nem ter valor padrão

```kotlin
infix fun Int.ate(fim: Int) = this..fim

1 ate 5        // forma infix
1.ate(5)       // forma normal (igual)
```

### Mais exemplos

**1. Pair — o mais famoso da linguagem**

```kotlin
val par = "nome" to "Ana"     // infix da stdlib
// igual a: "nome".to("Ana")
println(par)                  // (nome, Ana)

val mapa = mapOf(
    "sp" to "São Paulo",
    "rj" to "Rio de Janeiro"
)
```

**2. Pertence a um time**

```kotlin
infix fun String.noTime(time: String) = "$this joga no $time"

println("Ana" noTime "Verde")   // Ana joga no Verde
```

**3. Potência (matemática)**

```kotlin
infix fun Int.elevado(exp: Int): Int {
    var r = 1
    repeat(exp) { r *= this }
    return r
}

println(2 elevado 10)   // 1024
```

**4. Comparação legível**

```kotlin
infix fun Int.estaEntre(range: IntRange) = this in range

println(7 estaEntre 1..10)    // true
println(15 estaEntre 1..10)   // false
```

**5. Adicionar item “com rótulo”**

```kotlin
class Carrinho {
    private val itens = mutableListOf<String>()

    infix fun adiciona(produto: String) {
        itens += produto
        println("Adicionado: $produto")
    }

    fun listar() = println(itens)
}

val c = Carrinho()
c adiciona "Café"
c adiciona "Pão"
c.listar()   // [Café, Pão]
```

### O que **não** funciona

```kotlin
// infix fun Int.soma(a: Int = 0) = this + a   // ❌ parâmetro padrão
// infix fun Int.soma(vararg xs: Int) = ...    // ❌ vararg
// infix fun sozinha(x: Int) = x               // ❌ precisa de receptor (this)
```

### Precedência

Infix tem **precedência baixa**. Prefira parênteses se misturar com outros operadores:

```kotlin
val ok = (1 ate 5).toList()
// sem cuidado, expressões longas ficam ambíguas
```

> `prefix` / `postfix` no Kotlin entram na história de **operator overloading** (`++`, `-a`, etc.), não são a mesma coisa que `infix`. Ver [[Extension Functions]] e operadores avançados depois.


## Overload

```kotlin
fun mostrar(x: Int) = println("Int: $x")
fun mostrar(x: String) = println("String: $x")
```

## Visibilidade (resumo)

| Modificador       | Escopo                |
| ----------------- | --------------------- |
| `public` (padrão) | Visível em todo lugar |
| `internal`        | No mesmo módulo       |
| `private`         | No arquivo / classe   |
| `protected`       | Classe + subclasses   |
|                   |                       |

## Exemplos para rodar

Pasta `Codigos/funcoes/` — veja o `README.md` de lá.

```bash
cd Codigos/funcoes
./exec.sh 01-basico.kt
./exec.sh 04-infix.kt
```

## Exercícios

Enunciados em `Codigos/funcoes/exercicios/` (um `.md` cada):

1. Orçamento de viagem — funções básicas / padrão / nomeados  
2. Boletim da turma — `vararg` + função local  
3. Carrinho infix — `infix`  
4. Relatório de vendas — lambda + `filter`/`map`/`any`/`reduce`

## Próximo nível

- [[Lambda e Higher-Order]]
- [[Extension Functions]]
