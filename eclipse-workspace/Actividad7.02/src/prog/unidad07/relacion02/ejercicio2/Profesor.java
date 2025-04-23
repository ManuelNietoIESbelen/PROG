package prog.unidad07.relacion02.ejercicio2;

public class Profesor extends Empleados {
  private String departamento;
  
  public Profesor(String nombre, String dni, String estadoCivil, int añoIncorporacion, String codDespacho, String departamento) {
    super(nombre, dni, estadoCivil, añoIncorporacion, codDespacho);
    this.departamento = departamento;
  }
  
  
  public void cambiarDepartamento(String departamentoNuevo) {
    this.departamento = departamentoNuevo;
  }
  
  public String toString() {
    return super.toString() + ", Departamento: " + departamento;
  }
  
}
