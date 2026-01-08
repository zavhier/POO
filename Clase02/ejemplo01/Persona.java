/*
Con esta validación:

el objeto nunca tendrá una edad negativa

el error se evita desde el diseño

*/

public class Persona {
   private int Edad;

  public void setEdad(int edad) {
    if (edad > 0) {
        this.edad = edad;
    }
  }
}
