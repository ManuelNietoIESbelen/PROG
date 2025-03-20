package prog.unidad07.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class main {
  public static void main(String[] args) {
    CalculadorNomina calculador= new CalculadorNomina();
    
    List<Empleado> empleados = new ArrayList<>();
    

    empleados.add(new Comercial("paco","11111111a","555555555",9000));
 
    
    
    double nomina = CalculadorNomina.calculaNominaCompleta(empleados);
    
    System.out.printf("La nomina total es: %.2f euros%n",nomina);
    
    
    
    
    
  }
}

