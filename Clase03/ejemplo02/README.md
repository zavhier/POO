## 🧩 Tipos de datos en Java

En Java, las variables pueden almacenar distintos tipos de datos.
Es importante entender esta diferencia para trabajar correctamente
con objetos, listas y excepciones.

---

## 🔢 Tipos de datos primitivos

Los tipos de datos primitivos almacenan **valores simples**.

Ejemplos:
- `int`
- `double`
- `boolean`
- `char`

Características:
- no son objetos
- no tienen métodos
- no pueden ser `null`
- almacenan directamente el valor

Ejemplo:
```java
int edad = 20;

```

📦 Tipos de datos no primitivos (objetos)
Los tipos no primitivos son objetos.

Ejemplos:
String
Persona
Alumno
Curso

Características:
representan entidades más complejas
tienen atributos y métodos
pueden ser null
se crean con new

Ejemplo:
Persona p = new Persona("Juan", 20);


⚠️ El valor null

null representa la ausencia de un objeto.

Ejemplo:

Persona p = null;

Esto significa que:

no apunta a ningún objeto

no se puede usar hasta que se cree el objeto

❌ NullPointerException

Si intentamos usar un objeto que es null,
Java lanza una excepción llamada NullPointerException.

Ejemplo:

Persona p = null;
p.presentarse(); // ❌ error


Esto genera una excepción porque el objeto no existe.

