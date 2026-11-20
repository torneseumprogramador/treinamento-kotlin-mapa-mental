# Exercício 1 — Cinema: preço do ingresso

**Arquivo:** `01-cinema-ingresso.kt`  
**Tema principal:** [[Condicionais]] (`if` / `else` / `if` como expressão)

## Cenário

Sistema de bilheteria. O atendente informa a **idade** do cliente e o sistema define o tipo de ingresso e o preço.

## O que fazer

1. Peça a idade no terminal (`readlnOrNull()?.toIntOrNull() ?: 0`).
2. Use **`if` como expressão** para definir o tipo:
   - idade `< 12` → `"Infantil"`
   - idade `< 18` → `"Meia estudante"`
   - senão → `"Inteira"`
3. Use **`if` / `else if`** (ou outro `if` expressão) para o preço:
   - Infantil → `15.0`
   - Meia estudante → `20.0`
   - Inteira → `40.0`
4. Pergunte se quer **pipoca** (`s`/`n`). Se sim, some `12.0` ao total (`if`).
5. Imprima um resumo com string template:

```
=== Bilheteria ===
Idade: 16
Ingresso: Meia estudante
Pipoca: sim
Total: R$ 32.0
```

## Conceitos cobrados

- `if` / `else` / `else if`
- `if` como expressão (retorna valor)
- `Boolean` simples para pipoca
- variáveis + templates (já estudados)

## Não use ainda

`when`, `for`, `while` (guarde para os próximos exercícios).

## Como rodar

```bash
cd Codigos/condicionais_loops
./exec.sh 01-cinema-ingresso/01-cinema-ingresso.kt
```
