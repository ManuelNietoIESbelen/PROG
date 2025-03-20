package prog.unidad07.relacion02.ejercicio1;

public class Empleados extends Persona {
  private int añoIncorporacion;
  private String codDespacho;
  
  public Empleados(String nombre, String dni, String estadoCivil, int añoIncorporacion, String codDespacho) {
    super(nombre, dni, estadoCivil);
    this.añoIncorporacion = añoIncorporacion;
    this.codDespacho = codDespacho;
    
  }
  
  public void cambiarDespacho(String nuevoDespacho) {
    codDespacho = nuevoDespacho;
  }
  
  public String toString() {
    return super.toString() + "\nAño de incorporación: " + añoIncorporacion + "\nCódigo de despacho: " + codDespacho;
  }

}
