package prog.unidad03.seleccion;

import java.util.Scanner;

public class NombreMesesMejoraApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un numero del 1 al 12");
    int num = Integer.parseInt(sc.nextLine());

    while (num < 1 || num > 12) {
      System.out.println("Has introducido un numero erroneo, Introduce un numero del 1 al 12");
      num = Integer.parseInt(sc.nextLine());
    }
    switch (num) {
    case 1:
      System.out.println("El mes que ocupa la posicion " + num + " es Enero");
      break;
    case 2:
      System.out.println("El mes que ocupa la posicion " + num + " es Febrero");
      break;
    case 3:
      System.out.println("El mes que ocupa la posicion " + num + " es Marzo");
      break;
    case 4:
      System.out.println("El mes que ocupa la posicion " + num + " es Abril");
      break;
    case 5:
      System.out.println("El mes que ocupa la posicion " + num + " es Mayo");
      break;
    case 6:
      System.out.println("El mes que ocupa la posicion " + num + " es Junio");
      break;
    case 7:
      System.out.println("El mes que ocupa la posicion " + num + " es Julio");
      break;
    case 8:
      System.out.println("El mes que ocupa la posicion " + num + " es Agosto");
      break;
    case 9:
      System.out.println("El mes que ocupa la posicion " + num + " es Septiembre");
      break;
    case 10:
      System.out.println("El mes que ocupa la posicion " + num + " es Octubre");
      break;
    case 11:
      System.out.println("El mes que ocupa la posicion " + num + " es Nombiembre");
      break;
    case 12:
      System.out.println("El mes que ocupa la posicion " + num + " es Diciembre");
      break;
    default:
      System.out.println("El numero esta fuera del rango");
      break;
    }

  }
}
