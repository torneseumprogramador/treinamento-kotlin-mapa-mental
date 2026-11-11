---
tags:
  - kotlin
  - fundamentos
  - setup
---

# Instalação

← Voltar para [[00 - Kotlin MOC]] | Anterior: [[O que é Kotlin]] | Próximo: [[Comandos básicos]]

## O que você precisa

1. **JDK** (Java Development Kit) — Kotlin roda na JVM
2. **Kotlin compiler / SDK** — ou um IDE que já inclui
3. (Opcional) **Gradle** ou **Maven** — para projetos reais

## 1. Instalar o JDK

Recomendado: **JDK 17** ou superior (LTS).

### macOS (Homebrew)

```bash
brew install openjdk@17
```

### Verificar

```bash
java -version
```

## 2. Instalar Kotlin

### Opção A — SDKMAN (recomendado no terminal)

```bash
curl -s https://get.sdkman.io | bash
sdk install kotlin
```

### Opção B — Homebrew (macOS)

```bash
brew install kotlin
```

### Opção C — IDE (mais comum no dia a dia)

| IDE | Notas |
|-----|-------|
| **IntelliJ IDEA** | Melhor suporte nativo (JetBrains) |
| **Android Studio** | Ideal para apps Android |
| **VS Code / Cursor** | Extensão Kotlin + JDK |

Com IntelliJ / Android Studio, o Kotlin já vem integrado — basta criar um projeto Kotlin.

## 3. Verificar instalação

```bash
kotlinc -version
kotlin -version
```

## 4. Primeiro “Hello World”

Crie `Hello.kt`:

```kotlin
fun main() {
    println("Olá, Kotlin!")
}
```

Compile e execute:

```bash
kotlinc Hello.kt -include-runtime -d Hello.jar
java -jar Hello.jar
```

Ou rode direto com o script runner:

```bash
kotlinc -script Hello.kts
```

## 5. Projeto com Gradle (padrão moderno)

```bash
# Com o plugin Gradle Kotlin
gradle init --type kotlin-application
```

Ou no IntelliJ: **New Project → Kotlin → JVM**.

Arquivo típico `build.gradle.kts`:

```kotlin
plugins {
    kotlin("jvm") version "2.0.21"
}

repositories {
    mavenCentral()
}

dependencies {
    // dependências aqui
}
```

## Checklist rápido

- [ ] JDK instalado (`java -version`)
- [ ] Kotlin disponível (`kotlinc -version`) **ou** IDE configurada
- [ ] Hello World rodando
- [ ] (Opcional) Projeto Gradle criado

## Próximo

- [[Comandos básicos]]
