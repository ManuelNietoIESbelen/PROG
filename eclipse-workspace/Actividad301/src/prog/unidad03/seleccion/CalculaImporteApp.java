package prog.unidad03.seleccion;

import java.util.Scanner;

public class CalculaImporteApp {

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Introduce el importe");
    double importe=Double.parseDouble(sc.nextLine());
    
    if(importe>100) {
      double total=importe*0.8;
      System.out.printf("Tiene un descuento por lo que el precio final es %f",total);
    }else {
      System.out.printf("No hay descuento por lo que el precio final es %f",importe);
    }
  }

}
