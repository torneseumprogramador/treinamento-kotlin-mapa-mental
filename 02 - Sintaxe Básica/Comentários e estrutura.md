---
tags:
  - kotlin
  - sintaxe
---

# Comentários e estrutura

← Voltar para [[00 - Kotlin MOC]] | Relacionado: [[Comandos básicos]] · [[Funções]]

## Comentários

```kotlin
// Comentário de linha

/*
  Comentário
  de bloco
*/

/**
 * KDoc — documentação de API
 * @param nome nome do usuário
 */
fun saudacao(nome: String) { }
```

## Estrutura típica de um arquivo

```kotlin
package com.exemplo.app

import kotlin.math.sqrt

// constantes de arquivo
const val VERSAO = "1.0"

fun main() {
    println(sqrt(9.0))
}

class Usuario(val nome: String)
```

Ordem mental:

1. `package`
2. `import`
3. Declarações de topo (`const`, funções, classes)

## Packages e imports

```kotlin
import com.exemplo.Usuario
import com.exemplo.util.*          // tudo do pacote
import com.exemplo.Logger as Log  // alias
```

## Arquivo sem classe

Em Kotlin, funções e propriedades podem existir **fora** de classes — diferente do Java.

```kotlin
fun dobrar(n: Int) = n * 2
```

## Ponto de entrada

```kotlin
fun main() { }

fun main(args: Array<String>) { }

// Com vararg (mais moderno)
fun main(vararg args: String) { }
```

## Organização recomendada

```
projeto/
└── src/main/kotlin/
    └── com/empresa/app/
        ├── Main.kt
        ├── model/
        └── service/
```

## Próximos

- [[Variáveis]]
- [[Funções]]
- [[Classes e Objetos]]
