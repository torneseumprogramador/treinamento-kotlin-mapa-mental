# Exercício 4 — Relatório de vendas

**Arquivo sugerido:** `04-relatorio-vendas.kt`  
**Tema:** [[Lambda e Higher-Order]] — lambda, `filter` / `map` / `any` / `reduce`, higher-order

## Cenário

Loja no fim do dia. Há uma lista de vendas e o gerente quer um relatório rápido **sem** `for` manual (use as funções de collection + lambda).

## O que fazer

1. Use esta lista (pode colar no arquivo):

```kotlin
val vendas = listOf(40.0, 0.0, 85.5, 12.0, 0.0, 60.0, 200.0)
```

2. Com **lambdas**:

| Passo | Função | Resultado esperado |
|-------|--------|--------------------|
| A | `filter` | só vendas `> 0` (ignora canceladas) |
| B | `map` | aplicar 10% de bônus: `it * 1.10` |
| C | `any` | existe venda `>= 100`? |
| D | `reduce` | somar o total (das vendas filtradas **ou** já com bônus — escolha uma e documente no `println`) |

3. Crie uma **higher-order function**:

```kotlin
fun operar(a: Double, b: Double, op: (Double, Double) -> Double): Double {
    return op(a, b)
}
```

   No `main`, use para:
   - somar duas metas: `operar(1000.0, 500.0) { x, y -> x + y }`
   - multiplicar um total por taxa: `operar(total, 0.1) { x, y -> x * y }`

4. Imprima um relatório claro:

```
=== Relatório ===
Válidas: [40.0, 85.5, 12.0, 60.0, 200.0]
Com bônus: [...]
Tem venda grande? true
Total: ...
Meta combinada: 1500.0
```

5. **(Opcional)** Encadeie em pipeline:

```kotlin
vendas
    .filter { ... }
    .map { ... }
    .reduce { acc, n -> ... }
```

## Conceitos cobrados

- lambda `{ it -> ... }` / `it`
- `filter`, `map`, `any`, `reduce`
- higher-order (`(Double, Double) -> Double`)
- trailing lambda em `operar(...){ }`

## Pode usar

Conceitos dos exercícios 1–3 se quiser organizar em funções.

## Como rodar

```bash
cd Codigos/funcoes
./exec.sh exercicios/04-relatorio-vendas.kt
```
