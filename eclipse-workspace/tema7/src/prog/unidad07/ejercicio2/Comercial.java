package prog.unidad07.ejercicio2;

public class Comercial extends Empleado {

  private static final int SALARIO_MINIMO = 300;
  private double ventas;

  public Comercial(String nombre, String dni, String telefono, double ventas) {
    super(nombre, dni, telefono);
    this.ventas = ventas;

  }

  @Override
  public double getSalario() {
    double salario = 0;

    if (ventas <= 10000) {
      salario = ventas * 0.05;
    } else if (ventas > 10000 && ventas <= 30000) {
      salario = ventas * 0.08;
    } else {
      salario = ventas * 0.1;
    }
    if (salario < SALARIO_MINIMO) {
      salario = 300;
    }
    return salario;
  }

}
