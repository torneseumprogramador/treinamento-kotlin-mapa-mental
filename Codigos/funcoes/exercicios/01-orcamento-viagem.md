# Exercício 1 — Orçamento de viagem

**Arquivo sugerido:** `01-orcamento-viagem.kt`  
**Tema:** [[Funções]] — declaração, single-expression, parâmetros padrão/nomeados, `Unit`

## Cenário

Agência de turismo. O sistema calcula o custo de uma viagem e imprime um resumo para o cliente.

## O que fazer

1. Crie a função (single-expression ou bloco):

```kotlin
fun custoHospedagem(diarias: Int, precoNoite: Double = 150.0): Double
```

2. Crie:

```kotlin
fun custoPassagem(destino: String, classeEconomica: Boolean = true): Double
```

   - Se `classeEconomica` → `400.0`
   - Senão → `900.0`  
   (pode usar `if` expressão; o destino pode só aparecer no recibo)

3. Crie uma função `Unit` que só imprime:

```kotlin
fun imprimirResumo(cliente: String, total: Double)
```

4. No `main`, peça (ou fixe) dados e chame as funções:
   - com parâmetros **na ordem**
   - com parâmetros **nomeados** (ex.: `precoNoite = 200.0`)
   - pelo menos uma chamada usando só o valor padrão

5. Some hospedagem + passagem e chame `imprimirResumo`.

### Saída esperada (exemplo)

```
=== Orçamento ===
Cliente: Ana
Total: R$ 1300.0
```

## Conceitos cobrados

- `fun` com retorno
- single-expression (`=`)
- parâmetro com valor padrão
- chamada nomeada
- `Unit` / `println`

## Não use ainda

`vararg`, `infix`, lambdas/`filter`/`map` (exercícios seguintes).

## Como rodar

```bash
cd Codigos/funcoes
./exec.sh exercicios/01-orcamento-viagem.kt
```
