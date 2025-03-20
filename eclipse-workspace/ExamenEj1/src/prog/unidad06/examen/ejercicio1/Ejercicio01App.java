package prog.unidad06.examen.ejercicio1;

import java.util.Iterator;
import java.util.List;

public class Ejercicio01App {
  public static void main(String[] args) {
    Empleados empleados = new Empleados();
   empleados.reiniciar();
  
    
    System.out.println("\n\tLISTADO DE EMPLEADOS");
    System.out.println(" DNI      APELLIDOS,NOMBRE                 ED  SAL.   EC");
    System.out.println("------------------------------------------------------------");
      
    
    while(empleados.siguiente()!=null) {
      empleados.toSring(empleados.siguiente());
    }

    


  }
  
  private static String formatearNombre(String apellidos, String nombre) {
    String nombreCompleto = apellidos + "," + nombre;
    return String.format("%-30s", nombreCompleto);
  }
  
 
  private static String formatearDni(String dni) {
    String empleadoDni = dni;
    return String.format("%-9s", empleadoDni);
  }
  
  private static String formatearEdad(int edad) {
    int empleadoEdad = edad;
    return String.format("%2d", empleadoEdad);
  }
  
  private static String formatearSalario(double salario) {
    double empleadoSalario = salario;
    return String.format("%05.2f", empleadoSalario);
  }
  
  private static String formatear(boolean casado) {
    boolean empleadocasado = casado;
    return String.format(" %-6s", casado);
  }
  
  
}
