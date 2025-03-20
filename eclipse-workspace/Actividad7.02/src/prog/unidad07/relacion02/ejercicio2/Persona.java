package prog.unidad07.relacion02.ejercicio2;

public class Persona {

  protected String nombre;
  protected String dni;
  protected String estadoCivil;

  public Persona(String nombre, String dni, String estadoCivil) {
    this.nombre = nombre;
    this.dni = dni;
    this.estadoCivil = estadoCivil;
  }
  
  public void cambiarEstadoCivil(String nuevoEstado) {
    estadoCivil = nuevoEstado;
  }
  
  public String getDni() {
    return dni;
  }
  
  public String toString() {
    return "Nombre: " + nombre + "\nDNI: " + dni + "\nEstado civil: " + estadoCivil;
  }
  
}
