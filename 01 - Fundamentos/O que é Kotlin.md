---
tags:
  - kotlin
  - fundamentos
---

# O que é Kotlin

← Voltar para [[00 - Kotlin MOC]]

## Definição

**Kotlin** é uma linguagem de programação moderna, **estaticamente tipada** e **fortemente tipada**, criada pela JetBrains. Roda na **JVM** (mesmo ambiente do Java) e também em JavaScript, Native e WebAssembly.

Em uma frase: é uma linguagem de **alto nível**, **compilada**, pensada para ser mais segura e concisa que Java, sem abandonar o ecossistema Java.

## Respostas rápidas

| Pergunta | Resposta |
|----------|----------|
| É tipada? | Sim — **estática** e **forte** |
| É compilada? | Sim — compila para bytecode JVM, JS, Native ou Wasm |
| É de baixo nível? | Não — é de **alto nível** (como Java, C#, Swift) |
| Por que foi criada? | Melhorar a experiência do Java: menos código, mais segurança, mesma JVM |
| Quem criou? | JetBrains (empresa do IntelliJ IDEA) |
| Quando ficou estável? | 2016 (Kotlin 1.0) |

## Tipagem: estática e forte

### Estaticamente tipada

Os tipos são verificados **em tempo de compilação**, não só quando o programa roda.

```kotlin
val idade: Int = 25
// idade = "vinte"  // erro de compilação — tipo incompatível
```

Você pode omitir o tipo quando o compilador consegue inferir (`val x = 10` → `Int`), mas o tipo **existe** e é fixo.

### Fortemente tipada

Kotlin **não** faz conversões implícitas perigosas entre tipos incompatíveis.

```kotlin
val a: Int = 10
val b: Double = 2.5
// val soma = a + b        // erro — Int e Double não misturam sozinhos
val soma = a.toDouble() + b // ok — conversão explícita
```

Isso reduz bugs do tipo “o computador ‘chutou’ o tipo errado”.

> **Resumo:** tipagem **estática** = o compilador sabe o tipo antes de rodar. Tipagem **forte** = conversões entre tipos diferentes precisam ser claras.

Relacionado: [[Tipos de dados]] · [[Variáveis]] · [[Null Safety]]

## É compilada?

Sim. Kotlin **não** é interpretada no sentido clássico (como um script Python puro). O fluxo típico na JVM é:

```
Código .kt  →  Compilador (kotlinc)  →  Bytecode (.class / .jar)  →  JVM executa
```

| Alvo | O que gera |
|------|------------|
| **Kotlin/JVM** | Bytecode Java (`.class` / `.jar`) — o mais comum |
| **Kotlin/JS** | JavaScript |
| **Kotlin/Native** | Binário nativo (LLVM) — iOS, Linux, Windows, etc. |
| **Kotlin/Wasm** | WebAssembly |

No dia a dia Android/backend, você quase sempre usa **Kotlin/JVM**: o código Kotlin e o Java podem viver no mesmo projeto porque ambos viram bytecode para a JVM.

Há também modo script (`.kts`), útil para builds e automação — por baixo dos panos ainda passa pelo compilador.

Relacionado: [[Instalação]] · [[Comandos básicos]]

## Alto nível ou baixo nível?

Kotlin é uma linguagem de **alto nível**.

| Nível | Exemplos | O que você manipula |
|-------|----------|---------------------|
| **Baixo** | Assembly, C (em muitos contextos) | Memória, registradores, detalhes da máquina |
| **Alto** | Kotlin, Java, Python, C#, Swift | Classes, funções, tipos, abstrações |

Em Kotlin você:

- Não gerencia memória manualmente (há **garbage collector** na JVM)
- Trabalha com objetos, funções, collections, null safety
- Deixa o runtime cuidar de threads, heap, etc. (salvo quando você usa APIs de baixo nível de propósito)

Kotlin/Native e interoperabilidade com C existem, mas a linguagem em si continua sendo de alto nível — só consegue **falar** com código de mais baixo nível quando necessário.

## Por que o Kotlin foi criado?

A JetBrains criou o Kotlin para resolver dores do Java no dia a dia de quem escreve software grande:

1. **Menos boilerplate** — menos código repetitivo para fazer a mesma coisa
2. **Mais segurança** — especialmente contra `null` ([[Null Safety]])
3. **Interoperabilidade total com Java** — usar bibliotecas e código Java existentes ([[Interoperabilidade Java]])
4. **Modernidade** — lambdas, data classes, coroutines, extension functions, sem precisar “esperar o Java evoluir”
5. **Mesma JVM** — aproveitar performance, ferramentas e ecossistema já consolidados

Em outras palavras: **não** foi criada para substituir o Java na força bruta, e sim para ser uma alternativa mais agradável **dentro do mesmo mundo**.

O Google adotou Kotlin no Android (2017) e depois a tornou a linguagem preferida (2019) — isso acelerou a popularidade.

## Paradigma(s)

Kotlin é **multiparadigma**:

- **Orientada a objetos** — classes, herança, interfaces
- **Funcional** — funções de primeira classe, lambdas, imutabilidade fácil
- **Imperativa** — o estilo “passo a passo” clássico também funciona

Você mistura esses estilos conforme o problema. Relacionado: [[Classes e Objetos]] · [[Funções]] · [[Lambda e Higher-Order]]

## Para que serve

| Área | Uso |
|------|-----|
| **Android** | Linguagem oficial recomendada pelo Google |
| **Backend** | APIs e serviços (Spring, Ktor) |
| **Multiplataforma** | Kotlin Multiplatform (KMP) — compartilhar código entre Android, iOS, desktop, web |
| **Scripts** | Automação e scripts leves (`.kts`) |
| **Data / DSLs** | Gradle, build scripts, DSLs internas |

## Características principais

- Concisa — menos boilerplate que Java
- Segura — [[Null Safety]] no sistema de tipos
- Interoperável — chama código Java e vice-versa ([[Interoperabilidade Java]])
- Moderna — coroutines, data classes, extension functions
- Multiplataforma — um código, vários alvos
- Tipada de verdade — erros de tipo pegos cedo, na compilação

## Kotlin vs Java (visão rápida)

| Aspecto          | Kotlin                      | Java                                      |
| ---------------- | --------------------------- | ----------------------------------------- |
| Tipagem          | Estática e forte            | Estática e forte                          |
| Compilação       | Bytecode JVM (e outros)     | Bytecode JVM                              |
| Nível            | Alto                        | Alto                                      |
| Null             | Tratado no tipo (`String?`) | Frequentemente `NullPointerException`     |
| Verbosity        | Mais curto                  | Mais verboso                              |
| Classes de dados | `data class` nativo         | Precisa gerar equals/hashCode/toString    |
| Funções          | Cidadãs de primeira classe  | Lambdas limitadas (pré-8) / mais verbosas |
| Herança          | Classes `final` por padrão  | Classes abertas por padrão                |

## História rápida

- **2011** — Anunciada pela JetBrains
- **2016** — Kotlin 1.0 (estável)
- **2017** — Google anuncia suporte oficial no Android
- **2019** — Linguagem preferida para Android
- Hoje — amplamente usada em mobile, backend e multiplataforma

## Glossário rápido deste capítulo

| Termo | Significado |
|-------|-------------|
| **Tipagem estática** | Tipos checados na compilação |
| **Tipagem forte** | Poucas (ou nenhuma) conversões implícitas arriscadas |
| **Compilada** | Código-fonte vira bytecode/binário antes de executar |
| **JVM** | Máquina virtual que roda o bytecode (Java + Kotlin) |
| **Alto nível** | Abstrai detalhes da máquina; foca em lógica do programa |
| **Boilerplate** | Código repetitivo que “só preenche papelada” |

## Próximos passos

- [[Instalação]] — preparar o ambiente
- [[Comandos básicos]] — rodar o primeiro programa
