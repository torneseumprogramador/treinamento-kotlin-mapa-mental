---
tags:
  - kotlin
  - fundamentos
  - cli
---

# Comandos básicos

← Voltar para [[00 - Kotlin MOC]] | Anterior: [[Instalação]] | Próximo: [[Variáveis]]

## Compilador e runtime

| Comando                                          | O que faz                              |
| ------------------------------------------------ | -------------------------------------- |
| `kotlinc arquivo.kt`                             | Compila para `.class` (JVM)            |
| `kotlinc arquivo.kt -d app.jar`                  | Compila gerando JAR                    |
| `kotlinc arquivo.kt -include-runtime -d app.jar` | JAR executável (inclui runtime Kotlin) |
| `kotlin ArquivoKt`                               | Executa classe compilada               |
| `java -jar app.jar`                              | Executa JAR                            |
| `kotlinc -script script.kts`                     | Roda script Kotlin                     |
| `kotlinc -version`                               | Mostra versão do compilador            |

## Scripts prontos (`Codigos/`)

```bash
cd Codigos
./rodar-script.sh          # .kts (script)
./rodar-jvm.sh um dois tres  # .kt → JAR + java
./rodar-native.sh          # .kt → binário nativo (precisa Xcode no macOS)
```

| Script | Arquivo | Tipo |
|--------|---------|------|
| `rodar-script.sh` | `arquivo.kts` | Script |
| `rodar-jvm.sh` | `arquivo.kt` | JVM (JAR) |
| `rodar-native.sh` | `HelloNative.kt` | Native |

## Kotlin/Native (sem JVM)

O `kotlinc` normal gera bytecode para a **JVM**. Para binário nativo do SO use **`kotlinc-native`**.

### Pré-requisitos (macOS)

1. Command Line Tools (`xcode-select --install`) **ou** Xcode completo
2. Compilador Native: `brew install --cask kotlin-native`
3. Se só tiver CLT (sem Xcode.app), o Kotlin ainda exige `xcodebuild -version` — neste Mac já foi configurado um **shim** mínimo para isso

Se o macOS bloquear libs baixadas (quarantine):

```bash
xattr -dr com.apple.quarantine "$(brew --prefix)/Caskroom/kotlin-native"
```

### Compilar e rodar

Arquivo de exemplo: `Codigos/HelloNative.kt`

```kotlin
fun main() {
    println("Hello, Kotlin/Native!")
}
```

```bash
cd Codigos
kotlinc-native HelloNative.kt -o HelloNative
./HelloNative.kexe
```

| Comando | O que faz |
|---------|-----------|
| `kotlinc-native HelloNative.kt -o HelloNative` | Gera `HelloNative.kexe` (macOS/Linux) |
| `./HelloNative.kexe` | Roda o binário **sem** JVM |
| `kotlinc-native HelloNative.kt -o HelloNative -opt` | Build otimizado (compila mais lento) |

> A **primeira** compilação demora: baixa LLVM para `~/.konan` (só uma vez).

### JVM vs Native (mesmo código)

```bash
# JVM — precisa de java
kotlinc HelloNative.kt -include-runtime -d HelloNative.jar
java -jar HelloNative.jar

# Native — executável direto no SO
kotlinc-native HelloNative.kt -o HelloNative
./HelloNative.kexe
```

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
