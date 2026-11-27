# Exercício 2 — Cadastro de usuário

**Arquivo sugerido:** `02-cadastro-usuario.kt`  
**Tema:** [[Classes e Objetos]] — construtor secundário + `init` / `require`

## Cenário

App com cadastro. Dá para criar usuário só com nome, ou com nome+email, ou completo (nome+email+senha). Todo preço/idade inválido deve ser barrado no `init` de um `Produto` auxiliar — ou valide o próprio usuário.

## O que fazer

### Parte A — `Usuario` com vários construtores

1. Classe:

```kotlin
class Usuario(val nome: String) {
    var email: String = ""
    var senha: String = ""

    constructor(nome: String, email: String) : this(nome) { ... }

    constructor(nome: String, email: String, senha: String) : this(nome) { ... }
}
```

2. No `main`, crie **três** usuários, um por forma:
   - só nome
   - nome + email
   - nome + email + senha  
   Imprima os dados de cada um.

### Parte B — `Produto` com `init`

3. Crie:

```kotlin
class Produto(val nome: String, val preco: Double) {
    init {
        require(preco >= 0) { "Preço inválido" }
        require(nome.isNotBlank()) { "Nome obrigatório" }
    }
}
```

4. Crie um produto válido e mostre na tela.  
   (Opcional) Comente um `Produto("X", -1.0)` e explique o que aconteceria ao descomentar.

### Saída esperada (exemplo)

```
Usuario(nome=Ana, email=, senha=)
Usuario(nome=João, email=joao@mail.com, senha=)
Usuario(nome=Lia, email=lia@mail.com, senha=***)
Produto: Café | R$ 12.5
```

## Conceitos cobrados

- construtor primário vs secundário (`: this(...)`)
- `init`
- `require`

## Não use ainda

`object`, `companion object`, `enum`.

## Como rodar

```bash
cd Codigos/orientacao_objetos
./exec.sh exercicios/02-cadastro-usuario.kt
```
