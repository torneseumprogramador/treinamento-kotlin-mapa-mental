# Exercício 3 — Pedido da loja

**Arquivo sugerido:** `03-pedido-loja.kt`  
**Tema:** [[Classes e Objetos]] — `enum`, `object` (singleton), propriedade com `get`

## Cenário

Loja online. Pedidos têm status (enum), a loja tem config global (object) e o pedido calcula o total automaticamente.

## O que fazer

1. Crie o enum:

```kotlin
enum class Status {
    PENDENTE, PAGO, ENVIADO, CANCELADO
}
```

2. Crie o singleton de configuração:

```kotlin
object LojaConfig {
    const val NOME = "Loja Kotlin"
    const val FRETE_PADRAO = 15.0
    fun saudacao() = "Bem-vindo à $NOME"
}
```

3. Crie a classe do pedido:

```kotlin
class Pedido(val cliente: String, val subtotal: Double, var status: Status = Status.PENDENTE) {
    val total: Double
        get() = subtotal + LojaConfig.FRETE_PADRAO

    fun avancarStatus() {
        // PENDENTE → PAGO → ENVIADO (não mexe se CANCELADO)
    }

    fun resumo() { ... }
}
```

4. No `main`:
   - imprima `LojaConfig.saudacao()`
   - crie um pedido, mostre `total` (propriedade calculada)
   - chame `avancarStatus()` duas vezes e imprima o `status`
   - mostre o resumo

### Saída esperada (exemplo)

```
Bem-vindo à Loja Kotlin
Cliente: Ana
Subtotal: 100.0 | Frete: 15.0 | Total: 115.0
Status: PENDENTE → PAGO → ENVIADO
```

## Conceitos cobrados

- `enum class`
- `object` (uma única instância global)
- propriedade customizada com `get()`
- métodos que mudam estado

## Não use ainda

`companion object` / factory (exercício 4). Pode usar `when` no `avancarStatus`.

## Como rodar

```bash
cd Codigos/orientacao_objetos
./exec.sh exercicios/03-pedido-loja.kt
```
