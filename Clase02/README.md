
# Clase 2 – Reglas del Objeto y Colecciones

En esta clase se profundizan los conceptos vistos en la Clase 1 y se introducen
nuevas herramientas para trabajar con múltiples objetos de forma ordenada.

El objetivo es comenzar a escribir clases **correctas**, con **reglas claras**
y entender cómo manejar **listas de objetos**.

---

## 🎯 Objetivos de la clase

Al finalizar esta clase, el alumno debería ser capaz de:

- Crear clases con **reglas de validación**
- Entender que un objeto puede estar en un estado válido o inválido
- Comprender por qué existen las colecciones
- Utilizar `List` y `ArrayList` para manejar varios objetos
- Leer código y razonar su comportamiento

---

## 🧱 Reglas del objeto

Hasta ahora aprendimos a crear clases y objetos.  
Ahora damos un paso más importante:

👉 **Un objeto debe cuidarse a sí mismo.**

Esto significa que:
- no cualquier valor es válido
- los datos deben cumplir reglas
- las reglas viven dentro de la clase

---

## 🔐 Validaciones y encapsulamiento

Cuando usamos encapsulamiento (`private`), evitamos que los atributos se modifiquen
directamente desde afuera de la clase.

Esto nos permite **controlar los valores** que recibe el objeto.
