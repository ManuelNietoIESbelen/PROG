package prog.unidad04.practica406.principal;

import java.time.LocalDate;
import java.util.Scanner;

public class VehiculosApp {

  public static void main(String[] args) {
    
    LocalDate currentDate = LocalDate.now();  
    Scanner sc = new Scanner(System.in);
    System.out.println("PRÁCTICA DE MANUEL ÁNGEL NIETO JIMÉNEZ. GESTIÓN DE VEHÍCULOS"); 
    System.out.println("Introduce la matrícula del automovil(4 números, 0 o más espacios y tres letras mayúsculas): ");
    
    
    System.out.println("Current Date: " + currentDate);
  }

}
