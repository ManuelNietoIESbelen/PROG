package pro.unidad03.repeticion;

import java.util.Scanner;

public class MayorMenorMediaApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("¿Cuantos numeros quieres introducir?");
    int cantidad = Integer.parseInt(sc.nextLine());
    double suma = 0;
    for (int i = 1; i <= cantidad; i++) {
      System.out.println("Introduce un numero");
      double num1 = Integer.parseInt(sc.nextLine());
      suma += num1;

      if (i == cantidad) {
        double media = suma / cantidad;
        System.out.printf("La media es: %f", media);
      }
    }

  }
}
