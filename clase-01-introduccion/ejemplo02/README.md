
# Encapsulamiento – private, public, getters y setters

En este ejemplo se introduce el concepto de **encapsulamiento**, uno de los
principios fundamentales de la Programación Orientada a Objetos.

---

## 🎯 Objetivo

- Comprender qué significa **encapsular**
- Entender la diferencia entre `public` y `private`
- Aprender para qué sirven los métodos `get` y `set`
- Ver cómo se usan estos conceptos en una clase real

---

## 🔐 ¿Qué es el encapsulamiento?

El encapsulamiento consiste en **ocultar los datos internos de un objeto**
y permitir el acceso a ellos únicamente a través de métodos controlados.

👉 La idea principal es:
> *Los atributos no deberían ser accedidos directamente desde afuera de la clase.*

---

## 🔎 Modificadores de acceso

### 🔓 public

Un atributo o método declarado como `public`:
- puede ser accedido desde cualquier clase

Ejemplo:

public void mostrarDatos() {
    // método accesible desde afuera
}



🔒 private

Un atributo declarado como private:

solo puede ser accedido dentro de la misma clase

no es visible desde otras clases

Ejemplo:
private String marca;

Esto evita que los datos del objeto sean modificados de forma incorrecta.

🧾 Atributos privados

En una clase bien diseñada, los atributos suelen declararse como private:

private String marca;
private String modelo;
private int velocidad;

De esta forma, no se puede hacer:
auto.marca = "Ford"; // ❌ no permitido


🔁 Métodos getters y setters

Para acceder o modificar atributos privados se utilizan métodos especiales.
✏️ Setter (set)

Un setter permite asignar un valor a un atributo privado.

Ejemplo:
public void setMarca(String marca) {
    this.marca = marca;
}

📖 Getter (get)

Un getter permite obtener el valor de un atributo privado.

Ejemplo:
public String getMarca() {
    return marca;
}
System.out.println(auto.getMarca());
