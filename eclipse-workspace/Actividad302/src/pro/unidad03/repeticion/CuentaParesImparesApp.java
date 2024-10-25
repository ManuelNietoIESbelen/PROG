package pro.unidad03.repeticion;

import java.util.Scanner;

public class CuentaParesImparesApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("¿Cuantos numeros quieres introducir?");
    int cantidad = Integer.parseInt(sc.nextLine());

    for (int i = 1; i <= cantidad; i++) {
      System.out.println("Introduce un numero");
      int num = Integer.parseInt(sc.nextLine());
      if (num % 2 == 0) {
        System.out.printf("El numero %d es par %n%n", num);
      } else {
        System.out.printf("El numero %d es impar %n%n", num);
      }
    }
  }
}
