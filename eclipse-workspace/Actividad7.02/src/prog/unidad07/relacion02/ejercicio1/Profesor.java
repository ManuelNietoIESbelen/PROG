package prog.unidad07.relacion02.ejercicio1;

public class Profesor extends Empleados {
  private String departamento;
  private boolean departamentoFlag = false;
  
  public Profesor(String nombre, String dni, String estadoCivil, int añoIncorporacion, String codDespacho, String departamento) {
    super(nombre, dni, estadoCivil, añoIncorporacion, codDespacho);
    this.departamento = departamento;
  }
  
  
  public void cambiarDepartamento(String departamentoNuevo) {
    this.departamento = departamentoNuevo;
    departamentoFlag = true;
  }
  
  public String toString() {
    if (departamentoFlag) {
      departamentoFlag = false;
      return "Profesor modificado: "+super.toString() + ", Departamento: " + departamento;
    }
    return "Profesor original "+super.toString() + ", Departamento: " + departamento;
  }
  
}
