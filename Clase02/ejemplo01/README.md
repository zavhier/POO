
✔️ Validaciones en setters

Un setter no solo asigna valores, también puede validarlos.

public void setEdad(int edad) {
    if (edad > 0) {
        this.edad = edad;
    }
}

Con esta validación:

el objeto nunca tendrá una edad negativa

el error se evita desde el diseño
