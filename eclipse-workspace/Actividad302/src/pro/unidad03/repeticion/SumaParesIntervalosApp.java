package pro.unidad03.repeticion;

import java.util.Scanner;

public class SumaParesIntervalosApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un numero");
    int num1 = Integer.parseInt(sc.nextLine());
    System.out.printf("Introduce otro numero mayor que %d %n", num1);
    int num2 = Integer.parseInt(sc.nextLine());
    int suma = 0;

    while (num1 > num2) {
      System.out.println("ERROR AL INTORDUCIR LOS NUMEROS");
      System.out.println("Introduce un numero de nuevo");
      num1 = Integer.parseInt(sc.nextLine());
      System.out.println("Introduce un numero mayor que el anterior");
      num2 = Integer.parseInt(sc.nextLine());
    }

    for (int i = num1; i <= num2; i++) {
      if (i % 2 == 0) {
        suma += i;
      }
    }

    System.out.printf("La suma de los pares entre %d y %d es %d %n", num1, num2, suma);

  }
}
