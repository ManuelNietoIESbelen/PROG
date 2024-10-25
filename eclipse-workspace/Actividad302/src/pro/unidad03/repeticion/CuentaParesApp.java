package pro.unidad03.repeticion;

import java.util.Scanner;

public class CuentaParesApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce la cantidad de numero pares");
    int cantidad = Integer.parseInt(sc.nextLine());
    int contadorPares = 0;
    
    while (contadorPares<=cantidad) {
     System.out.println("Introduce un numero");
      int num = Integer.parseInt(sc.nextLine());
      if (num % 2 == 0) {
      
        contadorPares=cantidad;
        System.out.printf("Te quedan %d numeros pares por introducir%n", contadorPares);
      } else {
        System.out.printf("Te quedan %d numeros pares por introducir%n", contadorPares);
      }
      
    }
    
    
      
    
    System.out.println("Ya has terminado con la lista de pares, ENHORABUENA");
  }
}
