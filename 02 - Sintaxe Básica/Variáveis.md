---
tags:
  - kotlin
  - sintaxe
---

# Variáveis

← Voltar para [[00 - Kotlin MOC]] | Relacionado: [[Tipos de dados]]

## val vs var

| Palavra | Mutável?              | Uso                          |
| ------- | --------------------- | ---------------------------- |
| `val`   | Não (somente leitura) | Preferir sempre que possível |
| `var`   | Sim                   | Quando o valor precisa mudar |

```kotlin
val nome = "Ana"      // imutável
var idade = 25        // mutável
idade = 26            // ok
// nome = "Bia"       // erro de compilação
```

## Inferência de tipo

O compilador descobre o tipo:

```kotlin
val cidade = "São Paulo"   // String
val populacao = 12_000_000 // Int
val pi = 3.14              // Double
```

Ou declare explicitamente:

```kotlin
val cidade: String = "São Paulo"
val populacao: Int = 12_000_000
```

## const val

Para constantes **em tempo de compilação** (só no topo de arquivo ou em `object`):

```kotlin
const val MAX_USUARIOS = 100
```

Diferença mental:

- `val` → imutável em runtime
- `const val` → valor fixo conhecido em compile-time

## Lazy e late init (preview)

```kotlin
val config by lazy { carregarConfig() }  // inicializa na 1ª leitura

lateinit var db: Database                // só para var não-nulo (classes)
```

### `lateinit var` — o que é

Você declara a propriedade **agora**, mas só atribui o valor **depois** (em outro método, no setup, etc.). O compilador não exige inicializar na declaração.

**Regras:**

| Pode | Não pode |
|------|----------|
| `var` | `val` |
| Tipos de objeto (`String`, `Database`, classes) | Tipos primitivos (`Int`, `Boolean`, `Double`…) |
| Não-nulo (`String`) | Anulável (`String?`) — aí use `null` mesmo |
| Propriedades de **classe** | Variáveis locais dentro de `fun main` |

### Exemplos

**1. Setup depois do construtor**

```kotlin
class App {
    lateinit var db: Database

    fun iniciar() {
        db = Database("jdbc:...")  // agora sim
        db.conectar()
    }
}
```

**2. Injeção / configuração externa**

```kotlin
class UsuarioService {
    lateinit var repo: UsuarioRepository

    fun configurar(repo: UsuarioRepository) {
        this.repo = repo
    }

    fun buscar(id: Int) = repo.findById(id)
}
```

**3. Testar se já foi inicializado**

```kotlin
class Tela {
    lateinit var titulo: String

    fun mostrar() {
        if (::titulo.isInitialized) {
            println(titulo)
        } else {
            println("Título ainda não definido")
        }
    }
}
```

**4. Erro comum — usar antes de atribuir**

```kotlin
class Exemplo {
    lateinit var nome: String

    fun falha() {
        println(nome)  // UninitializedPropertyAccessException em runtime
    }
}
```

**5. O que NÃO funciona**

```kotlin
// lateinit val x: String = ...     // erro — só var
// lateinit var nulo: String? = ... // erro — não pode ser anulável
// lateinit var idade: Int          // erro — Int é primitivo
// fun main() { lateinit var a: String } // erro — não é propriedade de classe
```

**Quando usar:** dependência que só existe depois (Android views, DI, conexão).  
**Quando evitar:** se pode ser `null`, use `String?`; se calcula na 1ª leitura, prefira `by lazy`.

Código em: `Codigos/variaveis/lateinit-exemplo.kt`

Detalhes de classes em [[Classes e Objetos]].

## Boas práticas

1. Prefira `val` a `var`
2. Deixe o tipo implícito quando for óbvio
3. Evite variáveis mutáveis compartilhadas (ajuda com [[Coroutines]])

## Exercícios

Pratique em [[Exercicios - Variaveis e Tipos]] (`Codigos/Exercicio/`).

## Próximos

- [[Tipos de dados]]
- [[Operadores]]
- [[Null Safety]]
