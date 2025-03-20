package prog.unidad07.ejercicio2;

import java.util.List;

public class CalculadorNomina {

  public static double calculaNominaCompleta(List<Empleado> empleados) {
    // Suma de los salarios
    double nomina = 0;
    
    // Para cada empleado
    for (Empleado empleado: empleados) {
      // Suma su salario a la nomina
      nomina += empleado.getSalario();
    }
    
    // Devuelve la nomina
    return nomina;
  }
}
