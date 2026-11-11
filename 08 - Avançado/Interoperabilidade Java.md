---
tags:
  - kotlin
  - avancado
  - java
---

# Interoperabilidade Java

← Voltar para [[00 - Kotlin MOC]] | Relacionado: [[O que é Kotlin]] · [[Null Safety]]

## Ideia

Kotlin e Java convivem no **mesmo projeto JVM**:

- Kotlin chama Java sem esforço
- Java chama Kotlin com algumas regras

## Kotlin → Java

```kotlin
val list = ArrayList<String>() // java.util
list.add("ok")
```

Quase tudo da stdlib Java funciona direto.

## Java → Kotlin

Funções de arquivo Kotlin viram classes `ArquivoKt`:

```kotlin
// Utils.kt
fun saudacao() = "Oi"
```

```java
// Java
UtilsKt.saudacao();
```

## Anotações úteis

| Anotação | Para quê |
|----------|----------|
| `@JvmStatic` | Método estático real no companion |
| `@JvmOverloads` | Overloads Java para params default |
| `@JvmField` | Expõe campo sem getter |
| `@JvmName` | Renomeia para Java |

```kotlin
object MathUtils {
    @JvmStatic
    fun dobrar(n: Int) = n * 2
}
```

```java
MathUtils.dobrar(2);
```

## Nullability na fronteira

Tipos Java chegam como platform types. Seja explícito:

```kotlin
val nome: String? = javaUser.getName()
val seguro = nome ?: "desconhecido"
```

Use anotações Java (`@Nullable` / `@NotNull`) quando controlar o código Java.

## Getters / setters

Propriedades Kotlin mapeiam para Java beans:

```kotlin
class User(var name: String)
```

```java
user.getName();
user.setName("Ana");
```

## Quando misturar

| Cenário | Estratégia |
|---------|------------|
| Legacy Java grande | Adicione Kotlin aos poucos |
| Lib só Java | Consuma normalmente |
| API pública mista | Use `@Jvm*` conscientemente |
| Novo módulo | Prefira Kotlin puro |

## Mapa mental

```
Interop
├── Kotlin chama Java (fácil)
├── Java chama Kotlin (JvmStatic, *Kt)
├── Nullability cuidadosa
└── Migração gradual
```

## Voltar ao hub

- [[00 - Kotlin MOC]]
