---
tags:
  - kotlin
  - exercicios
  - sintaxe
---

# Exercícios — Variáveis e Tipos

← Voltar para [[00 - Kotlin MOC]] | Base: [[Variáveis]] · [[Tipos de dados]]

Código em `Codigos/Exercicio/`. Rode com `./exec.sh <arquivo.kt>`.

---

## Exercício 1 — Cadastro de cliente

**Arquivo:** `01-cadastro-cliente.kt`  
**Sistema:** um mini cadastro que pergunta dados e imprime a ficha.

### O que fazer

1. Crie um `const val` com o nome do sistema (ex.: `"Sistema CRM"`).
2. Peça no terminal (use `readLine()`):
   - nome (`String`)
   - idade (`Int` — converta com `.toInt()`)
   - e-mail (`String`)
   - se é cliente VIP (`Boolean` — digite `true` ou `false` e use `.toBoolean()`)
3. Use `val` para o que não muda depois da leitura; se quiser simular uma correção de idade, use `var` e altere uma vez.
4. Mostre na tela um resumo com **string template**, no estilo:

```
=== Sistema CRM ===
Cliente: Ana
Idade: 30
E-mail: ana@email.com
VIP: true
```

### Conceitos cobrados

`const val`, `val`/`var`, `String`, `Int`, `Boolean`, conversão de tipo, string template.

---

## Exercício 2 — Pedido na loja

**Arquivo:** `02-pedido-loja.kt`  
**Sistema:** registrar um pedido simples e imprimir o recibo.

### O que fazer

1. `const val` com o nome da loja.
2. Leia do teclado:
   - nome do produto (`String`)
   - quantidade (`Int`)
   - preço unitário (`Double`)
3. Guarde a quantidade em `var` e **simule uma alteração** (ex.: o cliente pediu +1 unidade) reatribuindo a variável.
4. Calcule o total: `quantidade * precoUnitario` (o resultado deve ser `Double`).
5. Imprima um recibo com string **multilinha** (`""" ... """`) e templates, por exemplo:

```
Loja: Minha Loja
Produto: Café
Qtd: 3
Preço unit.: 8.5
Total: 25.5
```

6. (Opcional do tema) Mostre também o total como texto com `.toString()`.

### Conceitos cobrados

`const val`, `var`, `Int`, `Double`, aritmética básica, `toString()`, string multilinha + template.

---

## Exercício 3 — Sessão do app

**Arquivo:** `03-sessao-app.kt`  
**Sistema:** abrir uma sessão de usuário (login simples) usando `lateinit`.

### O que fazer

1. Crie uma classe `Sessao` com:
   - `lateinit var nomeUsuario: String`
   - `lateinit var email: String`
   - `var telefone: String? = null` (opcional — pode ficar `null`)
2. Métodos sugeridos (bem curtos):
   - `fun status()` — se `::nomeUsuario.isInitialized`, imprime os dados; senão imprime que a sessão ainda não começou
   - `fun login(nome: String, email: String)` — atribui os `lateinit`
   - `fun informarTelefone(tel: String)` — preenche o `telefone`
3. No `main`:
   - crie a sessão e chame `status()` **antes** do login
   - leia nome e e-mail do teclado e chame `login(...)`
   - pergunte o telefone; se a pessoa só apertar Enter, deixe `null`; se digitar algo, chame `informarTelefone`
   - chame `status()` de novo e mostre tudo com string template

### Conceitos cobrados

`lateinit var`, `::prop.isInitialized`, `String?`, `val`/`var` em classe, string template.

---

## Checklist antes de entregar

- [ ] Preferiu `val` quando o valor não muda
- [ ] Usou tipo explícito em pelo menos um lugar de cada exercício
- [ ] Conversões com `.toInt()` / `.toDouble()` / `.toBoolean()` onde precisa
- [ ] Não usou `if`/`when`/`for` (exceto o `if (::...isInitialized)` do exercício 3)
- [ ] Tudo roda com `./exec.sh`
