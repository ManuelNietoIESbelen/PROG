package JuegoDeRol;

public class Personaje {
  private String nombre;
  private int vidaInicial;
  private boolean vivo = true;
  
 
  public Personaje(String nombre, int vidaInicial) {
    if (vidaInicial < 0) {
      throw new IllegalArgumentException("La vida no puede ser negativa");
    }
    
    if(nombre == null || nombre.isEmpty()) {
      throw new IllegalArgumentException("El nombre no puede ser nulo");
    }
    
    
    this.nombre = nombre;
    this.vidaInicial = vidaInicial;
    this.vivo = true;
    
  }
  
  
 }


