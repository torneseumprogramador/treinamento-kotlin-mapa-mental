---
tags:
  - kotlin
  - null-safety
---

# Null Safety

← Voltar para [[00 - Kotlin MOC]] | Relacionado: [[Tipos de dados]] · [[Lambda e Higher-Order]]

## Ideia central

Kotlin separa tipos **que podem ser null** dos que **não podem**:

```kotlin
var nome: String = "Ana"
// nome = null  // erro

var apelido: String? = "A"
apelido = null  // ok
```

Isso reduz drasticamente `NullPointerException`.

## Safe call `?.`

```kotlin
val tamanho = apelido?.length  // Int? — null se apelido for null
```

## Elvis `?:`

Valor padrão quando for null:

```kotlin
val tamanho = apelido?.length ?: 0
```

## Not-null assertion `!!`

Force o valor (perigoso — pode lançar NPE):

```kotlin
val tamanho = apelido!!.length
```

Use só quando tiver **certeza absoluta**.

## Smart cast

```kotlin
if (apelido != null) {
    println(apelido.length) // String (não-nulo) dentro do if
}
```

Cuidado: não funciona bem com `var` que outra thread/classe pode mudar — prefira `val` local.

## `let` com null

```kotlin
apelido?.let {
    println("Apelido: $it")
}
```

## `requireNotNull` / `checkNotNull`

```kotlin
fun processar(texto: String?) {
    val t = requireNotNull(texto) { "texto obrigatório" }
    println(t.uppercase())
}
```

## Plataforma types (Java)

Tipos vindos de Java são “platform types” (`String!`) — o compilador não sabe se aceitam null. Trate com cuidado:

```kotlin
val fromJava: String? = javaMetodo() // seja explícito
```

→ Ver [[Interoperabilidade Java]].

## Mapa mental

```
Null Safety
├── Tipo?          → pode ser null
├── ?.             → safe call
├── ?:             → elvis (default)
├── !!             → assertion (evitar)
├── if / smart cast
└── let / requireNotNull
```

## Exercício mental

Reescreva mentalmente:

```java
if (user != null && user.getName() != null) {
    System.out.println(user.getName().length());
}
```

Em Kotlin:

```kotlin
println(user?.name?.length ?: 0)
```
