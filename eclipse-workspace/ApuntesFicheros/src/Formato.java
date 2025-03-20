import java.util.List;

public class Formato {

  public static void main(String[] args) {
    Empleados empleados = new Empleados();
    List<Empleado> listaEmpleados = empleados.obtenerEmpleados();

    System.out.println("\n\tLISTADO DE EMPLEADOS");
    System.out.println(" DNI      APELLIDOS,NOMBRE                 ED  SAL.   EC");
    System.out.println("------------------------------------------------------------");

    if (listaEmpleados.isEmpty()) {
      System.out.println("No se encontraron empleados");
    } else {
      for (Empleado emp : listaEmpleados) {
        System.out.printf("%-9s %-30s %2d %05.2f %-6s\n", emp.getDni(),
            formatearNombre(emp.getApellidos(), emp.getNombre()), emp.getEdad(), emp.getSalario(),
            emp.getEstadoCivil());
      }
      System.out.println("\nSe listaron " + listaEmpleados.size() + " empleados");
    }
  }

  private static String formatearNombre(String apellidos, String nombre) {
    String nombreCompleto = apellidos + "," + nombre;
    return String.format("%-30s", nombreCompleto);
  }
}
