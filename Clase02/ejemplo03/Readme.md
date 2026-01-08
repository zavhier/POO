Ejercicio – Gestión de Alumnos en un Curso
🎯 Objetivo del ejercicio

Aplicar los conceptos vistos en clase:

Programación Orientada a Objetos

Encapsulamiento

Constructores

Validaciones

Uso de listas (List / ArrayList)

📌 Enunciado

Se desea desarrollar un pequeño sistema para gestionar los alumnos de un curso.

Un Curso tiene varios Alumnos y debe permitir agregar alumnos y mostrar la información de los mismos.

👤 Clase Alumno

Crear una clase Alumno que tenga los siguientes atributos:

nombre (String)

edad (int)

legajo (int)

Reglas de validación

El nombre no puede ser vacío.

La edad debe ser mayor a 0.

El legajo debe ser un número positivo.

📌 Todos los atributos deben ser privados.

Requisitos de la clase Alumno

Un constructor que reciba todos los datos.

Métodos getters para todos los atributos.

Un método mostrarDatos() que muestre la información del alumno por consola.

📚 Clase Curso

Crear una clase Curso que tenga:

una lista de alumnos (List<Alumno>)

Reglas del curso

No se deben permitir alumnos nulos.

No se deben permitir alumnos con datos inválidos.

El curso debe poder mostrar todos los alumnos cargados.

Requisitos de la clase Curso

Un constructor que inicialice la lista de alumnos.

Un método agregarAlumno(Alumno alumno) que valide antes de agregar.

Un método mostrarAlumnos() que recorra la lista y muestre los datos.

▶️ Clase Main

Crear una clase Main donde:

Se cree un objeto Curso.

Se creen varios alumnos válidos.

Se intente agregar al menos un alumno inválido.

Se muestren los alumnos cargados en el curso.

🧠 Pistas (no obligatorias)

Utilizar ArrayList para implementar la lista.

Las validaciones deben realizarse dentro de las clases, no en el main.

Pensar qué debería pasar si un alumno no cumple las reglas.
