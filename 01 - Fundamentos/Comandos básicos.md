---
tags:
  - kotlin
  - fundamentos
  - cli
---

# Comandos básicos

← Voltar para [[00 - Kotlin MOC]] | Anterior: [[Instalação]] | Próximo: [[Variáveis]]

## Compilador e runtime

| Comando | O que faz |
|---------|-----------|
| `kotlinc arquivo.kt` | Compila para `.class` (JVM) |
| `kotlinc arquivo.kt -d app.jar` | Compila gerando JAR |
| `kotlinc arquivo.kt -include-runtime -d app.jar` | JAR executável (inclui runtime Kotlin) |
| `kotlin ArquivoKt` | Executa classe compilada |
| `java -jar app.jar` | Executa JAR |
| `kotlinc -script script.kts` | Roda script Kotlin |
| `kotlinc -version` | Mostra versão do compilador |

## REPL (terminal interativo)

```bash
kotlinc
```

No REPL:

```kotlin
>>> val nome = "Kotlin"
>>> println(nome)
Kotlin
```

Saia com `:quit`.

## Gradle (projetos)

| Comando | O que faz |
|---------|-----------|
| `./gradlew build` | Compila e empacota |
| `./gradlew run` | Executa a aplicação |
| `./gradlew test` | Roda testes |
| `./gradlew clean` | Limpa build |
| `./gradlew dependencies` | Lista dependências |

## Estrutura mínima de um arquivo `.kt`

```kotlin
fun main() {
    println("Hello")
}
```

- Ponto de entrada: `fun main()`
- Pode receber args: `fun main(args: Array<String>)`
- Pacote opcional no topo: `package com.exemplo`

## Convenções de nome

| Item | Convenção | Exemplo |
|------|-----------|---------|
| Arquivo | PascalCase ou kebab conforme projeto | `Main.kt`, `UserService.kt` |
| Classe | PascalCase | `Usuario` |
| Função / variável | camelCase | `calcularTotal` |
| Constante | SCREAMING_SNAKE | `MAX_TENTATIVAS` |
| Pacote | minúsculas | `com.empresa.app` |

## Atalhos úteis no IntelliJ / Android Studio

| Ação | Atalho (macOS) |
|------|----------------|
| Rodar | `⌃⌃` (duas vezes Control) → Run |
| Reformatar | `⌥⌘L` |
| Autocomplete | `⌃Espaço` |
| Ir para definição | `⌘B` |

## Fluxo mental

```
código .kt  →  kotlinc / Gradle  →  bytecode JVM  →  java / kotlin runtime
```

## Relacionados

- [[O que é Kotlin]]
- [[Variáveis]]
- [[Comentários e estrutura]]
