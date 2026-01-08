
Clase 3 – Excepciones en Java
🎯 Objetivo de la clase

En esta clase aprenderemos a:

Entender qué es una excepción

Conocer los principales tipos de excepciones

Lanzar una excepción (throw)

Manejar una excepción (try / catch)

Crear una excepción propia

❓ ¿Qué es una excepción?

Una excepción es un mecanismo que permite detener la ejecución normal del programa
cuando ocurre una situación inesperada o inválida.

Ejemplos de situaciones inválidas:

una edad negativa

un nombre vacío

dividir por cero

acceder a una posición inexistente de una lista

👉 En lugar de dejar que el programa falle, Java nos permite manejar el error.

🧠 Idea clave

Una excepción representa un error que no debería ocurrir en condiciones normales.

📂 Tipos de excepciones en Java (nivel inicial)

En Java existen muchos tipos de excepciones, pero en este nivel nos vamos a enfocar en las más importantes.
🔹 Excepciones no chequeadas (RuntimeException)

Son las más comunes y no obligan a usar try / catch.

Ejemplos:

IllegalArgumentException

NullPointerException

IndexOutOfBoundsException

Estas excepciones suelen aparecer por errores de lógica.

Ejemplo:
throw new IllegalArgumentException("Edad inválida");

🔹 Excepciones chequeadas (checked exceptions)

Son excepciones que Java obliga a manejar.

Ejemplo típico:

lectura de archivos
acceso a base de datos

🚀 Lanzar una excepción (throw)

Lanzar una excepción significa detener la ejecución normal y avisar que ocurrió un error.

Ejemplo:
if (edad <= 0) {
    throw new IllegalArgumentException("La edad debe ser mayor a 0");
}
📌 Esto se usa mucho en:

constructores
setters
métodos con reglas de negocio


🔄 Manejo de excepciones (try / catch)

El bloque try / catch permite capturar una excepción y decidir qué hacer.

Ejemplo:

try {
    Alumno a = new Alumno("", 20, 123);
} catch (IllegalArgumentException e) {
    System.out.println("Error: " + e.getMessage());
}

Si ocurre una excepción:
se interrumpe el try
se ejecuta el catch

⚠️ Importante

El try / catch no evita el error,
solo permite manejarlo de forma controlada.

🧱 Excepciones y constructores

Una práctica común es validar datos al crear el objeto.

Ejemplo:
public Alumno(String nombre, int edad) {
    if (nombre == null || nombre.isEmpty()) {
        throw new IllegalArgumentException("Nombre inválido");
    }
    this.nombre = nombre;
    this.edad = edad;
}

🧩 Crear una excepción propia

En algunos casos, las excepciones estándar no alcanzan y necesitamos una excepción más específica.

Para eso, podemos crear nuestra propia excepción.
✏️ Crear una excepción personalizada
public class AlumnoInvalidoException extends RuntimeException {

    public AlumnoInvalidoException(String mensaje) {
        super(mensaje);
    }
}

📌 Esta excepción:

hereda de RuntimeException

se usa para errores específicos de nuestro dominio
Usar la excepción propia
if (edad <= 0) {
    throw new AlumnoInvalidoException("Edad inválida");
}

🧠 Ventaja de excepciones propias

El error es más claro
El código es más legible
Se entiende mejor el problema

🧪 Ejemplo completo
try {
    Alumno a = new Alumno("", -2, 0);
} catch (AlumnoInvalidoException e) {
    System.out.println("Error en alumno: " + e.getMessage());
}


🧠 Ideas clave para estudiar

Una excepción representa un error

throw lanza una excepción

try / catch maneja una excepción

Las excepciones evitan estados inválidos

Las excepciones propias representan errores del dominio
