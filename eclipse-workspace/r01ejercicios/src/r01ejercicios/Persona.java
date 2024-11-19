package r01ejercicios;

public class Persona {
  
  
  public static int nacidas;
  public int edad;
  public String nombre;
  
  
  public String aCadena() {
    return String.format("Nombre %s, edad: %d, nacidad d%", nombre,edad,nacidas);
  }
}
