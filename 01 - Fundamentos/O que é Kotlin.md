---
tags:
  - kotlin
  - fundamentos
---

# O que é Kotlin

← Voltar para [[00 - Kotlin MOC]]

## Definição

**Kotlin** é uma linguagem de programação moderna, **estaticamente tipada**, criada pela JetBrains. Roda na **JVM** (mesmo ambiente do Java) e também em JavaScript, Native e WebAssembly.

## Para que serve

| Área | Uso |
|------|-----|
| **Android** | Linguagem oficial recomendada pelo Google |
| **Backend** | APIs e serviços (Spring, Ktor) |
| **Multiplataforma** | Kotlin Multiplatform (KMP) — compartilhar código entre Android, iOS, desktop, web |
| **Scripts** | Automação e scripts leves |
| **Data / DSLs** | Gradual, build scripts, DSLs internas |

## Características principais

- Concisa — menos boilerplate que Java
- Segura — [[Null Safety]] no sistema de tipos
- Interoperável — chama código Java e vice-versa ([[Interoperabilidade Java]])
- Moderno — coroutines, data classes, extension functions
- Multiplataforma — um código, vários alvos

## Kotlin vs Java (visão rápida)

| Aspecto | Kotlin | Java |
|---------|--------|------|
| Null | Tratado no tipo (`String?`) | Frequentemente `NullPointerException` |
| Verbosity | Mais curto | Mais verboso |
| Classes de dados | `data class` nativo | Precisa gerar equals/hashCode/toString |
| Funções | Cidadãs de primeira classe | Lambdas limitadas (pré-8) / mais verbosas |
| Herança | Classes `final` por padrão | Classes abertas por padrão |

## História rápida

- **2011** — Anunciada pela JetBrains
- **2016** — Kotlin 1.0 (estável)
- **2017** — Google anuncia suporte oficial no Android
- **2019** — Linguagem preferida para Android
- Hoje — amplamente usada em mobile, backend e multiplataforma

## Próximos passos

- [[Instalação]] — preparar o ambiente
- [[Comandos básicos]] — rodar o primeiro programa
