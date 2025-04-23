package prog.unidad07.relacion02.ejercicio1;

public class Personal extends Empleados {
  
  private String seccion;
  private boolean seccionFlag = false;
  
  public Personal(String nombre, String dni, String estadoCivil, int añoIncorporacion, String codDespacho, String seccion) {
    super(nombre, dni, estadoCivil, añoIncorporacion, codDespacho);
    this.seccion = seccion;    
  }

  
  public void trasladarSeccion(String nuevaSeccion) {
    this.seccion = nuevaSeccion;
    seccionFlag = true;
  }
  
  public String toString() {
    if (seccionFlag) {
      seccionFlag = false;
      return "Personal modificado: "+super.toString() + ", Sección: " + seccion;
    }
    return"Personal original: "+super.toString() + ", Sección: " + seccion;
  }
}
