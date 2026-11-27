# Exercício 1 — Conta bancária

**Arquivo sugerido:** `01-conta-bancaria.kt`  
**Tema:** [[Classes e Objetos]] — classe, `val`/`var`, `private set`, métodos

## Cenário

Sistema de banco. Cada conta tem titular e saldo. O saldo só pode mudar por operações oficiais.

## O que fazer

1. Crie a classe:

```kotlin
class Conta(val titular: String, saldoInicial: Double)
```

2. Dentro dela:
   - `var saldo = saldoInicial` com **`private set`**
   - `fun depositar(valor: Double)` — só soma se `valor > 0`
   - `fun sacar(valor: Double)` — só subtrai se houver saldo suficiente
   - `fun extrato()` — imprime titular e saldo (string template)

3. No `main`:
   - crie uma conta
   - deposite, tente um saque inválido e um saque válido
   - chame `extrato()`
   - **não** tente `conta.saldo = 0` (deve ser proibido pelo `private set`)

### Saída esperada (exemplo)

```
Depósito de 50.0 ok
Saque de 500.0 negado
Saque de 30.0 ok
=== Extrato ===
Titular: Maria
Saldo: R$ 120.0
```

## Conceitos cobrados

- construtor primário
- propriedade com `private set`
- métodos que alteram estado
- encapsulamento

## Não use ainda

Construtor secundário, `object`, `companion`, `enum` (próximos exercícios).

## Como rodar

```bash
cd Codigos/orientacao_objetos
./exec.sh exercicios/01-conta-bancaria.kt
```
