# Exercício 4 — Factory de formas + área

**Arquivo sugerido:** `04-factory-retangulo.kt`  
**Tema:** [[Classes e Objetos]] — `companion object`, construtor `private`, propriedade calculada

## Cenário

Biblioteca gráfica simples. Retângulos só podem nascer por um **factory** (companion), nunca com `Retangulo(...)` direto de fora. A área é propriedade calculada.

## O que fazer

1. Crie:

```kotlin
class Retangulo private constructor(val largura: Int, val altura: Int) {
    val area: Int
        get() = largura * altura

    val perimetro: Int
        get() = 2 * (largura + altura)

    fun descrever() {
        println("Retângulo ${largura}x${altura} | área=$area | perímetro=$perimetro")
    }

    companion object {
        fun criar(largura: Int, altura: Int): Retangulo {
            require(largura > 0 && altura > 0) { "Medidas inválidas" }
            return Retangulo(largura, altura)
        }

        fun quadrado(lado: Int): Retangulo = criar(lado, lado)
    }
}
```

2. No `main`:
   - crie com `Retangulo.criar(10, 20)` e `Retangulo.quadrado(5)`
   - chame `descrever()` nos dois
   - mostre que `Retangulo(1, 1)` **não compila** se descomentado (construtor private)
   - (opcional) tente `criar(-1, 2)` e veja o `require`

### Saída esperada (exemplo)

```
Retângulo 10x20 | área=200 | perímetro=60
Retângulo 5x5 | área=25 | perímetro=20
```

## Conceitos cobrados

- `private constructor`
- `companion object` (factory / “static”)
- `get()` em propriedades
- `require` no factory

## Pode usar

Tudo dos exercícios 1–3.

## Como rodar

```bash
cd Codigos/orientacao_objetos
./exec.sh exercicios/04-factory-retangulo.kt
```
