package prog.unidad07.ejercicio2;

public abstract class Empleado {
  protected String nombre; 
  protected String dni; 
  protected String telefono;
  
  
  /**
   * 
   * @param nombre
   * @param dni
   * @param telefono
   */
  public Empleado(String nombre, String dni, String telefono) {
    this.nombre = nombre;
    this.dni = dni;
    this.telefono = telefono;
  } 
  
  public abstract double getSalario() {
    return salario;
  }
  
}
