# Exercício 3 — Caixa diário da loja

**Arquivo:** `03-caixa-diario.kt`  
**Tema principal:** [[Loops]] (`for`, ranges, `while`, `break` / `continue`)

## Cenário

Fechamento de caixa. O sistema percorre as vendas do dia, ignora cupons inválidos e para cedo se bater a meta.

## O que fazer

### Parte A — Contagem regressiva de abertura (`downTo`)

1. Imprima uma contagem `5 downTo 1` e no final `"Caixa aberto!"`.

### Parte B — Somar vendas do dia (`for` + `continue` + `break`)

2. Use este array de vendas (já pronto no `.kt`):

```kotlin
val vendas = arrayOf(40.0, 0.0, 85.5, 12.0, 0.0, 60.0, 200.0)
```

3. Defina `const val META = 150.0`.
4. Percorra com `for ((indice, valor) in vendas.withIndex())` **ou** `for (i in vendas.indices)`.
5. Regras:
   - se `valor == 0.0` → `continue` (cupom cancelado, pula)
   - some o valor em um `var total`
   - imprima cada venda válida: `"Venda #n: R$ x"`
   - se `total >= META` → imprima `"Meta atingida!"` e dê **`break`**
6. Depois do loop, mostre o `total` parcial/final.

### Parte C — Senha do gerente (`while`)

7. Senha correta: `"1234"` (pode ser `const val`).
8. Peça a senha em um `while` até acertar (máximo **3** tentativas com um contador `var`).
9. Se acertar → `"Acesso liberado ao relatório"`.  
   Se esgotar as tentativas → `"Caixa bloqueado"`.

### Saída esperada (exemplo)

```
5
4
3
2
1
Caixa aberto!
Venda #1: R$ 40.0
Venda #3: R$ 85.5
Venda #4: R$ 12.0
Venda #6: R$ 60.0
Meta atingida!
Total: R$ 197.5
Senha do gerente: ****
Acesso liberado ao relatório
```

(Os números exatos dependem de onde o `break` cortar.)

## Conceitos cobrados

- `for` + ranges (`downTo`)
- `for` em array / `indices` / `withIndex`
- `continue` e `break`
- `while` com contador
- `const val`, `var` total

## Pode usar

`if` junto com o loop (necessário para `continue`/`break`).  
Evite `when` neste exercício (já treinou no 2).

## Como rodar

```bash
cd Codigos/condicionais_loops
./exec.sh 03-caixa-diario/03-caixa-diario.kt
```
