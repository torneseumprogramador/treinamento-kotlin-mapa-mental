---
tags:
  - kotlin
  - avancado
  - coroutines
---

# Coroutines

← Voltar para [[00 - Kotlin MOC]] | Relacionado: [[Funções]] · [[Lambda e Higher-Order]]

## O que são

Coroutines permitem **concorrência leve** sem a complexidade clássica de threads. Ideais para:

- Chamadas de rede
- Leitura de banco/arquivo
- Trabalho em background no Android
- Pipelines assíncronos no backend

## Conceitos-chave

| Conceito | Ideia |
|----------|-------|
| `suspend` | Função que pode pausar sem bloquear a thread |
| `CoroutineScope` | Limite de vida das coroutines |
| `launch` | Dispara trabalho (fire-and-forget) |
| `async` / `await` | Dispara e espera um resultado |
| `Dispatcher` | Onde roda (CPU, IO, Main) |

## Exemplo mínimo

```kotlin
import kotlinx.coroutines.*

fun main() = runBlocking {
    launch {
        delay(1000)
        println("Mundo")
    }
    println("Olá")
}
```

Saída:

```
Olá
Mundo
```

## suspend

```kotlin
suspend fun buscarUsuario(id: Int): String {
    delay(500) // simula IO
    return "User $id"
}
```

Só pode ser chamada de outra `suspend` ou de uma coroutine.

## launch vs async

```kotlin
runBlocking {
    val job = launch {
        delay(100)
        println("feito")
    }

    val deferred = async {
        buscarUsuario(1)
    }
    println(deferred.await())
}
```

## Dispatchers

```kotlin
launch(Dispatchers.Default) { /* CPU-bound */ }
launch(Dispatchers.IO) { /* rede / disco */ }
launch(Dispatchers.Main) { /* UI (Android) */ }
```

## Cancelamento

Coroutines são canceláveis cooperativamente:

```kotlin
val job = launch {
    repeat(1000) { i ->
        println(i)
        delay(100)
    }
}
delay(250)
job.cancel()
```

## Estrutura mental

```
Coroutines
├── suspend functions
├── Scope (lifecycle)
├── launch / async
├── Dispatchers
└── Cancelamento / exceções
```

## Dependência Gradle

```kotlin
dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.9.0")
}
```

## Dica de estudo

Não tente decorar tudo de uma vez. Ordem boa:

1. `runBlocking` + `launch` + `delay`
2. `suspend`
3. `async`/`await`
4. scopes e cancelamento
5. Flow (streams assíncronos) — próximo nível
