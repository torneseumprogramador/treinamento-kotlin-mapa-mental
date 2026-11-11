---
tags:
  - kotlin
  - sintaxe
---

# Variáveis

← Voltar para [[00 - Kotlin MOC]] | Relacionado: [[Tipos de dados]]

## val vs var

| Palavra | Mutável? | Uso |
|---------|----------|-----|
| `val` | Não (somente leitura) | Preferir sempre que possível |
| `var` | Sim | Quando o valor precisa mudar |

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

Detalhes avançados aparecem em [[Classes e Objetos]].

## Boas práticas

1. Prefira `val` a `var`
2. Deixe o tipo implícito quando for óbvio
3. Evite variáveis mutáveis compartilhadas (ajuda com [[Coroutines]])

## Próximos

- [[Tipos de dados]]
- [[Operadores]]
- [[Null Safety]]
