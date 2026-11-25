# Exercício 2 — Boletim da turma

**Arquivo sugerido:** `02-boletim-turma.kt`  
**Tema:** [[Funções]] — `vararg`, função local, overload (opcional)

## Cenário

Sistema escolar. O professor registra notas de vários alunos e o programa calcula médias e um boletim.

## O que fazer

1. Crie com **`vararg`**:

```kotlin
fun media(vararg notas: Double): Double
```

   Use `notas.average()` (ou some e divida).

2. Crie uma função que recebe o nome do aluno e várias notas:

```kotlin
fun boletim(aluno: String, vararg notas: Double)
```

   Dentro dela, declare uma **função local**:

```kotlin
fun conceito(m: Double): String =
    if (m >= 7.0) "Aprovado" else "Recuperação"
```

   Calcule a média chamando `media(*notas)` (spread do vararg) e imprima:

```
Aluno: Carlos
Notas: 7.0, 8.5, 6.0
Média: 7.166...
Situação: Aprovado
```

3. No `main`, chame `boletim` pelo menos **duas vezes** com quantidades diferentes de notas (2 notas, 4 notas…).

4. **(Opcional — overload)** Crie também:

```kotlin
fun media(a: Double, b: Double): Double = (a + b) / 2
```

   Mostre no `main` que o compilador escolhe a versão certa.

## Conceitos cobrados

- `vararg`
- função local
- reutilizar `media` dentro de `boletim`
- (opcional) overload

## Não use ainda

`infix`, `filter`/`map`/`reduce` (próximos).

## Como rodar

```bash
cd Codigos/funcoes
./exec.sh exercicios/02-boletim-turma.kt
```
