package prog.unidad07.ejercicio2;

public class EmpleadoFijo extends Empleado {
  protected double salarioFijo; 
  
  
  public EmpleadoFijo(String nombre, String dni, String telefono, double salarioFijo) {
    super(nombre, dni, telefono);
    this.salarioFijo = salarioFijo;
  }


  @Override
  public double getSalario() {
    return salarioFijo;
  }
}
