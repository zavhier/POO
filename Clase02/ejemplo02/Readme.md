---

## 📚 Listas en Programación Orientada a Objetos

En Programación Orientada a Objetos, las listas se utilizan para representar
**relaciones entre objetos**.

Un objeto puede:
- tener muchos objetos relacionados
- administrar un conjunto de elementos
- trabajar con colecciones dinámicas

Ejemplo conceptual:
- Un curso tiene muchos alumnos
- Una empresa tiene muchos empleados
- Una factura tiene muchos ítems

En estos casos, una lista es la estructura más adecuada.

---

## 🔗 Relación "uno a muchos"

Cuando un objeto contiene una lista de otros objetos, se dice que existe una
**relación uno a muchos**.


List como interfaz
En Java, List es una interfaz, no una clase concreta.
Esto significa que:
define qué se puede hacer
no define cómo se hace internamente

Ejemplo:
List<Persona> personas;
La implementación concreta se decide al crear el objeto.

🧱 Implementación: ArrayList
ArrayList es una implementación de la interfaz List.

Características principales:
mantiene el orden de inserción
permite elementos repetidos
permite acceso por índice
su tamaño puede crecer dinámicamente

Ejemplo:

List<Persona> personas = new ArrayList<>();

📏 Tamaño dinámico
A diferencia de los arrays tradicionales, las listas:
no requieren definir un tamaño inicial
crecen automáticamente al agregar elementos

Ejemplo:
personas.add(new Persona("Juan", 20));
personas.add(new Persona("Ana", 22));


🔍 Acceso a elementos

Los elementos de una lista se pueden acceder por índice.

Ejemplo:
Persona p = personas.get(0);
📌 El índice comienza en 0.

🔁 Recorrido de listas

La forma más común de recorrer una lista es con un for-each.

Ejemplo:
for (Persona p : personas) {
    p.presentarse();
}
Esto permite ejecutar un comportamiento sobre cada objeto almacenado.

➖ Eliminación de elementos

Las listas permiten eliminar elementos.

Ejemplo:
personas.remove(p);
personas.remove(0);


🧠 ¿Por qué usar List y no ArrayList directamente?

Es una buena práctica declarar las variables como List
y crear el objeto como ArrayList.

Ejemplo correcto:
List<Persona> personas = new ArrayList<>();
Esto permite:

cambiar la implementación en el futuro
escribir código más flexible
reducir el acoplamiento


⚠️ Validaciones en listas

Así como los objetos tienen reglas, las listas también deben cuidarse.

Ejemplo:
no permitir elementos null
evitar agregar objetos inválidos
Ejemplo:
public void agregarPersona(Persona p) {
    if (p != null) {
        personas.add(p);
    }
}


🧠 Listas y encapsulamiento
Una lista también debe ser encapsulada.
❌ Incorrecto:
public List<Persona> alumnos;
✔ Correcto:
private List<Persona> alumnos;

🧩 Listas como parte del diseño

El uso de listas no es solo técnico, es una decisión de diseño.

Preguntas típicas:

¿Este objeto tiene muchos elementos?

¿Los elementos pueden cambiar?

¿Necesito recorrerlos?

Si la respuesta es sí, una lista es una buena opción.
