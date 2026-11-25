# Exercício 3 — Carrinho com DSL infix

**Arquivo sugerido:** `03-carrinho-infix.kt`  
**Tema:** [[Funções]] — `infix` (+ um pouco de classe simples)

## Cenário

E-commerce. Você quer um código que “parece frase” ao montar o pedido:

```kotlin
carrinho adiciona "Café"
carrinho adiciona "Pão"
```

## O que fazer

1. Crie a classe:

```kotlin
class Carrinho {
    private val itens = mutableListOf<String>()
    private var total = 0.0

    infix fun adiciona(produto: String) { ... }

    infix fun comPreco(preco: Double) { ... }  // soma no total (veja regra abaixo)

    fun resumo() { ... }
}
```

2. Regras sugeridas:
   - `adiciona` → guarda o nome do produto na lista e imprime `"Adicionado: X"`
   - Para o preço, use um fluxo em duas etapas **ou** simplifique assim (aceito):

```kotlin
// Versão simples aceita no exercício:
infix fun Carrinho.adiciona(item: Pair<String, Double>) {
    // item.first = nome, item.second = preço
}
```

   Exemplo de uso com `to` (infix da stdlib):

```kotlin
carrinho adiciona ("Café" to 12.5)
carrinho adiciona ("Pão" to 8.0)
```

3. Crie também **fora da classe**:

```kotlin
infix fun Int.porcentoDe(total: Double): Double = total * this / 100.0
```

   Use no resumo: desconto de `10 porcentoDe total`.

4. No `main`:
   - monte o carrinho com pelo menos 3 itens via **infix**
   - calcule desconto com `10 porcentoDe total`
   - imprima resumo (itens, total, total com desconto)

### Saída esperada (exemplo)

```
Adicionado: Café (R$ 12.5)
Adicionado: Pão (R$ 8.0)
Adicionado: Leite (R$ 6.0)
Itens: [Café, Pão, Leite]
Total: R$ 26.5
Com 10% off: R$ 23.85
```

## Conceitos cobrados

- `infix` em membro / extension
- `to` (Pair)
- diferença entre `c adiciona x` e `c.adiciona(x)`

## Não use ainda

`filter`/`map`/`reduce` (exercício 4). Pode usar `for` para listar.

## Como rodar

```bash
cd Codigos/funcoes
./exec.sh exercicios/03-carrinho-infix.kt
```
