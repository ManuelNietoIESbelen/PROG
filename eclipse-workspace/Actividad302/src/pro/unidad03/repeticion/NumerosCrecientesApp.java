package pro.unidad03.repeticion;

import java.util.Scanner;

public class NumerosCrecientesApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un numero entero");
    int num = Integer.parseInt(sc.nextLine());

    System.out.printf("Ahora introduce un numero mayor que %d %n", num);
    int mayor = Integer.parseInt(sc.nextLine());

    while (mayor > num) {
      System.out.printf("Ahora introduce un numero mayor que %d %n", mayor);
      mayor = Integer.parseInt(sc.nextLine());
    }
    System.out.println("El numero introducido no es mayor que el anterior");
  }
}
