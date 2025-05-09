package prog.unidad07.relacion02.ejercicio2;

public class Personal extends Empleados {
  
  private String seccion;
  
  public Personal(String nombre, String dni, String estadoCivil, int añoIncorporacion, String codDespacho, String seccion) {
    super(nombre, dni, estadoCivil, añoIncorporacion, codDespacho);
    this.seccion = seccion;    
  }

  
  public void trasladarSeccion(String nuevaSeccion) {
    this.seccion = nuevaSeccion;
  }
  
  public String toString() {
    return super.toString() + ", Sección: " + seccion+"\n";
  }
}
