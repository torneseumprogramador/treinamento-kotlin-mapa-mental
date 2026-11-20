# Exercício 2 — Delivery: status do pedido

**Arquivo:** `02-delivery-status.kt`  
**Tema principal:** [[When]]

## Cenário

Central de delivery. O operador digita o **código do status** (1 a 5) e o sistema mostra a mensagem para o cliente. Também classifica o pedido por **faixa de valor**.

## O que fazer

### Parte A — Status (`when` com valor)

1. Peça um número de status (`Int`):
   - `1` → `"Pedido recebido"`
   - `2` → `"Em preparo"`
   - `3` → `"Saiu para entrega"`
   - `4` → `"Entregue"`
   - `5` → `"Cancelado"`
   - qualquer outro → `"Status desconhecido"`
2. Use `when` **como expressão** e guarde em `val mensagem`.

### Parte B — Dia da semana (vários valores no mesmo ramo)

3. Peça o dia (`1` = seg … `7` = dom).
4. Com `when`:
   - `1, 2, 3, 4, 5` → `"Dia útil — entrega normal"`
   - `6, 7` → `"Fim de semana — pode atrasar 20 min"`
   - `else` → `"Dia inválido"`

### Parte C — Valor do pedido (ranges + `in`)

5. Peça o valor do pedido (`Double`).
6. Com `when` e ranges:
   - `in 0.0..50.0` → `"Frete: R$ 10"`
   - `in 50.01..100.0` → `"Frete: R$ 5"`
   - acima de `100` → `"Frete grátis"`
   - negativo / inválido → `"Valor inválido"`  
   (use `else` ou `when` sem argumento se preferir)

7. Imprima tudo junto:

```
=== Delivery ===
Status: Saiu para entrega
Agenda: Dia útil — entrega normal
Frete: Frete: R$ 5
```

## Conceitos cobrados

- `when` statement / expressão
- vários valores no mesmo ramo (`1, 2, 3`)
- `in` + ranges
- `else`

## Não use ainda

`for` / `while` (próximo exercício). `if` só se for realmente necessário no frete.

## Como rodar

```bash
cd Codigos/condicionais_loops
./exec.sh 02-delivery-status/02-delivery-status.kt
```
