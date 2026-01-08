# Ejemplo 03 – Constructores y Encapsulamiento

En este ejemplo se incorporan nuevos conceptos fundamentales de la
Programación Orientada a Objetos, partiendo de lo ya visto en los ejemplos anteriores.

---

## 🎯 Objetivos del ejemplo

- Comprender qué es un **constructor**
- Ver cómo se inicializa un objeto al crearlo
- Comparar una clase **sin encapsulamiento** y una **encapsulada**
- Introducir buenas prácticas de diseño en POO

---

## 🧱 ¿Qué es un constructor?

Un **constructor** es un método especial que:
- se ejecuta automáticamente al crear un objeto
- sirve para inicializar los atributos del objeto
- tiene el mismo nombre que la clase
- no tiene tipo de retorno

Ejemplo:
```java
Auto auto = new Auto("Ford", "Fiesta", 120);
